/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.15
 * Generated at: 2014-12-17 14:19:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addNews_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/libraries.jspf", Long.valueOf(1418814336000L));
  }

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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      out.write("<html ng-app=\"newsService\">\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>news</title>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("<!-- Optional theme -->\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<!-- Latest compiled and minified JavaScript -->\n");
      out.write("    <script type=\"text/javascript\" src=\"/angularJS/angular.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<link rel=\"stylesheet\" href=\"addNews.css\">\n");
      out.write("\t<script type=\"text/javascript\" src=\"addNews.js\"></script>\n");
      out.write("</head>\n");
      out.write("<bod ng-controller= \"newsController as newsCon\"y>\n");
      out.write("        <ol class=\"breadcrumb\">\n");
      out.write("        <li><a href=\"#\" ng-click=\"newsCon.toList()\">News List</a></li>\n");
      out.write("        <li class=\"active\">Add News</li>\n");
      out.write("    </ol>\n");
      out.write("    <div class=\"news-box\" >\n");
      out.write("        <h1 class=\"col-md-8 text-center\">뉴스 입력</h1>\n");
      out.write("\t\t<form  ng-submit=\"newsCon.addNews()\">\n");
      out.write("\t        <div class=\"col-md-8 news-box\">\n");
      out.write("\t            <input type=\"text\" class=\"form-control\" placeholder=\"Title\" ng-model=\"newsCon.news.title\" name=\"title\">\n");
      out.write("\t        </div>\n");
      out.write("\t        <div class=\"col-md-5 news-box\">\n");
      out.write("\t            <input type=\"text\" class=\"form-control\" placeholder=\"author\" ng-model=\"newsCon.news.author\" name=\"author\">\n");
      out.write("\t        </div>\n");
      out.write("\t        <div class=\"col-md-3 news-box\">\n");
      out.write("\t            <input type=\"text\" class=\"form-control\" placeholder=\"yyyy-mm-dd\" ng-model=\"newsCon.news.uDate\" name=\"uDate\">\n");
      out.write("\t        </div>\n");
      out.write("\t        <div class=\"col-md-8 news-box\">\n");
      out.write("\t            <input type=\"text\" class=\"form-control\" placeholder=\"article\" id=\"article\" ng-model=\"newsCon.news.body\" name=\"body\">\n");
      out.write("\t        </div>\n");
      out.write("\t\n");
      out.write("\t        <div class=\"col-md-5\">\n");
      out.write("\t            <input type=\"submit\" class=\"btn btn-primary pull-right\"/>\n");
      out.write("\t        </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</body>\n");
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
