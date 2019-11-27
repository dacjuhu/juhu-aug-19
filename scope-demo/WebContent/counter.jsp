<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<%
	// GET DATA FROM SESSION SCOPE
	int count = (Integer)session.getAttribute("COUNT");
	String name = (String)session.getAttribute("NAME");
%>


<body>
 
NAME AT SECOND PAGE :: <%= name %> <br />
COUNT AT SECOND PAGE :: <%= count %>

</body>
</html>