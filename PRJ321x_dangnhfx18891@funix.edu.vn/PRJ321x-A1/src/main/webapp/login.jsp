<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="css/login.css">
<title>Login page</title>
</head>
<body>
<div class="container">
    <div class="top-div"><img src="#" alt="portrait"></div>
    <div class="middle-form">
        <form action="${pageContext.request.contextPath}/login">
            <label>
                Username <input type="text" name="username" placeholder="Enter Username">
            </label>
            <label>
                Password <input type="text" name="password" placeholder="Enter Password">
            </label>
            <input class="login-btn" type="submit" value="Login">
            <label>
                <input type="checkbox" name="remember"> Remember me
            </label>
        </form>
    </div>
    <div class="bottom-div">
        <input class="cancel-btn" type="submit" value="cancel">
        <div>Forgot <a href="#">password?</a></div>
    </div>
</div>
</body>
</html>