<%--
  Created by IntelliJ IDEA.
  User: alyssabriggs
  Date: 1/13/20
  Time: 9:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Session</title>
</head>
<body>
    <h1>This is the session JSP</h1>
    <h2>This is how to get the session data: <c:out value="${sessionScope.theName}"/></h2>
    <h2>You have <c:out value="${sessionScope.cart.numItems}" /> items in your cart. </h2>
</body>
</html>
