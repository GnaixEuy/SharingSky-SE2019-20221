<%@ page import="cn.gnaixeuy.homeworkd_20221007_.entity.Wish" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>许愿墙</title>
    <link rel="stylesheet" href="css/index.css"/>
    <script type="text/javascript" src='http://cdn.staticfile.org/jquery/1.12.4/jquery.min.js'></script>
    <script type="text/javascript" src='script/index.js'></script>
</head>
<body>
<div id='top'>
    <span id='send'></span>
</div>
<div id='main'>
    <%
        List<Wish> wishList = (List<Wish>) request.getServletContext().getAttribute("WishList");
        for (Wish item : wishList) {
    %>
    <dl class='paper a<%=(item.getId()%5+1) %>'>
        <dt>
            <span class='username'><%=item.getName()%></span>
            <span class='num'>No.<%=item.getId()%></span>
        </dt>
        <dd class='content'><%=item.getMessage()%>
        </dd>
        <dd class='bottom'>
            <span class='time'><%=item.getCreatetime()%></span>
            <a href="${pageContext.request.contextPath}/DeleteWishServlet?id=<%=item.getId()%>" class='close'></a>
        </dd>
    </dl>
    <%
        }
    %>


</div>

<div id='send-form'>
    <p class='title'>
        <span>许下你的愿望</span>
        <a href="" id='close'></a>
    </p>

    <form action="${pageContext.request.contextPath}/AddWishServlet" method="post" name='wish'>
        <p>
            <label for="username">昵称：</label>
            <input type="text" name='username' id='username'/>
        </p>

        <p>
            <label for="content">愿望：(您还可以输入&nbsp;<span id='font-num'>50</span>&nbsp;个字)
            </label>
            <textarea name="content" id='content'></textarea>
        <div id='phiz'>
            <img src="./images/phiz/zhuakuang.gif" alt="抓狂"/>
            <img src="./images/phiz/baobao.gif" alt="抱抱"/>
            <img src="./images/phiz/haixiu.gif" alt="害羞"/>
            <img src="./images/phiz/ku.gif" alt="酷"/>
            <img src="./images/phiz/xixi.gif" alt="嘻嘻"/>
            <img src="./images/phiz/taikaixin.gif" alt="太开心"/>
            <img src="./images/phiz/touxiao.gif" alt="偷笑"/>
            <img src="./images/phiz/qian.gif" alt="钱"/>
            <img src="./images/phiz/huaxin.gif" alt="花心"/>
            <img src="./images/phiz/jiyan.gif" alt="挤眼"/>
        </div>
        </p>
        <span id='send-btn' onclick="submit()"></span>
    </form>
</div>
</body>
</html>