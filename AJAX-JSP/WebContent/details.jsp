<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%    
   String str = request.getParameter("str");    
	System.out.println("Str="+str);

	if(str.equals("casablanca")) {
		out.print("We' ll always have Paris.");
	}
	else if (str.equals("lovestory")) {
		out.print("Love means never have to say you're sorry.");
	}
	else if (str.equals("scarface")) {
		out.print("Say hello to my little friend.");
	}
	else if (str.equals("taxidriver")) {
		out.print("Are you talking to me?");
	}
	else if (str.equals("thedarkknight")) {
		out.print("Why so serious?");
	}
	else if (str.equals("thegodfather")) {
		out.print("I'm going to make him an offer he can't refuse.");
	}
	else if (str.equals("thesilence")) {
		out.print("I'm having an old friend for dinner.");
	}
%>
