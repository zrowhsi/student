<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC Form Handling</title>
<style>
.center {
	margin-left: auto;
	margin-right: auto;
	width: 70%;
	background-color: #C0C0C0;
}
</style>
</head>
<body>
	<div class="center">
		<fieldset>
			<legend>Update Student Data</legend>
			<center>
				<form:form method="POST" commandName="student" action="update">
					<table>
						<tr>
							<td><form:hidden path="stdId" value="${student.stdId}" /></td>
						</tr>
						<tr>
							<td><form:label path="firstName">First Name:</form:label></td>
							<td><form:input path="firstName"
									value="${student.firstName}" /></td>
						</tr>
						<tr>
							<td><form:label path="lastName">Last Name:</form:label></td>
							<td><form:input path="lastName" value="${student.lastName}" /></td>
						</tr>
						<tr>
							<td><form:label path="address">Address:</form:label></td>
							<td><form:input path="address" value="${student.address}" /></td>
						</tr>
						<tr>
							<td><form:label path="phone">Phone:</form:label></td>
							<td><form:input type="number" path="phone"
									value="${student.phone}" /></td>
						</tr>
						<tr>
							<td><form:label path="gender">Gender:</form:label></td>
							<td><form:input path="gender" value="${student.gender}" /></td>
						</tr>
						<tr>
							<td><form:label path="dob">DOB:</form:label></td>
							<td><form:input type="date" path="dob"
									value="${student.dob}" /></td>
						</tr>
						<tr>
							<td><form:label path="email">Email:</form:label></td>
							<td><form:input path="email" value="${student.email}" /></td>
						</tr>
						<tr>
						<td><form:label path="classlvl">Class:</form:label></td>
						<td><form:select path="classlvl" value="${student.classlvl}">
						<form:option value="1">1</form:option>
						<form:option value="2">2</form:option>
						<form:option value="3">3</form:option>
						<form:option value="4">4</form:option>
						<form:option value="5">5</form:option>
						<form:option value="6">6</form:option>
						<form:option value="7">7</form:option>
						<form:option value="8">8</form:option>
						<form:option value="9">9</form:option>
						<form:option value="10">10</form:option>
						</form:select></td>
						</tr>
						<tr>
							<td colspan="1"><input type="submit" value="Submit" /></td>
						</tr>
					</table>
				</form:form>
			</center>
		</fieldset>
	</div>
</body>
</html>

