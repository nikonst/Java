<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<title>Spring MVC</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script>
function validateForm() {
    var x = document.forms["voteForm"]["firstname"].value;
	var y = document.forms["voteForm"]["lastname"].value;
    if (x == "" || y == "") {
        alert("Name and Surname must be filled out");
        return false;
    }
	if(! (document.getElementById("twosisters").checked == true || document.getElementById("twoyounggirls").checked == true || document.getElementById("womaninblack").checked == true)) {
	alert("Choose a Picture!");
        return false;
	}
}
</script>
<style>
  a {font-size:14pt;margin-right:20px;margin-left:20px;}
  h3 {line-height:40pt;}
  span {font-size:14pt;}
  input {max-width: 300px;}
  td {padding-left:20px;}
</style>
</head>
<body>
<div class="container">
<h3>A Spring MVC Example</h3>
<hr>
<a href="<%=request.getContextPath()%>/home">Home</a><span>|</span><a href="<%=request.getContextPath()%>/pictures">Pictures</a><span>|</span><a style="text-decoration: underline;" href="<%=request.getContextPath()%>/vote">Vote</a><span>|</span><a href="<%=request.getContextPath()%>/viewresults">View Results</a>
<hr>
<div>
<h2>Vote for your Favorite Painting</h2>
  <form:form name="voteForm" onsubmit="return validateForm()" method="POST" action="/HelloWeb/voters">
    <div class="form-group">
    <p>First Name</p>
    Name:<form:input path="name" class="form-control" id="name"/><br>
    Surname:<form:input path="surname" class="form-control" id="surname"/><br>
	</div>
	<h3>Choose Picture</h3>
    <div class="radio">
    	<table>
	    	<tr>
	    	<td><form:radiobuttons path="vote" element="li" items="${numbersList}" /></td>
	    	</tr>
    	</table> 
    </div>
	<h3></h3>
	<div class="form-group">
	<button type="submit" class="btn btn-default">Submit</button>
	<button type="reset" class="btn btn-default">Reset</button>
	</div>
  </form:form>
</div>
</div>
</body>
</html>