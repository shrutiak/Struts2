<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1" http-equiv="Content-Type" content="text/html">
<title>Register</title>
<s:head/>
</head>
<body>
<s:form action="registerAction">
	<s:textfield name="firstName" key="global.firstName" />
	<s:textfield name="lastName" key="global.lastName" />
	<s:radio name="gender" list="{'Male','Female','Transgender'}" key="global.gender" />
	<s:textfield name="age" key="global.age" />
	<s:textfield name="emailId" key="global.email" />
	<s:submit key="global.register" />
</s:form>

<s:url action="changeLocaleAction" var="urlEn">
	<s:param name="request_locale">en</s:param>
</s:url>
<a href="${urlEn}">English</a>

<s:url action="changeLocaleAction" var="urlFr">
	<s:param name="request_locale">fr</s:param>
</s:url>
<a href="${urlFr}">French</a>

<s:url action="changeLocaleAction" var="urlDe">
	<s:param name="request_locale">de</s:param>
</s:url>
<a href="${urlDe}">German</a>
</body>
</html>