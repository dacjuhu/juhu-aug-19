<%@page import="in.cdac.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>

<%
	List<User> list = (List<User>)request.getAttribute("list");
%>


<body>

<div class="container">


<%
	for(User user : list) { %>
		
		<div class="row mb-1">
			<div class="col-6 bg-dark text-light d-flex justify-content-center align-items-center" style="height:70px">
				<%=user.getUsername() %>
			</div>
			
			<div class="col-6 bg-secondary text-light d-flex justify-content-center align-items-center" style="height:70px">
				<%=user.getEmail() %>
			</div>
		</div>
		
<% 	}
%>

</div>

</body>
</html>