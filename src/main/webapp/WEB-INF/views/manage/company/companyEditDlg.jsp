<%--
  Created by IntelliJ IDEA.
  User: Dyenigma
  Date: 2016/4/4
  Time: 8:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript">
    $(function () {
        $("#form").form({
            url: "/manage/comp/saveOrUpdateComp",
            onSubmit: function () {
                $.messager.progress({
                    title: '提示',
                    text: '数据处理中，请稍后....'
                });
                var isValid = $(this).form('validate');
                if (!isValid) {
                    $.messager.progress('close');
                }
                return isValid;
            },
            success: function (result) {
                $.messager.progress('close');
                result = $.parseJSON(result);
                if (result.status) {
                    $.modalDialog.openner.datagrid('reload');//之所以能在这里调用到parent.$.modalDialog.openner_datagrid这个对象，是因为role.jsp页面预定义好了
                    $.modalDialog.handler.dialog('close');
                    $.messager.show({
                        title: result.title,
                        msg: result.message,
                        timeout: 1000 * 2
                    });
                } else {
                    $.messager.show({
                        title: result.title,
                        msg: result.message,
                        timeout: 1000 * 2
                    });
                }
            }
        });
    });
</script>
<style>
    .easyui-textbox {
        height: 18px;
        width: 170px;
        line-height: 16px;
        /*border-radius: 3px 3px 3px 3px;*/
        box-shadow: 0 1px 1px rgba(0, 0, 0, 0.075) inset;
        transition: border 0.2s linear 0s, box-shadow 0.2s linear 0s;
    }

    textarea:focus, input[type="text"]:focus {
        border-color: rgba(82, 168, 236, 0.8);
        box-shadow: 0 1px 1px rgba(0, 0, 0, 0.075) inset, 0 0 8px rgba(82, 168, 236, 0.6);
        outline: 0 none;
    }

    table {
        background-color: transparent;
        border-collapse: collapse;
        border-spacing: 0;
        max-width: 100%;
    }

    fieldset {
        border: 0 none;
        margin: 0;
        padding: 0;
    }

    legend {
        -moz-border-bottom-colors: none;
        -moz-border-left-colors: none;
        -moz-border-right-colors: none;
        -moz-border-top-colors: none;
        border-image: none;
        border: 0 none #E5E5E5;
        border-bottom: 1px solid;
        color: #999999;
        line-height: 20px;
        display: block;
        margin-bottom: 10px;
        padding: 0;
        width: 100%;
    }

    input, textarea {
        font-weight: normal;
    }

    table, th, td {
        text-align: left;
        padding: 6px;
    }
</style>
<div class="easyui-layout" data-options="fit:true,border:false">
    <div data-options="region:'center',border:false" title="" style="overflow: hidden;padding: 10px;">
        <form id="form" method="post">
            <fieldset>
                <legend><img src="/resources/core/images/fromedit.png" style="margin-bottom: -3px;"/> 公司编辑</legend>
                <input name="companyId" id="companyId" type="hidden"/>
                <input name="created" id="created" type="hidden"/>
                <input name="creater" id="creater" type="hidden"/>
                <input name="status" id="status" type="hidden"/>
                <table>
                    <tr>
                        <th>公司名称</th>
                        <td><input name="name" id="name"  class="easyui-textbox easyui-validatebox"
                                   type="text"/></td>
                        <th>负责人</th>
                        <td><input id="manager" name="manager"  type="text" class="easyui-textbox easyui-validatebox"
                                   required="required"/></td>
                    </tr>
                    <tr>
                        <th>公司地址</th>
                        <td><input id="address" name="address" type="text"
                                   class="easyui-textbox easyui-validatebox"
                                   required="required" /></td>
                        <th>邮编</th>
                        <td><input id="zip" name="zip" type="text"
                                   class="easyui-textbox easyui-validatebox"
                                   required="required" /></td>
                    </tr>
                    <tr>
                        <th>联系电话</th>
                        <td><input name="tel" id="tel" type="text" class="easyui-textbox easyui-validatebox"
                                   data-options="required:true" /></td>
                        <th>联系人</th>
                        <td><input id="contact" name="contact" type="text" class="easyui-textbox easyui-validatebox"
                                   required="required" /></td>
                    </tr>
                    <tr>
                        <th>电子邮箱</th>
                        <td><input id="email" name="email" type="text" class="easyui-textbox easyui-validatebox"
                                   required="required"/></td>
                        <th>传真</th>
                        <td><input name="fax" id="fax" type="text" class="easyui-textbox easyui-validatebox"
                                   required="required"/></td>
                    </tr>
                    <tr>
                        <th>开户行</th>
                        <td><input id="bank" name="bank" type="text" class="easyui-textbox easyui-validatebox"
                                   required="required" /></td>
                        <th>开户账号</th>
                        <td><input id="bankaccount" name="bankaccount" type="text"
                                   class="easyui-textbox easyui-validatebox" required="required" /></td>
                    </tr>
                    <tr>
                        <th>描述</th>
                        <td colspan="3"><textarea class="easyui-textbox" name="description"
                                                  style="width: 420px;height: 100px;"></textarea></td>
                    </tr>
                </table>
            </fieldset>
        </form>
    </div>
</div>

