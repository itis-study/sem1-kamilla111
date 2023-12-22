<%--
  Created by IntelliJ IDEA.
  User: kamilla
  Date: 11.11.2023
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sign In</title>
    <style>
        body {
            background-image: url("images/img_3.png");
        }
        .no-background {
            background-image: url("images/img_3.png");
        }
    </style></head>
<h2>Login:</h2>

<label for="login">Login:</label>
<input type="text" id="login" name="login" required><br>
<label for="password">Password:</label>
<input type="text" id="password" name="password" required><br>
<input type="submit" value="Войти">


