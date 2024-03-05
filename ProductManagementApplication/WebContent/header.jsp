<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Header</title>
<link rel="stylesheet" href="style.css">
</head>
<body>

	<%
	if (session.getAttribute("loggedinUser") == null) 
	{
		response.sendRedirect("welcome.jsp");
	}
	%>

	<div>
		<ul>
			<li><a href="product">Products</a></li>
			<li><a href="addProduct.jsp">Add Product</a></li>
			<li style="float: right"><a href="welcome.jsp">Logout</a></li>
		</ul>
	</div>
</body>
</html>