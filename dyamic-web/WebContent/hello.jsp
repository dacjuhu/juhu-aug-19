<%@page import="java.util.List"%>
<%@page import="in.cdac.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<%
	String message = (String)request.getAttribute("message");
	User user = (User)request.getAttribute("user");
	List<String> list = (List<String>)request.getAttribute("list");
%>

<body>

I am hello and am friend of HelloServlet. :: I GOT THE MESSAGE :: 

<h1>
	MESSSAGE ::: <%= message %>	
</h1>

<h2>
	<%= user.getUsername() %>
	<%= user.getEmail() %>
</h2>
 
 <% for(int i=0; i<list.size(); i++) {
	 String item = list.get(i);
%>	 
		<h5> <%= item %></h5> 
 <% } %>
 

</body>
</html>