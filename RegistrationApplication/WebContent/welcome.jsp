<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	
	<h2>WELCOME</h2>
	
	<s:label value="First Name:" />
	<s:property value="firstName" /><br/>
	
	<s:label value="Last Name:" />
	<s:property value="lastName" /><br/>
	
	<s:label value="Gender:" />
	<s:property value="gender" /><br/>
	
	<s:label value="Age:" />
	<s:property value="age" /><br/>
	
	<s:label value="Email ID:" />
	<s:property value="emailId" />

</body>
</html>