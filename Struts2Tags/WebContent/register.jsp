<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<s:head />
</head>
<body>

	<h2>Registration Form</h2>

	<s:form action="registerAction">
		<s:textfield name="firstName" label="First Name" />

		<s:textfield name="lastName" label="Last Name" />

		<s:radio name="gender" list="{'Male','Female','Transgender'}"
			label="Gender" />

		<s:textfield name="age" label="Age" />

		<s:textfield name="emailId" label="Email ID" />

		<s:textarea name="address" cols="10" rows="2" label="Address" />

		<!-- Single value select -->
		<s:select multiple="false" list="colors" name="favoriteColor"
			headerKey="None" headerValue="None" label="Favorite Color" />

		<s:checkbox name="subscription" value="false"
			label="Subscribe to our newsletter" />

		<s:checkboxlist list="hobbiesList" name="hobbies" label="Hobbies" />

		<s:submit value="Register" />

		<s:reset value="Reset" />

	</s:form>

	<table border="1" width="300">
		<tr>
			<th>Product ID</th>
			<th>Product Name</th>
			<th>Product Price</th>
		</tr>
		<s:iterator value="products" var="product">
			<tr>
				<td>
					<s:property value="#product.id" />
				</td>
				<td>
					<s:property value="#product.name" />
				</td>
				<td>
					<s:property value="#product.price" />
				</td>
			</tr>
		</s:iterator>
	</table>

</body>
</html>