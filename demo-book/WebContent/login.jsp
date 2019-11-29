<%@ include file="header.jsp" %>


<body>


<div class="container-fluid">

	<div class="row">
		<div class="col-12 bg-dark text-light d-flex justify-content-center align-items-center" style="height:100vh">
			
			
			<form action="regiser-servlet" method="post">
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
				</form>
			
		</div>
	</div>
</div>


</body>
</html>