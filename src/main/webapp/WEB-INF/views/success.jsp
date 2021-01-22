<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Insert title here</title>
</head>
<body>
<h1>Success Page</h1>

<h2>
		<c:out value="${sessionScope.USER}" />
	</h2>
	
	<br>
	</br>
	
	<h1> Department </h1>

<a href="department.html">Department</a>

<br>
</br>
<h1> LIST DEPT AND DELETE</h1>
<a href="listdept.html"> List dept</a>

</body>
</html>