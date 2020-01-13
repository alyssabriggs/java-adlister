<%--
  Created by IntelliJ IDEA.
  User: alyssabriggs
  Date: 1/13/20
  Time: 10:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Access Page</title>
</head>
<body>
    <h1>Access PAge</h1>
    <form action="/admin" method="post">
        <label for="code">Enter the admin access code: </label>
        <input type="password" id="code" name="code">
    </form>
</body>
</html>
