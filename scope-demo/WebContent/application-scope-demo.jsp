<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<%
	// ADDING DATA ON APPLICATION SCOPE
	if(application.getAttribute("APP_COUNT") == null) {
		application.setAttribute("APP_COUNT", 1);	
	}
	
%>


<%
	// GET DATA FROM APPLICATION SCOPE
	int appCount = (Integer)application.getAttribute("APP_COUNT");
%>



<body>

	APPLICATION COUNTER :: <%= appCount %>

</body>
</html>