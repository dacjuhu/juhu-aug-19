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
	session.setAttribute("COUNT", 1);
	session.setAttribute("NAME", "CDAC_JUHU");
%>


<%
	// GET DATA FROM SESSION SCOPE
	int count = (Integer)session.getAttribute("COUNT");
	String name = (String)session.getAttribute("NAME");
%>



<body>

	ON SESSION PAGE NAME :: <%= name %> <br />
	ON SESSION PAGE COUNT :: <%= count %>

</body>
</html>