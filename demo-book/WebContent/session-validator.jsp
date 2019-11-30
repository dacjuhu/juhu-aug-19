<%
	if(session.getAttribute("AUTH") == null) {
		response.sendRedirect("login.jsp");
	}
%>