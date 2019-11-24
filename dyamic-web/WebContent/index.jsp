<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>

<!--  WE ARE GOING TO READ QUERY PARAMS -->
<% 
	String primary = request.getParameter("primary");
	if(primary == null) {
		primary = "DEFAULT PRIMARY";
	}

	String secondary = request.getParameter("secondary");
	if(secondary == null) {
		secondary = "DEFAULT SECONDARY";
	}
	
	int count = 1;
	String strCount = request.getParameter("count");
	if(strCount != null) {
		count = Integer.parseInt(strCount);
	}
	
	String background = request.getParameter("background");
	if(background == null) {
		background = "bg-dark";
	}
	
%>

<body>

	<div class="container">
	
	
		<% for(int i=0; i<count; i++) { %>
			
			<% if(i%2 == 0) { %> 
				<div class="row">
					<div class="col-12 <%=background %> text-light d-flex justify-content-center align-items-center h3" style="height:150px">
						<%= primary %>
						<%= background %>
					</div>		
				</div>	
			<% } else { %>
				<div class="row">
					<div class="col-12 bg-secondary text-light d-flex justify-content-center align-items-center h3" style="height:150px">
						<%= secondary %>
					</div>		
				</div>
			
			<% } %>
				
		<% } %>		
		
		
		
		
	</div>

</body>
</html>