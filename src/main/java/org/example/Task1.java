package org.example;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CompileServlet", value = "/compile")
public class Task1 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String sourceCode = request.getParameter("solution3");


        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Результат выполнения</h1>");
        out.println("<p>Здесь должен быть вывод программы</p>");
        out.println("</body></html>");
    }
}