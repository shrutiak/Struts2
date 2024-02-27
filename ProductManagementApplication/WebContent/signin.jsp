<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign In</title>
</head>
<body>
<div align="center">
		<h2>Sign In</h2>
		<s:property value="message" />
		<s:form action="SignIn">
			<s:textfield name="username" label="Username" />
			<s:password name="password" label="Password" />
			<s:password name="confirmPassword" label="Confirm Password" />
			<s:submit value="SignIn" />
		</s:form>
	</div>
</body>
</html>