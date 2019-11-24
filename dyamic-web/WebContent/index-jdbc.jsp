<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
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
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://192.168.64.4:3306/test";
		String username = "mysql"; // root
		String password = "mysql"; // ""
%>

<body>

	<div class="container">
	
	<%
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		
		Statement st =  con.createStatement();
		
		String sql = "SELECT * FROM USER";
		ResultSet rs = st.executeQuery(sql);

		while(rs.next()) {
			String uname = rs.getString("USERNAME");
			String email = rs.getString("EMAIL");
	%>
		
		<div class="row mb-1">
			<div class="col-6 h3 bg-dark text-light d-flex justify-content-center align-items-center" style="height:100px">
				<%= uname %>
			</div>
			
			<div class="col-6 h3 bg-dark text-light d-flex justify-content-center align-items-center" style="height:100px">
				<%= email %>
			</div>
		</div>
			
	<%	
		}
		
		con.close();
	%>	
	
	</div>
	
</body>
</html>