
<%--
  Created by IntelliJ IDEA.
  User: alyssabriggs
  Date: 1/7/20
  Time: 2:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="POST" action="/login.jsp">
    <label for="username">Username:</label>
    <input id="username" name="username" placeholder="Enter your email address" />
    <label for="password">Password:</label>
    <input id="password" name="password" type="password" placeholder="Enter your password" />
    <button type="submit">Login</button>
</form>

<h1>${param.username}</h1>
<c:if test="true">
    <h1>Variable names should be very descriptive</h1>
</c:if>
<c:if test="false">
    <h1>single letter variable names are good</h1>
</c:if>

</body>
</html>
