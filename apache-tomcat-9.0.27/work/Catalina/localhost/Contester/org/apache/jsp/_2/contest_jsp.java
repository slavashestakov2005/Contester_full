/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.27
 * Generated at: 2021-03-25 13:14:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contest_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");

	try{
		String pwd = request.getParameter("password");
		if (pwd != null) {
			Cookie password = new Cookie("password", pwd);
			password.setMaxAge(60 * 60 * 10);
			// Add both the cookies in the response header.
			response.addCookie(password);
		}
	}catch(Exception e){}

      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"ru\">\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"UTF-8\">\n");
      out.write("\t\t<link rel=\"shortcut icon\" href=\"../Images/image.ico\" type=\"image/x-icon\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../CSS/users.css\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"../CSS/admin.css\">\n");
      out.write("\t\t<script src=\"../JS/users.js\" type=\"text/javascript\"> </script>\n");
      out.write("\t\t<script src=\"../JS/admin.js\" type=\"text/javascript\"> </script>\n");
      out.write("\t\t<script>\n");
      out.write("\t\t\tvar cnt = -1;\n");
      out.write("\t\t\tvar page_type = \"contest\";\n");
      out.write("\t\t\tvar page_number = 2;\n");
      out.write("\t\t\tvar page_contest = 2;\n");
      out.write("\t\t\tCheck(document, page_contest);\n");
      out.write("\t\t</script>\n");
      out.write("\t\t<script src=\"https://polyfill.io/v3/polyfill.min.js?features=es6\"></script>\n");
      out.write("\t\t<script id=\"MathJax-script\" async src=\"https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js\"></script>\n");
      out.write("\t\t<title>Отборочный тур Сириуса</title>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<div id=\"header\">\n");
      out.write("\t\t\t<div id=\"nav1\"><center><button id=\"image\" onclick=\"Edit(document, page_type, page_number); \"><img src=\"../Images/edit.png\"></button></center></div>\n");
      out.write("\t\t\t<div id=\"nav2\">\n");
      out.write("\t\t\t\t<p align=\"right\">\n");
      out.write("\t\t\t\t\t<script>printNameSurname(document);</script>\n");
      out.write("\t\t\t\t\t<br/>\n");
      out.write("\t\t\t\t\t<a href=\"../index.jsp\">Выйти</a>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"nav3\"><center><h1><a href=\"contest.jsp\">Отборочный тур Сириуса</a></h1></center></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"page\">\n");
      out.write("\t\t\t<iframe src=\"sidebar.html\" width=\"150px\" height=\"100%\" scrolling=\"no\" frameborder=\"no\" style=\"position: absolute;\">Список задач</iframe>\"\n");
      out.write("\t\t\t<div id=\"content\">\n");
      out.write("\t\t\t\t<center><h2>Отборочный тур Сириуса</h2></center>\n");
      out.write("\t\t\t\t<h3>Описание:</h3>\n");
      out.write("\t\t\t\t<p>Отборочный тур на программу \"Алгоритмы и анализ данныз\" (декабрь 2020).</p>\n");
      out.write("\t\t\t\t<p>Тур проводился 06.11.2020 с системой прокторинга.</p>\n");
      out.write("\t\t\t\t<p>Время на написание — 4 часа.</p>\n");
      out.write("\t\t\t\t<p>Начать было можно в любое время с 8:30 до 10:00 (МСК).</p>\n");
      out.write("\t\t\t\t<h3>Время старта:</h3>\n");
      out.write("\t\t\t\t<p>06.11.2020 08:30</p>\n");
      out.write("\t\t\t\t<h3>Время окончания:</h3>\n");
      out.write("\t\t\t\t<p>06.11.2021 08:30</p>\n");
      out.write("\t\t\t\t<h3>Продолжительность:</h3>\n");
      out.write("\t\t\t\t<p>365:00:00</p>\n");
      out.write("\t\t\t\t<h3>Результаты:</h3>\n");
      out.write("\t\t\t\t<p><a href=\"#\" onclick=\"viewResults(2, 1);\">Результаты</a></p>\n");
      out.write("\t\t\t\t<div id=\"down2\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
