<%@ include file="header.jsp" %>


<%
	String errorMessage = "";
	if(session.getAttribute("ERROR") != null) {
		errorMessage = (String) session.getAttribute("ERROR");	
		
		session.removeAttribute("ERROR");
	}
%>

<body>


<div class="container-fluid">

	<div class="row">
		<div class="col-12 bg-dark text-light d-flex justify-content-center align-items-center" style="height:100vh">
			
			
			<form action="login-servlet" method="post">
					<div class="form-group">
						<label>USERNAME</label> 
						<input
							type="text" name="username"  class="form-control"
							aria-describedby="emailHelp"> 
					</div>
					
					
					<div class="form-group">
						<label>Password</label> 
						<input
							type="password" name="password" class="form-control" >
					</div>
					
					
					<button type="submit" class="btn btn-primary">LOGIN</button>
					<a class="btn btn-primary" href="register.jsp" role="button">Register</a>

					<% if(errorMessage != ""){ %>
						<div class="alert alert-danger mt-1" role="alert">
  							<%= errorMessage %>
						</div>	
					<% } %>
					
				</form>
			
		</div>
	</div>
</div>


</body>
</html>