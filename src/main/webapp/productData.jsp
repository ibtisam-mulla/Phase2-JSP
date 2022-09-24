<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="gold">
<h1>Enter Product details</h1>
<br>
<form action="ProductData" method="post">
            Product ID   :<input type="text" name="pid"><br>
            Product Name :<input type="text" name="pname"> <br>
            Price        :<input type="text" name="pr"><br>
            Manufacturer :<input type="text" name="mfr"><br>
            
            <input type="submit" value="Submit">
            <input type="reset" value="Rest">
        </form>


</body>
</html>