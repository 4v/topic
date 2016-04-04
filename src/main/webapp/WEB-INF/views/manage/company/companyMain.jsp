<%--
  Created by IntelliJ IDEA.
  User: Dyenigma
  Date: 2016/4/4
  Time: 8:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html>
<html>
<head>
    <title>公司管理</title>
    <script type="text/javascript" src="/resources/public/js/jquery.js"></script>
    <link href="/resources/core/css/style.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" type="text/css" href="/resources/public/css/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="/resources/public/css/icon.css"/>
    <script type="text/javascript" src="/resources/public/js/jquery.easyui.min.js"></script>
    <link rel="stylesheet" type="text/css" href="/resources/check/css/common.css"/>
    <script type="text/javascript" src="/resources/check/js/jqueryUtil.js"></script>
    <script type="text/javascript">
        var $dg;
        var $grid;
        $(function () {
            $dg = $("#dg");
            $grid = $dg.datagrid({
                url: "/manage/comp/findComp",
                width: 'auto',
                height: $(this).height() - 85,
                pagination: true,
                rownumbers: true,
                border: true,
                striped: true,
                singleSelect: true,
                columns: [[{
                    field: 'name',
                    title: '公司名称',
                    width: parseInt($(this).width() * 0.1),
                    editor: {type: 'validatebox', options: {required: true}}
                },
                    {field: 'tel', title: '公司电话', width: parseInt($(this).width() * 0.1), editor: "validatebox"},
                    {field: 'fax', title: '传真', width: parseInt($(this).width() * 0.1), align: 'left', editor: "text"},
                    {
                        field: 'address',
                        title: '地址',
                        width: parseInt($(this).width() * 0.1),
                        align: 'left',
                        editor: "text"
                    },
                    {
                        field: 'zip',
                        title: '邮政编码',
                        width: parseInt($(this).width() * 0.1),
                        align: 'left',
                        editor: "text"
                    },
                    {
                        field: 'email',
                        title: '邮箱',
                        width: parseInt($(this).width() * 0.1),
                        align: 'left',
                        editor: {type: 'validatebox', options: {required: true, validType: 'email'}}
                    },
                    {
                        field: 'contact',
                        title: '联系人',
                        width: parseInt($(this).width() * 0.1),
                        align: 'left',
                        editor: "text"
                    },
                    {
                        field: 'manager',
                        title: '负责人',
                        width: parseInt($(this).width() * 0.1),
                        align: 'left',
                        editor: "text"
                    },
                    {
                        field: 'bank',
                        title: '开户行',
                        width: parseInt($(this).width() * 0.1),
                        align: 'left',
                        editor: "text"
                    },
                    {
                        field: 'bankaccount',
                        title: '开户行账号',
                        width: parseInt($(this).width() * 0.1),
                        align: 'left',
                        editor: "text"
                    },
                    {
                        field: 'description',
                        title: '描述',
                        width: parseInt($(this).width() * 0.1),
                        align: 'left',
                        editor: "text"
                    }
                ]], toolbar: '#tb'
            });
        });
        function endEdit() {
            var flag = true;
            var rows = $dg.datagrid('getRows');
            for (var i = 0; i < rows.length; i++) {
                $dg.datagrid('endEdit', i);
                var temp = $dg.datagrid('validateRow', i);
                if (!temp) {
                    flag = false;
                }
            }
            return flag;
        }
        function addRows() {
            $dg.datagrid('appendRow', {});
            var rows = $dg.datagrid('getRows');
            $dg.datagrid('beginEdit', rows.length - 1);
        }
        function editRows() {
            var rows = $dg.datagrid('getSelections');
            $.each(rows, function (i, row) {
                if (row) {
                    var rowIndex = $dg.datagrid('getRowIndex', row);
                    $dg.datagrid('beginEdit', rowIndex);
                }
            });
        }
        function removeRows() {
            var rows = $dg.datagrid('getSelections');
            $.each(rows, function (i, row) {
                if (row) {
                    var rowIndex = $dg.datagrid('getRowIndex', row);
                    $dg.datagrid('deleteRow', rowIndex);
                }
            });
        }
        function saveRows() {
            if (endEdit()) {
                if ($dg.datagrid('getChanges').length) {
                    var inserted = $dg.datagrid('getChanges', "inserted");
                    var deleted = $dg.datagrid('getChanges', "deleted");
                    var updated = $dg.datagrid('getChanges', "updated");

                    var effectRow = new Object();
                    if (inserted.length) {
                        effectRow["inserted"] = JSON.stringify(inserted);
                    }
                    if (deleted.length) {
                        effectRow["deleted"] = JSON.stringify(deleted);
                    }
                    if (updated.length) {
                        effectRow["updated"] = JSON.stringify(updated);
                    }
                    $.post("companyInfo/companyInfoAction!persistenceCompanyInfo.action", effectRow, function (rsp) {
                        if (rsp.status) {
                            $dg.datagrid('acceptChanges');
                        }
                        $.messager.alert(rsp.title, rsp.message);
                    }, "JSON").error(function () {
                        $.messager.alert("提示", "提交错误了！");
                    });
                }
            } else {
                $.messager.alert("提示", "字段验证未通过!请查看");
            }
        }
        //删除
        function delRows() {
            var row = $dg.datagrid('getSelected');
            if (row) {
                var rowIndex = $dg.datagrid('getRowIndex', row);
                parent.$.messager.confirm("提示", "确定要删除记录吗?", function (r) {
                    if (r) {
                        $dg.datagrid('deleteRow', rowIndex);
                        $.ajax({
                            url: "companyInfo/companyInfoAction!delCompanyInfo.action",
                            data: "companyId=" + row.companyId,
                            success: function (rsp) {
                                parent.$.messager.show({
                                    title: rsp.title,
                                    msg: rsp.message,
                                    timeout: 1000 * 2
                                });
                            }
                        });
                    }
                });
            } else {
                parent.$.messager.show({
                    title: "提示",
                    msg: "请选择一行记录!",
                    timeout: 1000 * 2
                });
            }
        }
        //弹窗修改
        function updRowsOpenDlg() {
            var row = $dg.datagrid('getSelected');
            if (row) {
                parent.$.modalDialog({
                    title: '编辑公司',
                    width: 600,
                    height: 400,
                    href: "/manage/company/companyEditDlg",
                    onLoad: function () {
                        var f = parent.$.modalDialog.handler.find("#form");
                        f.form("load", row);
                    },
                    buttons: [{
                        text: '编辑',
                        iconCls: 'icon-ok',
                        handler: function () {
                            parent.$.modalDialog.openner = $grid;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
                            var f = parent.$.modalDialog.handler.find("#form");
                            f.submit();
                        }
                    }, {
                        text: '取消',
                        iconCls: 'icon-cancel',
                        handler: function () {
                            parent.$.modalDialog.handler.dialog('destroy');
                            parent.$.modalDialog.handler = undefined;
                        }
                    }
                    ]
                });
            } else {
                parent.$.messager.show({
                    title: "提示",
                    msg: "请选择一行记录!",
                    timeout: 1000 * 2
                });
            }
        }
        //弹窗增加公司
        function addRowsOpenDlg() {
            parent.$.modalDialog({
                title: '添加公司',
                width: 600,
                height: 400,
                href: '/manage/company/companyEditDlg',
                buttons: [{
                    text: '保存',
                    iconCls: 'icon-ok',
                    handler: function () {
                        parent.$.modalDialog.openner = $grid;//因为添加成功之后，需要刷新这个dataGrid，所以先预定义好
                        var f = parent.$.modalDialog.handler.find("#form");
                        f.submit();
                    }
                }, {
                    text: '取消',
                    iconCls: 'icon-cancel',
                    handler: function () {
                        parent.$.modalDialog.handler.dialog('destroy');
                        parent.$.modalDialog.handler = undefined;
                    }
                }
                ]
            });
        }

        //高级搜索 删除 row
        function tbCompanySearchRemove(curr) {
            $(curr).closest('tr').remove();
        }

        //excel导出
        function exportExcel() {
            var rows = $dg.datagrid("getRows");
            if (rows.length) {
                var isCheckedIds = [];
                $.each(rows, function (i, row) {
                    if (row) {
                        isCheckedIds.push(row.companyId);
                    }
                });
                window.location.href = "excel/excelAction!CompanyInfoExcelExport.action?isCheckedIds=" + isCheckedIds;
            } else {
                parent.$.messager.show({
                    title: "提示",
                    msg: "暂无导出数据!",
                    timeout: 1000 * 2
                });
            }
        }
    </script>
</head> 
<body>
<div class="rightinfo">
    <div class="tools">
        <ul class="toolbar">
            <shiro:hasPermission name="compAdd">
                <li id="addComp"><span><img
                        src="/resources/core/images/t01.png"/></span>添加
                </li>
            </shiro:hasPermission>
            <shiro:hasPermission name="compEdit">
                <li id="updateComp"><span><img
                        src="/resources/core/images/t02.png"/></span>修改
                </li>
            </shiro:hasPermission>
            <shiro:hasPermission name="compDel">
                <li id="delComp"><span><img
                        src="/resources/core/images/t03.png"/></span>删除
                </li>
            </shiro:hasPermission>
            <li id="toExcel">
            <span><img
                    src="/resources/core/images/excel.png"/></span>导出Excel
            </li>
        </ul>
    </div>

    <table id="dg" title="公司管理"></table>
</div>
</body>
</html>

