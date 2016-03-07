<%@ page language="java" pageEncoding="utf-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<script type="text/javascript">
    $(function () {
        //顶部导航切换
        $(".nav li a").click(function () {
            $(".nav li a.selected").removeClass("selected")
            $(this).addClass("selected");
        });
    });
</script>
<div class="topleft">
    <a href="javascript:void(0);" target="_parent"><img
            src="<%=basePath%>resources/core/images/logo.png" title="系统首页"/></a>
</div>

<ul class="nav">
    <li><a href="javascript:void(0);" target="rightFrame"
           class="selected"><img
            src="<%=basePath%>resources/core/images/icon01.png" title="工作台"/>
        <h2>工作台</h2></a></li>
    <li><a href="javascript:void(0);" target="rightFrame"><img
            src="<%=basePath%>resources/core/images/icon02.png" title="模型管理"/>
        <h2>模型管理</h2></a></li>
    <li><a href="javascript:void(0);" target="rightFrame"><img
            src="<%=basePath%>resources/core/images/icon03.png" title="模块设计"/>
        <h2>模块设计</h2></a></li>
    <li><a href="javascript:void(0);" target="rightFrame"><img
            src="<%=basePath%>resources/core/images/icon04.png" title="常用工具"/>
        <h2>常用工具</h2></a></li>
    <li><a href="javascript:void(0);" target="rightFrame"><img
            src="<%=basePath%>resources/core/images/icon05.png" title="文件管理"/>
        <h2>文件管理</h2></a></li>
    <li><a href="javascript:void(0);" target="rightFrame"><img
            src="<%=basePath%>resources/core/images/icon06.png" title="系统设置"/>
        <h2>系统设置</h2></a></li>
</ul>

<div class="topright">
    <ul>
        <li><a href="#">关于</a></li>
        <li><a href="#" target="_parent">退出</a></li>
    </ul>
    <div class="user">
        <span>欢迎${currUser}登录</span>
    </div>
</div>