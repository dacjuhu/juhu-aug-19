<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<%
	// GET DATA FROM application SCOPE
	int count = (Integer)application.getAttribute("APP_COUNT");
	count = count + 1;
	
	application.setAttribute("APP_COUNT", count);
%>


<body>
 
COUNTER :: <%= count %>

</body>
</html>