<!-- 
Created by Nikos, August 2017.

The current JSP connects to a MySQL database, reads a table and dispalys its content in an HTML table.
The current JSP was tested on Tomcat server. 
The data was generated at https://www.generatedata.com/

-->

<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ page import = "java.sql.*" %>
<html>
   <head>
		<title>DB Access</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   </head>
   <body>
   <div class="container">
   <h1>Display a Database Table</h1>
   <hr>
   <%
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/adatabase", "root", "12345"); 
	Statement stmt = conn.createStatement(); %>
	<h4>Connected...</h4>
	<hr>
	<h2>Customers Table</h2>
	<%
	String sql;
    sql = "SELECT * FROM tablecustomers";
    ResultSet rs = stmt.executeQuery(sql);
	%>
	<table class="table">
         <thead>
            <th>ID</th>
            <th>Name</th>
            <th>Surname</th>
            <th>Phone</th>
			<th>City</th>
			<th>Address</th>
			<th>Postal</th>
			<th>Cvv</th>
         </thead>
	<%
	while(rs.next()) {
	%>
		<tr>
            <td><%= rs.getString("ID") %></td>
			<td><%= rs.getString("NAME") %></td>
			<td><%= rs.getString("surname") %></td>
            <td><%= rs.getString("Phone") %></td>
			<td><%= rs.getString("City") %></td>
			<td><%= rs.getString("Address") %></td>
			<td><%= rs.getString("Postal") %></td>
			<td><%= rs.getString("Cvv") %></td>
        </tr>
	<% } %>
    </table>
	<%
    rs.close();
    stmt.close();
    conn.close();
	%>
	<br><br><br>
	</div>
    </body>
</html>