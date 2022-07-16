<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<link href="./CSS/liststyle.css" rel="stylesheet" type="text/css">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
  border-collapse: collapse;
  width: 100%;

}

th, td {
  padding: 8px;
  text-align: left;
  border-bottom: 1px solid #DDD;
    background-color: #D6EEEE;
}

td:hover {background-color: #59ABE3;}
</style>
</head>
<body>
	<center> <h1>Registered Students </h1>
<table>
	<tr><th>Student ID</th><th>Name</th><th>Email</th><th>Mobile Number</th><th>Course</th><th>Birthday</th></tr>

	<c:forEach items="${ listOfStudent }" var="customer">
		<tr>
			<td>${ customer.id }</td>
			<td>${ customer.name }</td>
			<td>${ customer.email }</td>
			<td>${ customer.mobileNumber }</td>
			<td>${ customer.course }</td>
			<td>${ customer.birthday }</td>
			
			

		</tr>
	</c:forEach>
</table></center> 

<form id="login-form" action="Deletlist.cdac">
<input type=text; name="id" id="id" placeholder="Enter Student-Id">
 <button type="submit" id="login" >Delete</button>
</form>
</body>
</html>