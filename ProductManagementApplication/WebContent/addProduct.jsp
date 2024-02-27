<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>
	<div align="center">
		<h2>Add New Product</h2>
		<s:property value="message" />
		<s:form action="addProduct">
			<s:textfield name="name" label="Name" />
			<s:textfield name="category" label="Category" />
			<s:textfield name="price" label="Price" />
			<s:submit value="Add"></s:submit>
		</s:form>
	</div>
</body>
</html>