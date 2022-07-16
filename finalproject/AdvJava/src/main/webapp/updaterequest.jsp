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
  color:white;
    background-color: #DC3023;
}

td:hover {background-color: #59ABE3;}
</style>
</head>
<body>
	<center><h1>Update Request </h1></center>
<table>
	<tr><th>Request No </th><th>Roll No </th><th>Update Section </th><th>Update Value </th><th>Reason for update</th></tr>

	<c:forEach items="${ listOfStudent }" var="customer">
		<tr>
			<td>${ customer.requestno }</td>
			<td>${ customer.rollno }</td>
			<td>${ customer.section }</td>
			<td>${ customer.updatedVal }</td>
			<td>${ customer.reason }</td>
			

		</tr>
	</c:forEach>
</table>

<form id="login-form" action="Updatelist.cdac">
<input type=text; name="requestno" id="id">
 <button type="submit" id="login" >Update</button>
</form>


</body>
</html>