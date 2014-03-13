<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Wprowadź dane użytkownika</title>
</head>
<html xmlns="http://www.w3.org/1999/xhtml">


<body>
	<h2>Ala</h2>
	<form:form method="POST" commandName="users"
		action="${pageContext.request.contextPath}/addStudent/add">
		<form:errors path="*" cssClass="errorblock" element="div" />
		<table>
			<tr>
				<td>Login :</td>
				<td><form:input path="login" /></td>
				<td><form:errors path="login" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><form:input path="password" /></td>
				<td><form:errors path="password" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="Submit" />Zatwierdź</td>
			</tr>
		</table>
	</form:form>
</body>
</html>