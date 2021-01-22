<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>List department</title>
</head>
<body>
<h1>   LIST OF DEPARMENT</h1>

<table border="1" bordercolor="blue">

<thead>
		<tr>
			<td>DEPT ID</td>
			<td>DEPT NAME</td>
		</tr>
	</thead>
	<tbody>
	
	<c:forEach var="d" items="${DEPT_LIST}">
	<tr>
	<td> ${d.deptid} </td>
	<td> ${d.deptname}</td>
	<td> <a href="<c:url value='deldept-${d.deptid}' />">Delete</a></td>
	</tr>
	
	
	</c:forEach>

	</tbody>


</table>
</body>
</html>