<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<title>Spring MVC</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
  a {font-size:14pt;margin-right:20px;margin-left:20px;}
  p {line-height:60pt;}
  h3 {line-height:40pt;}
  span {font-size:14pt}
  table {margin-left:auto;margin-right:auto;}
  tr.nums {height: 50px;vertical-align: center;text-align:center;color:blue;font-size:16pt;}
  tr.footer {height: 20px; text-align:center;}
  tr { height: 150px;vertical-align: center;}
  img {padding:10px;}
</style>
</head>
<body>
<div class="container">
<h3>A Spring MVC Example</h3>
<hr>
<a href="<%=request.getContextPath()%>/home">Home</a><span>|</span><a href="<%=request.getContextPath()%>/pictures" style="text-decoration: underline;">Pictures</a><span>|</span><a href="<%=request.getContextPath()%>/vote">Vote</a><span>|</span><a href="<%=request.getContextPath()%>/viewresults">View Results</a>
<hr>
<div>
<table>
<tr class="nums"><td>1</td><td>2</td><td>3</td></tr>
<tr><td><img src="<c:url value="/resources/two-sisters.jpg"/>"/></td>
<td><img src="<c:url value="/resources/two-young-girls.jpg"/>"/></td>
<td><img src="<c:url value="/resources/woman-in-black.jpg"/>"/></td></tr>
<tr class="footer"><td>Two Sisters</td><td>Two Young Girls</td><td>Woman in Black</td></tr>
</table>
<p><i>Pierre-Auguste Renoir</i></p>
</div>
</div>
</body>
</html>
