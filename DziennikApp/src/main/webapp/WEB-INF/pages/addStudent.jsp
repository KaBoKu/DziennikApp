<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE HTML>
<html>
<head>
<title>Dodaj studenta</title>
</head>

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
				<td colspan="3"><input type="submit" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>