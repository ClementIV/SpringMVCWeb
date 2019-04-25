<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: DBIS
  Date: 2019-04-25
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring Page Redirection</title>
</head>
<body>
<h2>Spring Page Redirection</h2>
<p>Click below button to redirect the result to new page</p>

<form:form method="GET" action="/SpringMVCWeb2/web/staticPage">
    <table>
        <tr>
            <td><input type="submit" value="Redirect Page"/></td>
        </tr>
    </table>
</form:form>

</body>
</html>
