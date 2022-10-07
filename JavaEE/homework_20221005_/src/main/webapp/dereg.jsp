<%@ page import="java.nio.charset.Charset" %><%--
  Created by IntelliJ IDEA.
  User: gnaixeuy
  Date: 2022/10/5
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setCharacterEncoding("UTF-8");
    out.print(request.getParameter("name"));
    out.println(request.getParameter("password"));
    String[] channels = request.getParameterValues("channel");
    for (String channel : channels) {
        out.println(channel);
    }
%>
</body>
</html>
