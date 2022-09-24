<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Product details enterd in form</h1>
<h3>
<%
        String id=(String)session.getAttribute("pid");
        out.println("Product id is  :" +id);
        
%>
<br>

<%
		String name=(String)session.getAttribute("pname");
		out.println("Product name is :" +name);
%>
<br>
<%
		String price=(String)session.getAttribute("pr");
		out.println("Product price is :" +price);
%>
<br>
<%
		String Menu=(String)session.getAttribute("mfr");
		out.println("Product menufacturer is :" +Menu);
%>
</h3>


</body>
</html>