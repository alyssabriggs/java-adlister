
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
<body class="container">
<%@ include file="/partials/head.jsp" %>
<form method="POST" action="/login.jsp">
    <label for="username">Username:</label>
    <input id="username" name="username" placeholder="Enter username" /><br>
    <label for="password">Password:</label>
    <input id="password" name="password" type="password" placeholder="Enter password" /><br>
    <button type="submit">Login</button>
</form>

<c:choose>
<c:when test="${param.username == 'admin' && param.password == 'password'}">
    <%
        response.sendRedirect("/profile.jsp");
    %>
</c:when>
<c:when test="${param.username != 'admin' && param.username != null || param.password != 'password' &&param.password !=
null}">
    <%
        response.sendRedirect("/login.jsp");
    %>
</c:when>
<c:otherwise>
    <h1>Welcome!</h1>
</c:otherwise>
</c:choose>

</body>
</html>
