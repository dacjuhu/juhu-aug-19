<%@page import="in.cdac.Post"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ include file="header.jsp"%>

<jsp:include page="session-validator.jsp"></jsp:include>
<%
	if(session.getAttribute("AUTH") == null) {
		response.sendRedirect("login.jsp");
	}
%>


<%
	List<Post> postList = new ArrayList<>();
	if(session.getAttribute("POST_LIST") != null) {
		postList = (List<Post>) session.getAttribute("POST_LIST");
	}
%>


<body>


	<div class="container-fluid">
	
		<!--  NAVIATION -->
		<div class="row">
			<div class="col-6 bg-dark text-light d-flex align-items-center" style="height:60px">
				DEMOBOOK
			</div>
			
			<div class="col-6 bg-dark text-light d-flex justify-content-end align-items-center" style="height:60px">
				<a class="btn btn-secondary" href="logout-servlet" role="button">LOG OUT</a>
			</div>
		</div>
		
		
		
		<div class="row">
			<div class="col-3"></div>
			<div class="col-6 bg-secondary d-flex align-items-center" style="height:80px">
			
				<!--  POST HANDLER -->
				<form class="col-12" action="post-servlet">
				  <div class="form-row">
				    <div class="col-10">
				      <input class="form-control form-control-lg" type="text" name="post" placeholder="Post Something....">
				    </div>
				    <div class="col-2">
				      <button type="submit" class="btn btn-dark ml-1">POST</button>
				    </div>
				  </div>
				</form>
			</div>
		</div>
		
		
		<% for(Post post : postList) { %>
			
		
		<div class="row mt-1">
			<div class="col-3"></div>
			
			<div class="col-6" >
				<div class="card">
				  <div class="card-header">
				    
				  </div>
				  <div class="card-body">
				    <p class="card-text" >
				    	<%= post.getPost() %>
				    </p>
				  </div>
				</div>
			</div>
		</div>
		
		<% } %>
		
	</div>




</body>
</html>