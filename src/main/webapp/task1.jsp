<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head><title>Task1</title>
    <style>
        body {
            background-image: url("images/img_5.png");
        }
        .no-background {
            background-image: url("images/img_5.png");
        }
    </style></head>
<body>
<h1>Задача 1</h1>
<h3>Теория для решения задачи</h3>
<h4>
    Main – имя класса (придумано нами и может быть любым правильным идентификатором), модификатор public означает, что класс публичный, т.е. все могут иметь к нему доступ.

    Описание класса должно находиться внутри парных фигурных скобок. Класс может иметь данные и методы.
    Чтобы класс мог быть запущен на выполнение, то в нем должен быть метод main(). Именно с вызова этого метода начинается работа любой программы. Если же класс используется  как часть библиотеки или в составе проекта из нескольких классов, то метод main() может отсутствовать. Описание метода main():
    Этот метод  также имеет модификатор public, поскольку при выполнении программы он вызывается за пределами своего класса.

    Ключевое слово static допускает вызов метода main() до создания объекта класса. Указывать его необходимо, т.к. метод main() вызывается виртуальной машиной еще до того, как будут созданы какие-нибудь объекты.

    Ключевое слово void  сообщает компилятору, что метод main() не возвращает никакого значения.

    После имени метода в круглых скобках указываются параметры этого метода. В общем случае список параметров может быть пуст, но для метода main() должен быть указан в качестве параметра массив строк с именем args: String[] args. Через этот массив передаются параметры, указываемые в командной строке при запуске программы.

    Все тело метода располагается внутри фигурных скобок. Каждый оператор должен завершаться точкой с запятой.
    Чтобы что-то вывести на экран нужно написать "System.out.println()", где в скобках указыватся что именоо нужно вывести


</h4>
<table>
    <tr><th>Описание задачи</th>
    <tr><td>Напишите программу, которая выводит 'Hello, World!'</td></tr>
    <th>Решать</th></tr>
    <tr>
        <th>
            <textarea name="solution3" rows="5" cols="50">public class Main {
    public static void main(String[] args) {
                //напишите ваше решение
    }
}
            </textarea>
        </th>
    <tr>
    <td><button onclick='compileSolution()'>Компилировать</button></td></tr>
</table>
<form action="task2.jsp" align="center" >
    <input type="submit" value="Следующая задача!">
</form>

</body></html>