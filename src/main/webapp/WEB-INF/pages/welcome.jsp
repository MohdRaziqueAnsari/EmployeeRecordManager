<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Welcome</title>
</head>
<body>

<h2>Welcome, ${user.name}!</h2>

<a href="${pageContext.request.contextPath}/logout">Logout</a>

<h3>All Registered Employees</h3>

<table border="1" cellpadding="5">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>DOB</th>
        <th>Gender</th>
        <th>City</th>
        <th>State</th>
        <th>Login ID</th>
    </tr>

    <c:forEach var="emp" items="${employees}">
        <tr>
            <td>${emp.id}</td>
            <td>${emp.name}</td>
            <td>${emp.dob}</td>
            <td>${emp.gender}</td>
            <td>${emp.city}</td>
            <td>${emp.state}</td>
            <td>${emp.loginId}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
