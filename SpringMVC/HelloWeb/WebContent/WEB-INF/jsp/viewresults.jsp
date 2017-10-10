<!DOCTYPE html>
<%@ page import = "java.io.*"%>
<html>
<head>
<title>Spring MVC</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
<style>
	h3 {line-height:40pt;}
	a {font-size:14pt;margin-right:20px;margin-left:20px;}
	span {font-size:14pt}
</style>
</head>
<body>
<div class="container">
<h3>A Spring MVC Example</h3>
<hr>
<a href="<%=request.getContextPath()%>/home">Home</a><span>|</span><a href="<%=request.getContextPath()%>/pictures">Pictures</a><span>|</span><a href="<%=request.getContextPath()%>/vote">Vote</a><span>|</span><a style="text-decoration: underline;" href="<%=request.getContextPath()%>/viewresults">View Results</a>
<hr>
<div>
<h2>Voting Results</h2>
<hr>
<%
BufferedReader inputStream = null;
int ones=0,twos=0,threes=0;

String theVote;

String fileName = getServletContext().getRealPath("/")+"\\votes.txt";

try {
inputStream = new BufferedReader(new FileReader(fileName));

String dataLine;
while ((dataLine = inputStream.readLine()) != null) {
	theVote = dataLine.substring(dataLine.lastIndexOf(' ')+1);
	System.out.println(theVote);
	
	if(theVote.equals("1")) {
		ones++;
	}
	else if (theVote.equals("2")) {
		twos++;
	}
	else if (theVote.equals("3")) {
		threes++;
	}
}
} finally {
	if (inputStream != null) {
	inputStream.close();
	}
}
%>
<div id="piechart_3d" style="width: 900px; height: 500px;margin: auto;"></div>
<script type="text/javascript">
	jones = <%= ones %>;
	jtwos = <%= twos %>;
	jthrees = <%= threes %>;
    google.charts.load("current", {packages:["corechart"]});
    google.charts.setOnLoadCallback(drawChart);
    function drawChart() {
        var data = google.visualization.arrayToDataTable([
          ['Painting', 'Votes'],
          ['Two Sisters',     jones],
          ['Two Young Girls',      jtwos],
          ['Woman in Black',  jthrees],
        ]);
    var options = {
    title: 'Pierre-Auguste Renoir Paintings Votes',
    is3D: true,
    };
    var chart = new google.visualization.PieChart(document.getElementById('piechart_3d'));
        chart.draw(data, options);
    }
</script>
</div>
</div>
</body>
</html>