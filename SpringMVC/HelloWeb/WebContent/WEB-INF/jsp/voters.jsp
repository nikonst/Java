<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Voters Data</title>
<style>
	body {text-align:center;}
</style>
</head>
<body>
<%@ page import="java.io.*"  %>
<%
String s1 = (String) request.getAttribute("firstname")+" ";
String s2 = (String) request.getAttribute("lastname")+" ";
String s3 = (String) request.getAttribute("favoriteNumber");
String str = s1+s2+s3;

String fileName = getServletContext().getRealPath("/")+"\\votes.txt";

FileWriter fw = new FileWriter(fileName, true);
BufferedWriter bw = new BufferedWriter(fw);
PrintWriter outFile = new PrintWriter(bw);
try	{
	    outFile.println(str);
	} finally {
	   outFile.close();
	}
%>
<div class="container">
<h1>Thank you for voting</h1>
<hr>
<p>Name : ${firstname}</p>
<p>Surname : ${lastname}</p>
<p>Vote: ${favoriteNumber}</p>
<hr>
<p><button type="button" class="btn btn-default" onclick="location.href='<%=request.getContextPath()%>/home';">Return</button></p>
</div>
</body>
</html>