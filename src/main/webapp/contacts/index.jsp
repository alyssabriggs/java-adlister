<%--
  Created by IntelliJ IDEA.
  User: alyssabriggs
  Date: 1/10/20
  Time: 11:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Here Are all the Contacts!</h1>

<c:forEach var="contact" items="${contacts}">
    <div class="col-md-6">
        <h2>${contact.firstName} ${contact.lastName}</h2>
        <p>${contact.phoneNumber}</p>
    </div>
</c:forEach>
</body>
</html>
