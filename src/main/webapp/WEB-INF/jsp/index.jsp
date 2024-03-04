<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Spring Boot with JSP Example</title>
</head>
<body>
    <h1>Hello, JSP!</h1>
    <p>This is a simple example of using JSP with Spring Boot.</p>
    <form action="${pageContext.request.contextPath}/surfers/test" method="get">

      <button type="submit">Submit</button>
    </form>
</body>
</html>