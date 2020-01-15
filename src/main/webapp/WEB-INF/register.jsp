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
<form action="/register" method="post">
    <div class="row">
        <div class="col">
            <label for="username">First Name</label>
            <input type="text" id="username" name="username" class="form-control" placeholder="Pick a username">
        </div>
    </div>
    <div class="row">
        <div class="col">
            <label for="email">Email</label>
            <input type="text" id="email" name="email" class="form-control" placeholder="Email">
        </div>
        <div class="col">
            <label for="password">Title</label>
            <input type="password" id="password" name="password" class="form-control" placeholder="Password">
        </div>
    </div>
    <div><button type="submit" class="btn btn-primary">Register</button></div>
</form>
</div>
</body>
</html>
