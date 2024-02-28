<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
</head>
<body>
	<div align="center">
		<h2>Product List</h2>
		<s:property value="message" />
		<table border="" width="500">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Category</th>
				<th>Price</th>
				<th colspan="2">Action</th>
			</tr>
			<s:iterator value="products" var="product">
				<tr>
					<td><s:property value="#product.id" /></td>
					<td><s:property value="#product.name" /></td>
					<td><s:property value="#product.category" /></td>
					<td><s:property value="#product.price" /></td>
					<td><a
						href="uploadProduct?id=<s:property value="#product.id" />">
							<button>Update</button>
					</a></td>
					<td>
					<a href="deleteProduct?id=<s:property value="#product.id" />">
					<button>Delete</button>
					</a>
					</td>
				</tr>
			</s:iterator>
		</table>
	</div>
	<div align="center">
		<a href="addProduct.jsp">
			<button>Add New Product</button>
		</a>
	</div>
</body>
</html>