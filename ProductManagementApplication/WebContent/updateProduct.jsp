<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Product</title>
</head>
<body>
<div align="center">
		<h2>Update Product</h2>
		<s:property value="message" />
		<s:form action="updateProduct">
			<s:textfield name="id" label="Id" value="%{id}" readonly="true"/>
			<s:textfield name="name" label="Name" value="%{name}" />
			<s:textfield name="category" label="Category" value="%{category}" />
			<s:textfield name="price" label="Price" value="%{price}" />
			<s:submit value="Update"></s:submit>
		</s:form>
	</div>
</body>
</html>