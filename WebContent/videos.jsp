<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
//cache removal
	response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate"); //HTTP 1.1 onwards
	response.setHeader("Pragma", "no-cache");// HTTP 1.0
	response.setHeader("Expires","0"); //For Proxy servers cache removal
	if(session.getAttribute("username")==null){
		response.sendRedirect("login.jsp");
	}
%>
<iframe width="560" height="315" src="https://www.youtube.com/embed/z2IkVOByvFc" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
	<form action="Logout" method="post">
	<input type="submit" value="Logout">
	</form>
</body>
</html>