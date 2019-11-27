<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>


<%
	// ADDING DATA ON REQ SCOPE
	request.setAttribute("COUNT", 1);
	request.setAttribute("NAME", "CDAC_JUHU");
%>


<%
	// GET DATA FROM REQ SCOPE
	int count = (Integer)request.getAttribute("COUNT");
	String name = (String)request.getAttribute("NAME");
%>


<body>


	COUNT :: <%= count %> <br />
	NAME :: <%= name %>

</body>
</html>