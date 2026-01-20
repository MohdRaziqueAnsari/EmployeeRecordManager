<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Employee Login</title>
</head>
<body>

<h2>Login</h2>

<c:if test="${not empty error}">
    <p style="color:red">${error}</p>
</c:if>

<form action="${pageContext.request.contextPath}/login" method="post">

    Login ID:
    <input type="text" name="loginId" required><br><br>

    Password:
    <input type="password" name="password" required><br><br>

    <input type="submit" value="Login">

</form>

<br>
<a href="${pageContext.request.contextPath}/register">New User? Register</a>

</body>
</html>
