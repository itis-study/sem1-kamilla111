/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2023-11-11 11:26:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <style>\n");
      out.write("        /* ÐÐ±ÑÐ¸Ðµ ÑÑÐ¸Ð»Ð¸ */\n");
      out.write("        body {\n");
      out.write("            font-family: 'Montserrat', sans-serif;\n");
      out.write("            line-height: 1.6;\n");
      out.write("            color: #333;\n");
      out.write("            background-image: url(\"images/img_5.png\");\n");
      out.write("            background-size: cover;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        a {\n");
      out.write("            color: #007bff;\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        a:hover {\n");
      out.write("            color: #0056b3;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* ÐÐ°Ð²Ð¸Ð³Ð°ÑÐ¸Ñ */\n");
      out.write("        .navbar {\n");
      out.write("            padding: 1rem 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navbar-brand {\n");
      out.write("            font-size: 1.5rem;\n");
      out.write("            font-weight: bold;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .nav-link {\n");
      out.write("            font-size: 1.1rem;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* ÐÐ°Ð³Ð¾Ð»Ð¾Ð²Ð¾Ðº */\n");
      out.write("        .masthead {\n");
      out.write("            padding: 4rem 0;\n");
      out.write("            color: #fff;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .masthead-heading {\n");
      out.write("            font-size: 3.5rem;\n");
      out.write("            margin-bottom: 2rem;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .masthead-subheading {\n");
      out.write("            font-size: 1.5rem;\n");
      out.write("            font-weight: 300;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Ð Ð°Ð·Ð´ÐµÐ» \"Ð Ð½Ð°Ñ\" */\n");
      out.write("        #about {\n");
      out.write("            padding: 4rem 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .page-section-heading {\n");
      out.write("            font-size: 2.5rem;\n");
      out.write("            margin-bottom: 1rem;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* Ð Ð°Ð·Ð´ÐµÐ» ÐºÐ¾Ð½ÑÐ°ÐºÑÐ¾Ð² */\n");
      out.write("        #contact {\n");
      out.write("            padding: 4rem 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .form-floating {\n");
      out.write("            margin-bottom: 1.5rem;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .form-control {\n");
      out.write("            border-radius: 0.25rem;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn-primary {\n");
      out.write("            background-color: #007bff;\n");
      out.write("            border-color: #007bff;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn-primary:hover {\n");
      out.write("            background-color: #0069d9;\n");
      out.write("            border-color: #0062cc;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* ÐÐ¾Ð´Ð²Ð°Ð» */\n");
      out.write("        footer {\n");
      out.write("            background-color: #343a40;\n");
      out.write("            color: #fff;\n");
      out.write("            padding: 2rem 0;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        footer p {\n");
      out.write("            margin-bottom: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        /* ÐÑÐ·ÑÐ²ÑÐ¸Ð²Ð¾ÑÑÑ */\n");
      out.write("        @media (max-width: 992px) {\n");
      out.write("            .navbar-expand-lg .navbar-collapse {\n");
      out.write("                background-color: #343a40;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .nav-link {\n");
      out.write("                color: #fff !important;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\"\n");
      out.write("          content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("    <meta name=\"description\" content=\"\" />\n");
      out.write("    <meta name=\"author\" content=\"\" />\n");
      out.write("    <title>CoJavaDe</title>\n");
      out.write("    <!-- Favicon-->\n");
      out.write("    <link rel=\"icon\" type=\"image/x-icon\" href=\"assets/favicon.ico\" />\n");
      out.write("    <!-- Font Awesome icons (free version)-->\n");
      out.write("    <script src=\"https://use.fontawesome.com/releases/v5.15.4/js/all.js\"\n");
      out.write("            crossorigin=\"anonymous\"></script>\n");
      out.write("    <!-- Google fonts-->\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\"\n");
      out.write("          rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    <link\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic\"\n");
      out.write("            rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("<body id=\"page-top\">\n");
      out.write("<!-- Navigation-->\n");
      out.write("<nav\n");
      out.write("        class=\"navbar navbar-expand-lg bg-secondary text-uppercase fixed-top\"\n");
      out.write("        id=\"mainNav\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <a class=\"navbar-brand\" href=\"#page-top\">CoJavaDe</a>\n");
      out.write("        <button\n");
      out.write("                class=\"navbar-toggler text-uppercase font-weight-bold bg-primary text-white rounded\"\n");
      out.write("                type=\"button\" data-bs-toggle=\"collapse\"\n");
      out.write("                data-bs-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\"\n");
      out.write("                aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            Menu <i class=\"fas fa-bars\"></i>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("            <ul class=\"navbar-nav ms-auto\">\n");
      out.write("                <li class=\"nav-item mx-0 mx-lg-1\"><a\n");
      out.write("                        class=\"nav-link py-3 px-0 px-lg-3 rounded\" href=\"#about\">About</a></li>\n");
      out.write("                <li class=\"nav-item mx-0 mx-lg-1\"><a\n");
      out.write("                        class=\"nav-link py-3 px-0 px-lg-3 rounded\" href=\"#contact\">Contact</a></li>\n");
      out.write("                <li class=\"nav-item mx-0 mx-lg-1\"><a\n");
      out.write("                        class=\"nav-link py-3 px-0 px-lg-3 rounded\" href=\"signIn\">SignIn</a></li>\n");
      out.write("                <li class=\"nav-item mx-0 mx-lg-1\"><a\n");
      out.write("                        class=\"nav-link py-3 px-0 px-lg-3 rounded\" href=\"signUp\">SignUp</a></li>\n");
      out.write("                <li class=\"nav-item mx-0 mx-lg-1\"><a\n");
      out.write("                    class=\"nav-link py-3 px-0 px-lg-3 rounded\" href=\"tasks.jsp\">Tasks!</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("<!-- Masthead-->\n");
      out.write("<header class=\"masthead bg-primary text-white text-center\">\n");
      out.write("    <div class=\"container d-flex align-items-center flex-column\">\n");
      out.write("\n");
      out.write("        <h1 class=\"masthead-heading text-uppercase mb-0\">Welcome To CoJavaDe</h1>\n");
      out.write("        <div class=\"divider-custom divider-light\">\n");
      out.write("            <div class=\"divider-custom-line\"></div>\n");
      out.write("            <div class=\"divider-custom-icon\">\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"divider-custom-line\"></div>\n");
      out.write("        </div>\n");
      out.write("        <p class=\"masthead-subheading font-weight-light mb-0\">Pump your brains together with CoJavaDe</p>\n");
      out.write("    </div>\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("<!-- About Section-->\n");
      out.write("<section class=\"page-section bg-primary text-white mb-0\" id=\"about\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <!-- About Section Heading-->\n");
      out.write("        <h2\n");
      out.write("                class=\"page-section-heading text-center text-uppercase text-white\">About</h2>\n");
      out.write("        <!-- Icon Divider-->\n");
      out.write("        <div class=\"divider-custom divider-light\">\n");
      out.write("            <div class=\"divider-custom-line\"></div>\n");
      out.write("            <div class=\"divider-custom-icon\">\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"divider-custom-line\"></div>\n");
      out.write("        </div>\n");
      out.write("        <!-- About Section Content-->\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-4 ms-auto\">\n");
      out.write("                <p class=\"lead\">CoJavaDe is the best platform that will help you improve your skills, expand your knowledge and prepare for technical interviews in the Java programming language.</p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("<!-- Contact Section-->\n");
      out.write("<section class=\"page-section\" id=\"contact\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <!-- Contact Section Heading-->\n");
      out.write("        <h2\n");
      out.write("                class=\"page-section-heading text-center text-uppercase text-secondary mb-0\">Contact\n");
      out.write("            Me</h2>\n");
      out.write("        <!-- Icon Divider-->\n");
      out.write("        <div class=\"divider-custom\">\n");
      out.write("            <div class=\"divider-custom-line\"></div>\n");
      out.write("            <div class=\"divider-custom-icon\">\n");
      out.write("                <i class=\"fas fa-star\"></i>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"divider-custom-line\"></div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Contact Section Form-->\n");
      out.write("        <div class=\"row justify-content-center\">\n");
      out.write("            <div class=\"col-lg-8 col-xl-7\">\n");
      out.write("                <form id=\"contactForm\" data-sb-form-api-token=\"API_TOKEN\">\n");
      out.write("                    <!-- Name input-->\n");
      out.write("                    <div class=\"form-floating mb-3\">\n");
      out.write("                        <input class=\"form-control\" id=\"name\" type=\"text\"\n");
      out.write("                               placeholder=\"Enter your name...\" data-sb-validations=\"required\" />\n");
      out.write("                        <label for=\"name\">Full name</label>\n");
      out.write("                        <div class=\"invalid-feedback\" data-sb-feedback=\"name:required\">A\n");
      out.write("                            name is required.</div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Email address input-->\n");
      out.write("                    <div class=\"form-floating mb-3\">\n");
      out.write("                        <input class=\"form-control\" id=\"email\" type=\"email\"\n");
      out.write("                               placeholder=\"name@example.com\"\n");
      out.write("                               data-sb-validations=\"required,email\" /> <label for=\"email\">Email\n");
      out.write("                        address</label>\n");
      out.write("                        <div class=\"invalid-feedback\" data-sb-feedback=\"email:required\">An\n");
      out.write("                            email is required.</div>\n");
      out.write("                        <div class=\"invalid-feedback\" data-sb-feedback=\"email:email\">Email\n");
      out.write("                            is not valid.</div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Phone number input-->\n");
      out.write("                    <div class=\"form-floating mb-3\">\n");
      out.write("                        <input class=\"form-control\" id=\"phone\" type=\"tel\"\n");
      out.write("                               placeholder=\"(123) 456-7890\" data-sb-validations=\"required\" />\n");
      out.write("                        <label for=\"phone\">Phone number</label>\n");
      out.write("                        <div class=\"invalid-feedback\" data-sb-feedback=\"phone:required\">A\n");
      out.write("                            phone number is required.</div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Message input-->\n");
      out.write("                    <div class=\"form-floating mb-3\">\n");
      out.write("\t\t\t\t\t\t\t<textarea class=\"form-control\" id=\"message\" type=\"text\"\n");
      out.write("                                      placeholder=\"Enter your message here...\" style=\"height: 10rem\"\n");
      out.write("                                      data-sb-validations=\"required\"></textarea>\n");
      out.write("                        <label for=\"message\">Message</label>\n");
      out.write("                        <div class=\"invalid-feedback\" data-sb-feedback=\"message:required\">A\n");
      out.write("                            message is required.</div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"d-none\" id=\"submitSuccessMessage\">\n");
      out.write("                        <div class=\"text-center mb-3\">\n");
      out.write("                            <div class=\"fw-bolder\">Form submission successful!</div>\n");
      out.write("                            To activate this form, sign up at <br /> <a\n");
      out.write("                                href=\"https://startbootstrap.com/solution/contact-forms\">https://startbootstrap.com/solution/contact-forms</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"d-none\" id=\"submitErrorMessage\">\n");
      out.write("                        <div class=\"text-center text-danger mb-3\">Error sending\n");
      out.write("                            message!</div>\n");
      out.write("                    </div>\n");
      out.write("                    <button class=\"btn btn-primary btn-xl disabled\" id=\"submitButton\"\n");
      out.write("                            type=\"submit\">Send</button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Bootstrap core JS-->\n");
      out.write("<script\n");
      out.write("        src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("<!-- Core theme JS-->\n");
      out.write("<script src=\"js/js.js\"></script>\n");
      out.write("\n");
      out.write("<script src=\"https://cdn.startbootstrap.com/sb-forms-latest.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
