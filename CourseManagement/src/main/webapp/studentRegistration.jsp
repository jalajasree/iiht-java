<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student registration</title>
</head>
<body>
<form:form action="studentRegistration" method="post" modelAttribute="student">
<form:input path="Name" type="text" /> <br>
<form:input path="Id" type="text" /><br>
<form:input path="Email" type="text"/><br>
<form:input path="Mobile" type="text" /><br>
<form:input path="User Name" type="text"/><br>
<form:input path="Password" type=" password"/><br>
<input type="submit" value="Register">
</form:form>
Existing Student <a href="/studentLogin">  login here</a>

</body>
</html>