<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<div align="center">
		<h2>Login</h2>
		<s:property value="message" />
		<s:form action="login">
			<s:textfield name="username" label="Username" />
			<s:password name="password" label="Password" />
			<s:submit value="Login" />
		</s:form>
	</div>
</body>
</html>