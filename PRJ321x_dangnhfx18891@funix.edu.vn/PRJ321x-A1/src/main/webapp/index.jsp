<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<% request.getRequestDispatcher("/home.jsp").forward(request, response);%>
</body>
</html>