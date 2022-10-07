<%@ page import="java.util.Calendar" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%
    out.print("<hr>");
    out.println("helloworld");
    out.print("Hi");
    out.print("<hr>");
%>

<table border="1" width="50%" align="center">
    <tr>
        <th>日</th>
        <th>一</th>
        <th>二</th>
        <th>三</th>
        <th>四</th>
        <th>五</th>
        <th>六</th>
    </tr>
    <%
        Calendar c = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        out.print(simpleDateFormat.format(c.getTime()));
        c.set(Calendar.DAY_OF_MONTH, 1);
        int oneWeek = c.get(Calendar.DAY_OF_WEEK);
        out.println("星期:" + oneWeek);
        out.print("<tr>");
        int tmp = 0;
        for (int i = 1; i < oneWeek; i++) {
            out.println("<td>&nbsp;</td>");
            tmp++;
        }
        int max = c.getActualMaximum(Calendar.DAY_OF_MONTH);
        out.println("max: " + max);
        for (int i = 0; i < max; i++) {
            out.print("<td>" + (i + 1) + "</td>");
            tmp++;
            if (tmp % 7 == 0) {
                out.println("</tr><tr>");
            }
        }
        out.println("</tr>");
    %>
</table>
</body>
</html>