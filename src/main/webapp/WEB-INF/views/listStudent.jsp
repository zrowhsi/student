<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>All Users</title>
</head>
<body>
	<center>
		<h1>Student List</h1>
		<h3>
			<a href="register">Add More Student</a>
		</h3>
	</center>
	<c:if test="${!empty studentList}">
		<table align="center" border="1">
			<tr style="background-color: gray;">
				<th>Student ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Address</th>
				<th>Phone</th>
				<th>Gender</th>
				<th>DOB</th>
				<th>Email</th>
				<th>Class</th>
				<th>Actions on Row</th>
			</tr>
			<c:forEach items="${studentList}" var="student">
				<tr style="background-color: silver;">
					<td><c:out value="${student.stdId}" /></td>
					<td><c:out value="${student.firstName}" /></td>
					<td><c:out value="${student.lastName}" /></td>
					<td><c:out value="${student.address}" /></td>
					<td><c:out value="${student.phone}" /></td>
					<td><c:out value="${student.gender}" /></td>
					<td><c:out value="${student.dob}" /></td>
					<td><c:out value="${student.email}" /></td>
					<td><c:out value="${student.classlvl}" /></td>
					<td align="center">| <a href="edit?stdId=${student.stdId}">Edit</a>
						| <a href="delete?stdId=${student.stdId}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>

</body>
</html>
