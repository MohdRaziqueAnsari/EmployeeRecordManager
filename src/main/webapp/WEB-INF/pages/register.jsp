<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Employee Registration</title>
</head>
<body>

<h2>Employee Registration</h2>

<form action="${pageContext.request.contextPath}/register" method="post">

    Name:
    <input type="text" name="name" required><br><br>

    Date of Birth:
    <input type="date" name="dob" required><br><br>

    Gender:
    <input type="text" name="gender" required><br><br>

    Address:
    <input type="text" name="address" required><br><br>

    City:
    <input type="text" name="city" required><br><br>

    State:
    <input type="text" name="state" required><br><br>

    Login ID:
    <input type="text" name="loginId" required><br><br>

    Password:
    <input type="password" name="password" required><br><br>

    <input type="submit" value="Register">

</form>

<br>
<a href="${pageContext.request.contextPath}/login">Already Registered? Login</a>

</body>
</html>
