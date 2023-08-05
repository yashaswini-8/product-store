<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%--   <% Cookie[] arr = request.getCookies()
  int count=0;
  for(int i=0; i<rr.length; i++){
	  if(arr[i].getName().equals("abc")){
		  count++;
	  }
  }
  if(count>0){
	  %>
	  
  }else{
  response.sendRedirect("login.jsp");
  }
  %>     --%>



	<%
		String s = (String) session.getAttribute("abc");
		if (s != null) {
	%>
	<h1>WELCOME TO FRIENDS PAGE</h1>
	<h3>
		<a href="logout">LOGOUT</a>
	</h3>
	<%
		} else {
			response.sendRedirect("login1.jsp");
		}
	%>




</body>
</html>