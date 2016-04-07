<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>用户管理</title>
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
            $grid = $dg.datagrid({
                width: 'auto',
                height: $(this).height() - 90,
                url: "/manage/users/findAllUserList",
                rownumbers: true,
                animate: true,
                collapsible: true,
                fitColumns: true,
                striped: true,
                border: true,
                idField: 'userId',
                singleSelect: true,
                columns: [[
                    {
                        field: 'myid',
                        title: '用户编码',
                        width: parseInt($(this).width() * 0.1),
                        align: 'left',
                        editor: "text"
                    },
                    {
                        field: 'account',
                        title: '用户账号',
                        width: parseInt($(this).width() * 0.1),
                        align: 'left',
                        editor: "text"
                    },
                    {
                        field: 'name',
                        title: '用户名',
                        width: parseInt($(this).width() * 0.1),
                        editor: {type: 'validatebox', options: {required: true}}
                    },
                    {
                        field: 'email',
                        title: '邮箱',
                        width: parseInt($(this).width() * 0.1),
                        align: 'left',
                        editor: {type: 'validatebox', options: {required: true, validType: 'email'}}
                    },
                    {field: 'tel', title: '电话', width: parseInt($(this).width() * 0.1), align: 'left', editor: "text"},
                    {
                        field: 'organizeName',
                        title: '组织部门',
                        width: parseInt($(this).width() * 0.1),
                        align: 'left',
                        editor: "text"
                    },
                    {
                        hidden: true,
                        field: 'organizeId',
                        title: '组织',
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

            $("#addUser").click(function () {
                $.modalDialog({
                    title: "添加用户",
                    width: 600,
                    height: 400,
                    href: "/manage/users/usersEditDlg",
                    buttons: [{
                        text: '保存',
                        iconCls: 'icon-yes',
                        handler: function () {
                            $.modalDialog.openner = $grid;
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

            $("#updateUser").click(function () {
                var row = $dg.datagrid('getSelected');
                if (row) {
                    $.modalDialog({
                        title: "编辑用户",
                        width: 600,
                        height: 400,
                        href: "/manage/users/usersEditDlg",
                        onLoad: function () {
                            var f = $.modalDialog.handler.find("#form");
                            f.form("load", row);
                        },
                        buttons: [{
                            text: '编辑',
                            iconCls: 'icon-yes',
                            handler: function () {
                                $.modalDialog.openner = $grid;
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

            $("#delUser").click(function () {
                var node = $dg.datagrid('getSelected');
                if (node) {
                    var rowIndex = $dg.datagrid('getRowIndex', node);
                    $.messager.confirm("提示", "确定要删除记录吗?",
                            function (result) {
                                if (result) {
                                    var request = $.ajax({
                                        url: "/manage/users/delUser",
                                        data: {
                                            'userId': node.userId
                                        },
                                        method: "POST",
                                        dataType: "JSON"
                                    });

                                    request.done(function (rsp) {
                                        if (rsp.status) {
                                            $dg.datagrid('deleteRow', rowIndex);
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
    <div class="tools">
        <ul class="toolbar">
            <shiro:hasPermission name="userAdd">
                <li id="addUser"><span><img
                        src="/resources/core/images/t01.png"/></span>添加
                </li>
            </shiro:hasPermission>
            <shiro:hasPermission name="userEdit">
                <li id="updateUser"><span><img
                        src="/resources/core/images/t02.png"/></span>修改
                </li>
            </shiro:hasPermission>
            <shiro:hasPermission name="userDel">
                <li id="delUser"><span><img
                        src="/resources/core/images/t03.png"/></span>删除
                </li>
            </shiro:hasPermission>
        </ul>
    </div>
    <table class="tablelist" id="dg"></table>

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