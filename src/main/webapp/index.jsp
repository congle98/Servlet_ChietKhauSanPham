<%--
  Created by IntelliJ IDEA.
  User: CONG
  Date: 5/21/2021
  Time: 11:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Tính chiết khấu</title>
  </head>
  <body>
  <form method="post" action="/ProductDiscountCalculatorServlet">
    <label>Mô tả sản phẩm</label>
    <input type="text" name="describe"> <br>
    <label>Giá niêm yết</label>
    <input type="text" name="price" placeholder="10000"> <br>
    <label>Tỷ lệ chiết khấu</label>
    <input type="text" name="percent" placeholder="5"> <br>
    <button type="submit">Tính chiết khấu</button>
  </form>
  </body>
</html>
