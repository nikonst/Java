<!-- 
Created by Nikos, August 2017

The current JSP page, reads an XML File and displays its content in an HTML array
The XML can be found at https://www.w3schools.com/js/cd_catalog.xml

-->

<%@ page contentType="text/html; charset=utf-8" language="java" import="javax.xml.parsers.DocumentBuilderFactory,javax.xml.parsers.DocumentBuilder,org.w3c.dom.*" errorPage="" %>
<%
DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

DocumentBuilder db = dbf.newDocumentBuilder();

Document doc = db.parse("jspData/cd_catalog.xml");

NodeList cdtitle = doc.getElementsByTagName("TITLE");
NodeList artist = doc.getElementsByTagName("ARTIST");
NodeList country = doc.getElementsByTagName("COUNTRY");
NodeList company = doc.getElementsByTagName("COMPANY");
NodeList price = doc.getElementsByTagName("PRICE");
NodeList year = doc.getElementsByTagName("YEAR");
%>

<html>
<head>
<title>Read a CD Catalogue</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>

<div class="container">
<h2>A CD Catalogue</h2>
<hr>
<div class="table-responsive">          
 <table class="table">
 <thead>
      <tr>
        <th>Title</th>
        <th>Artist</th>
        <th>Country</th>
        <th>Company</th>
		<th>Price</th>
        <th>Year</th>
      </tr>
    </thead>
<%
int i;
for(i=0;i<cdtitle.getLength();i++)
{
%>

<tr>
<td>

 <%= cdtitle.item(i).getFirstChild().getNodeValue()%>
</td>
<td>
    <%= artist.item(i).getFirstChild().getNodeValue()%>
</td>
<td>
    <%= country.item(i).getFirstChild().getNodeValue()%>
</td>
<td>
    <%= company.item(i).getFirstChild().getNodeValue()%>
</td>
<td>
    <%= price.item(i).getFirstChild().getNodeValue()%>
</td>
<td>
    <%= year.item(i).getFirstChild().getNodeValue()%>
</td>
</tr>
<%
}
%>
</table>
</div>
</div>
</body>
</html>