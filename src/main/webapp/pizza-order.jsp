<%--
  Created by IntelliJ IDEA.
  User: alyssabriggs
  Date: 1/8/20
  Time: 4:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Order a Pizza!</title>
</head>
    <body>
        <form action="/display-order.jsp" method="post">
            <label for="crust">Crust</label>
            <input type="text" name="crust" id="crust">
            <br>

            <label for="sauce">Sauce</label>
            <input type="text" name="sauce" id="sauce">
            <br>

            <label for="size">Size</label>
            <select name="size" id="size">
                <option value="small">Small</option>
                <option value="medium">Medium</option>
                <option value="large">Large</option>
                <option value="x-large">X-Large</option>
            </select>
            <br>

            <input type="checkbox" name="toppings" id="pep">Pepperoni
            <input type="checkbox" name="toppings" id="ham">Pepperoni
            <input type="checkbox" name="toppings" id="bacon">Pepperoni
            <input type="checkbox" name="toppings" id="peppers">Pepperoni
            <input type="checkbox" name="toppings" id="pineapple">Pepperoni
            <input type="checkbox" name="toppings" id="mushroom">Pepperoni
            <br>

            <label for="address">Address</label>
            <input type="text" name="address" id="address">
            <br>

            <button>Submit</button>
        </form>
    </body>
</html>
