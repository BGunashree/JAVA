<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>
<body>
<form action="product" method="post">
<pre>
Company Name<input type="text" name="cname"/ value="${dto.companyName}">
Product Name<input type="text" name="pname"/ value="${dto.productName}">
Product Type<select  name="types" value="${dto.productType}">
<option>Select</option>
<option>Kitchen</option>
<option>Washing machine</option>
<option>Furniture</option>
<option>Footwear</option>

</select>
Product Quantity<input type="number" name="quantity"/  value="${dto.productQuantity}">
Cost<input type="number"  name="cost"/ value="${dto.productCost}" >
<input type="submit" value="submit"/>
</pre>
</form>
<span style="color:green">${productName} ${t} ${total}
<span style="color:red">${dto} ${validationError}
</body>
</html>