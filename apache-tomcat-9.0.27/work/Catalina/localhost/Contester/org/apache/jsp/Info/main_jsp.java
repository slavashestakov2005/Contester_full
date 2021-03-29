/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.27
 * Generated at: 2021-03-29 11:47:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Info;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
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
		Cookie name = new Cookie("name", request.getParameter("name").trim());
		Cookie surname = new Cookie("surname", request.getParameter("surname").trim());
		name.setMaxAge(60*60*10);
		surname.setMaxAge(60*60*10);
		// Add both the cookies in the response header.
		response.addCookie(name);
		response.addCookie(surname);
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
      out.write("\t\t<script src=\"https://polyfill.io/v3/polyfill.min.js?features=es6\"></script>\n");
      out.write("\t\t<script id=\"MathJax-script\" async src=\"https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js\"></script>\n");
      out.write("\t\t<script> var lang_c = -1; </script>\n");
      out.write("\t\t<title>Контестер</title>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t<div id=\"header\">\n");
      out.write("\t\t\t<script>\n");
      out.write("\t\t\t\tvar name = getCookie(document, \"name\");\n");
      out.write("\t\t\t\tvar surname = getCookie(document, \"surname\");\n");
      out.write("\t\t\t\tdocument.cookie = \"name=\" + name + \"; path=/\";\n");
      out.write("\t\t\t\tdocument.cookie = \"surname=\" + surname + \"; path=/\";\n");
      out.write("\t\t\t</script>\n");
      out.write("\t\t\t<div id=\"nav1\"><center><button id=\"image\" onclick=\"CreateContest(document)\"><img src=\"../Images/add.png\"></button></center></div>\n");
      out.write("\t\t\t<div id=\"nav2\">\n");
      out.write("\t\t\t\t<p align=\"right\">\n");
      out.write("\t\t\t\t\t<script>printNameSurname(document);</script>\n");
      out.write("\t\t\t\t\t<br/>\n");
      out.write("\t\t\t\t\t<a href=\"edit.html\">Редактировать</a>\n");
      out.write("\t\t\t\t\t<a href=\"../index.jsp\">Выйти</a>\n");
      out.write("\t\t\t\t</p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div id=\"nav3\"><center><h1><a href=\"main.jsp\">Контестер</a></h1></center></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div id=\"page\">\n");
      out.write("\t\t\t<iframe src=\"sidebar.html\" width=\"150px\" height=\"100%\" scrolling=\"no\" frameborder=\"no\" style=\"position: absolute; \">Разделы</iframe>\n");
      out.write("\t\t\t<div id=\"content\">\n");
      out.write("\t\t\t\t<center><h2>Контестер</h2></center>\n");
      out.write("\t\t\t\t<p>Контестер — web приложение для создания контестов по информатике.</p>\n");
      out.write("\t\t\t\t<p>Автор: Шестаков Вячеслав, ученик Инженерной Школы гимназии \"Униврс №1\".</p>\n");
      out.write("\t\t\t\t<p>Руководитель: Вахитова Екатерина Юрьевна, учитель гимназии \"Униврс №1\".</p>\n");
      out.write("\t\t\t\t<p>Контестер будет применяться в гимназии \"Униврс №1\" на спецкурсе по олимпиадной информатике.</p>\n");
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
