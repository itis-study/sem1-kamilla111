/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-11-10 18:17:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class task2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head><title>Task2</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            background-image: url(\"images/img_5.png\");\n");
      out.write("        }\n");
      out.write("        .no-background {\n");
      out.write("            background-image: url(\"images/img_5.png\");\n");
      out.write("        }\n");
      out.write("    </style></head>\n");
      out.write("<body>\n");
      out.write("<h1>Задача 2</h1>\n");
      out.write("<h2>Теория для решения задачи</h2>\n");
      out.write("<h4>Переменная – это именованная область памяти, предназначенная для хранения данных, которые могут быть изменены во время выполнения программы. Переменная имеет тип, имя и значение.</h4>\n");
      out.write("<h4>    Описание переменной имеет следующий синтаксис:</h4>\n");
      out.write("<h3>тип имя_переменной [=значение];</h3>\n");
      out.write("<h4> int count=0; //объявление целочисленной переменной и инициализация</h4>\n");
      out.write("<h4>  char simbol; //объявление символьной переменной без инициализации</h4>\n");
      out.write("<h4>Имя переменной (идентификатор) может содержать буквы, цифры, символы подчеркивания и доллара (без пробелов). Но имя не должно начинаться с цифры! Прописные и строчные буквы различаются.  В качестве идентификатора нельзя использовать ключевое слово Java.</h4>\n");
      out.write("<h4>В языке Java определены арифметические операции (+, -, *, /, %), которые можно применять к числовым данным базовых типов, а также к объектам типа char. Если операция  / применяется к целым числам, то выполняется целочисленное деление (дробная часть отбрасывается). Операция % (взятие остатка от деления) применима не только к целым числам, но и к числам с плавающей точкой.  Например, в результате вычисления выражения 10.0%3.0 будет получено 1.0.</h4>\n");
      out.write("<h4>Инкремент (++) означает увеличение значения переменной на единицу. Т.е. x++; эквивалентен  x = x+1; Аналогично декремент (--) означает уменьшение переменной на единицу (x--; эквивалентен x=x-1;) Эти операции могут иметь одну из форм:</h4>\n");
      out.write("\n");
      out.write("<h4> префиксную (++x; //аргумент изменяется до его использования)</h4>\n");
      out.write("<h4>постфиксную (x++; //аргумент изменяется после использования)</h4>\n");
      out.write("<h4>Операции сравнения (==, !=, >, <, >=, <=) дают в результате логическое значение типа boolean. Их можно применять ко всем числовым типам и типу char. К операндам типа boolean можно применять только проверку на равенство или неравенство, поскольку истинные и ложные значения не имеют отношения порядка. Например, выражение true>false не имеет смысла в Java.</h4>\n");
      out.write("<table>\n");
      out.write("    <tr><th>Описание задачи</th>\n");
      out.write("    <tr><td>Напишите Java-программу для нахождения периметра круга. Радиус = 7,5. За число pi брать 3,14</td></tr>\n");
      out.write("    <th>Решать</th></tr>\n");
      out.write("    <tr>\n");
      out.write("        <th>\n");
      out.write("            <textarea name=\"solution3\" rows=\"10\" cols=\"50\">public class Main {\n");
      out.write("    public static void main(String[] args) {\n");
      out.write("                //напишите ваше решение\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("            </textarea>\n");
      out.write("        </th>\n");
      out.write("    <tr>\n");
      out.write("        <td><button onclick='compileSolution(2)'>Компилировать</button></td></tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("<form action=\"task3.jsp\" align=\"center\">\n");
      out.write("    <input type=\"submit\" value=\"Следующая задача!\">\n");
      out.write("</form>\n");
      out.write("<script>\n");
      out.write("    function compileSolution(taskId) {\n");
      out.write("        var solution = document.querySelector('input[name=\"solution\"]');\n");
      out.write("        // Отправка решения на сервер для компиляции и проверки\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("</body></html>\n");
      out.write("\n");
      out.write("\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
