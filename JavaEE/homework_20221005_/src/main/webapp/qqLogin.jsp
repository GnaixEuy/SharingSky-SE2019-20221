<%--
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
<form action="dereg.jsp" method="post">
    <table border="0" align="center">
        <tr>
            <td>账号</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <input type="checkbox" name="channel" value="邮箱">邮箱
            <input type="checkbox" name="channel" value="微博">微博 <br>
            <input type="checkbox" name="channel" value="空间">空间
            <input type="checkbox" name="channel" value="微信">微信
        </tr>
        <tr>
            <td><input type="submit" value="注册"></td>
            <td><input type="reset" value="重置"></td>
        </tr>
    </table>
</form>
</body>
</html>
