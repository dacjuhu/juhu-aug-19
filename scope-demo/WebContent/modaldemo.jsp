<%@page import="in.cdac.User"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<%
	int id = (Integer)request.getAttribute("ID");
	ArrayList<Integer> idList = (ArrayList<Integer>) request.getAttribute("ID_LIST");
	
	
	String cityName = (String)request.getAttribute("CITY_NAME");
	ArrayList<String> cityList = (ArrayList<String>) request.getAttribute("CITY_LIST");
	
	
	User user = (User)request.getAttribute("USER");
	ArrayList<User> userList = (ArrayList<User>)request.getAttribute("USER_LIST");
%>


<body>



<h1>DATA TYPE NUMBER Demo</h1>
ID : <%= id %>

<% for(int id1 : idList) { %>
	<p>FROM LIST :: <%=id1 %></p>
	
<% } %>





<h1>DATA TYPE STRING Demo</h1>
CITY NAME  : <%= cityName %>

<% for(String cityName1 : cityList) { %>
	<p>FROM LIST :: <%=cityName1 %></p>
	
<% } %>



<h2>USER DEFIND DATA </h2>
USER :: <%=user.getId() %>  :: <%= user.getName() %>

<% for(User user1 : userList) { %>
	<p>FROM LIST :: <%=user1.getId()  %> :: <%= user1.getName() %></p>
	
<% } %>




</body>
</html>