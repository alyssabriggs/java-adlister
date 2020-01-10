<%--
  Created by IntelliJ IDEA.
  User: alyssabriggs
  Date: 1/8/20
  Time: 4:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Order Details</title>
</head>
<body>
<%
    String crust = request.getParameter("crust");
    String sauce = request.getParameter("sauce");
    String size = request.getParameter("size");
    String toppings = request.getParameter("toppings");
    String address = request.getParameter("address");
        if (crust.isEmpty() ||sauce.isEmpty() || size.isEmpty() || toppings.isEmpty() || address.isEmpty() ) {
            response.sendRedirect("/pizza-order.jsp");
        }
%>
</body>
</html>
