<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Список задач</title>
    <style>
        body {
            background-image: url("images/img_5.png");
        }
        .no-background {
            background-image: url("images/img_5.png");
        }
    </style></head>
<body>
<h1>Список задач</h1>

<table align="center">
    <tr><th>Описание задачи</th></tr>
    <tr><td>Задача 1: Напишите программу, которая выводит 'Hello, World!'</td><td>
    <tr><td>Задача 2: Напишите Java-программу для нахождения периметра круга. Радиус = 7,5. За число pi брать 3,14</td>
    <tr><td>Задача 3: Напишите программу, которая находит сумму всех чисел от 1 до 50</td>
</table>
<h3></h3>
<form action="task1.jsp" align="center">
    <input type="submit" value="Решать!">
</form>
<h3></h3>
<form action="index.jsp" align="center">
    <input type="submit" value="На главную">
</form>
<script>
    function chkAndSubmit() {
            document.setAttribute("action","task1.jsp")
            document.submit();
    }
</script>
</body></html>