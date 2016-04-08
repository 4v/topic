<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>组织管理</title>
    <script type="text/javascript" src="/resources/public/js/jquery.js"></script>
    <link href="/resources/core/css/style.css" rel="stylesheet" type="text/css"/>
    <link rel="stylesheet" type="text/css" href="/resources/public/css/easyui.css">
    <link rel="stylesheet" type="text/css" href="/resources/public/css/icon.css">
    <script type="text/javascript" src="/resources/public/js/jquery.easyui.min.js"></script>
    <link rel="stylesheet" type="text/css" href="/resources/check/css/common.css">
    <script type="text/javascript" src="/resources/check/js/jqueryUtil.js"></script>
    <script type="text/javascript">
        var $dg;
        var $grid;
        $(function () {
            $dg = $("#dg");
            $grid = $dg.treegrid({
                width: 'auto',
                height: $(this).height() - 17,
                url: "/manage/organ/findAllOrganList",
                rownumbers: true,
                animate: true,
                fitColumns: true,
                striped: true,
                border: true,
                idField: 'organizationId',
                treeField: 'fullName',
                frozenColumns: [[{
                    title: '组织名称',
                    field: 'fullName',
                    editor: {
                        type: 'validatebox',
                        options: {
                            required: true
                        }
                    },
                    width: parseInt($(this).width() * 0.20),
                    formatter: function (value) {
                        return '<span style="color:red">' + value + '</span>';
                    }
                }]],
                columns: [[{
                    field: 'myId',
                    title: '组织编码',
                    width: parseInt($(this).width() * 0.08),
                    align: 'center'
                }, {
                    field: 'ename',
                    title: '英文名称',
                    width: parseInt($(this).width() * 0.12),
                    align: 'center'
                }, {
                    field: 'companyName',
                    title: '所属公司名称',
                    width: parseInt($(this).width() * 0.1),
                    align: 'center'
                }, {
                    field: 'tel',
                    title: '电话',
                    width: parseInt($(this).width() * 0.1),
                    align: 'center'
                }, {
                    field: 'fax',
                    title: '传真',
                    width: parseInt($(this).width() * 0.1),
                    align: 'center'
                },{
                    field: 'empQty',
                    title: '编制人员数',
                    width: parseInt($(this).width() * 0.1),
                    align: 'center'
                }, {
                    field: 'description',
                    title: '组织描述',
                    width: parseInt($(this).width() * 0.2),
                    align: 'left',
                    editor: "text"
                }]],
                toolbar: '#tb'
            });

            $("#addOrgan").click(function () {
                var row = $dg.treegrid('getSelected');

                $.modalDialog({
                    title: "添加组织",
                    width: 600,
                    height: 400,
                    href: "/manage/organ/organEditDlg",
                    onLoad: function () {
                        if (row) {
                            var f = $.modalDialog.handler.find("#form");
                            f.form("load", {
                                "pid": row.organizationId
                            });
                        }
                    },
                    buttons: [{
                        text: '保存',
                        iconCls: 'icon-yes',
                        handler: function () {
                            $.modalDialog.openner = $grid; //因为添加成功之后，需要刷新这个treegrid，所以先预定义好
                            var f = $.modalDialog.handler.find("#form");
                            f.submit();
                        }
                    }, {
                        text: '取消',
                        iconCls: 'icon-no',
                        handler: function () {
                            $.modalDialog.handler.dialog('destroy');
                            $.modalDialog.handler = undefined;
                        }
                    }
                    ]
                });
            });

            $("#updateOrgan").click(function () {
                var row = $dg.treegrid('getSelected');
                if (row) {
                    $.modalDialog({
                        title: "编辑程式",
                        width: 600,
                        height: 400,
                        href: "/manage/organ/organEditDlg",
                        onLoad: function () {
                            var f = $.modalDialog.handler.find("#form");
                            f.form("load", row);
                        },
                        buttons: [{
                            text: '编辑',
                            iconCls: 'icon-yes',
                            handler: function () {
                                $.modalDialog.openner = $grid; //因为添加成功之后，需要刷新这个treegrid，所以先预定义好
                                var f = $.modalDialog.handler.find("#form");
                                f.submit();
                            }
                        },
                            {
                                text: '取消',
                                iconCls: 'icon-no',
                                handler: function () {
                                    $.modalDialog.handler.dialog('destroy');
                                    $.modalDialog.handler = undefined;
                                }
                            }]
                    });
                } else {
                    $.messager.show({
                        title: "提示",
                        msg: "请选择一行记录!",
                        timeout: 1000 * 2
                    });
                }
            });

            $("#delOrgan").click(function () {
                var node = $dg.treegrid('getSelected');
                if (node) {
                    $.messager.confirm("提示", "确定要删除记录吗?",
                            function (result) {
                                if (result) {
                                    var request = $.ajax({
                                        url: "/manage/organ/delOrgan",
                                        data: {
                                            'id': node.organizationId
                                        },
                                        method: "POST",
                                        dataType: "JSON"
                                    });

                                    request.done(function (rsp) {
                                        if (rsp.status) {
                                            $dg.treegrid('remove', node.organizationId);
                                        }
                                        $.messager.show({
                                            title: rsp.title,
                                            msg: rsp.message,
                                            timeout: 1000 * 2
                                        });
                                    });

                                    request.fail(function () {
                                        $.messager.show({
                                            title: "提示",
                                            msg: "提交错误了！",
                                            timeout: 1000 * 2
                                        });
                                    });
                                }
                            });
                } else {
                    $.messager.show({
                        title: "提示",
                        msg: "请选择一行记录!",
                        timeout: 1000 * 2
                    });
                }
            });
        });
    </script>
</head>
<body>
<div class="rightinfo">
    <div class="easyui-layout" id="tb">
        <ul class="toolbar">
            <shiro:hasPermission name="organAdd">
                <li id="addOrgan"><span><img
                        src="/resources/core/images/t01.png"/></span>添加
                </li>
            </shiro:hasPermission>
            <shiro:hasPermission name="organEdit">
                <li id="updateOrgan"><span><img
                        src="/resources/core/images/t02.png"/></span>修改
                </li>
            </shiro:hasPermission>
            <shiro:hasPermission name="organDel">
                <li id="delOrgan"><span><img
                        src="/resources/core/images/t03.png"/></span>删除
                </li>
            </shiro:hasPermission>
        </ul>
    </div>
    <table class="tablelist" id="dg" title="组织"></table>

    <div class="tip">
        <div class="tiptop">
            <span>提示信息</span><a></a>
        </div>
        <div class="tipinfo">
            <span><img src="/resources/core/images/ticon.png"/></span>
            <div class="tipright">
                <p>是否确认对信息的修改 ？</p>
                <cite>如果是请点击确定按钮 ，否则请点取消。</cite>
            </div>
        </div>
        <div class="tipbtn">
            <input name="" type="button" class="sure" value="确定"/>&nbsp; <input
                name="" type="button" class="cancel" value="取消"/>
        </div>
    </div>
</div>

</body>
</html>