<%@ include file="header.jsp" %>

<body>

	<div class="container-fluid">
		<div class="row">
			<div
				class="col-12 bg-dark text-light d-flex justify-content-center align-items-center"
				style="height: 100vh">

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
					
					<div class="form-group">
						<label >Email address</label> 
						<input
							type="email" name="email" class="form-control" 
							aria-describedby="emailHelp"> 
					</div>
					
					<div class="form-group">
						<label>MOBILE</label> 
						<input
							type="text" name="mobile"  class="form-control" 
							aria-describedby="emailHelp"> 
					</div>
					
					<button type="submit" class="btn btn-primary">REGISTER</button>
				</form>

			</div>
		</div>
	</div>

</body>
</html>