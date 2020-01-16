<%--
  Created by IntelliJ IDEA.
  User: alyssabriggs
  Date: 1/15/20
  Time: 3:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Register" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />
<div class="container">
    <h1>Register Below: </h1>
<form action="/register" method="post" class="form-inline">
        <div class="form-group mb-2">
            <label for="username" class="sr-only">Username</label>
            <input type="username" class="form-control" id="username" placeholder="Username">
        </div>
        <div class="form-group mb-2">
            <label for="email" class="sr-only">Email</label>
            <input type="email" class="form-control" id="email" placeholder="Email">
        </div>
        <div class="form-group mx-sm-3 mb-2">
            <label for="inputPassword2" class="sr-only">Password</label>
            <input type="password" class="form-control" id="inputPassword2" placeholder="Password">
        </div>
    <button type="submit" class="btn btn-primary">Register</button>
</form>
</div>
</body>
</html>
