<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	// THIS MEANS INVALID USER
	if(session.getAttribute("CHECK_SESSION") == null) {
		response.sendRedirect("login.jsp");
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.0/css/bootstrap.min.css"
	integrity="sha384-SI27wrMjH3ZZ89r4o+fGIJtnzkAnFs3E4qz9DIYioCQ5l9Rd/7UAa8DHcaL8jkWt"
	crossorigin="anonymous">
</head>
<body>

	<div class="container">
		<div class="row" >
			<div class="col-12 bg-dark text-light  d-flex justify-content-center align-items-center " style="height:100vh">
				
				<a href="log-out">
					<button type="button" class="btn btn-info">LOG  OUTT</button>
				 </a>
				
			</div>
		</div>
	</div>

</body>
</html>