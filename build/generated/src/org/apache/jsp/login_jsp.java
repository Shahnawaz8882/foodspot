package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("     <html lang=\"en\" ng-app>\n");
      out.write("       \n");
      out.write(" <body background=\"images/image17.jpg\">\n");
      out.write("            \n");
      out.write("   \n");
      out.write(" <style>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("input[type=text], input[type=password] \n");
      out.write("        \n");
      out.write("       \n");
      out.write(" {\n");
      out.write("    width: 35%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("   \n");
      out.write(" margin: 8px 0;\n");
      out.write("    display: inline-block;\n");
      out.write("   \n");
      out.write(" border: 1px solid #ccc;\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("button {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("   \n");
      out.write(" color: white;\n");
      out.write("    \n");
      out.write("padding: 14px 20px;\n");
      out.write("   \n");
      out.write(" margin: 8px 0;\n");
      out.write("   \n");
      out.write("\n");
      out.write(" border: none;\n");
      out.write("   \n");
      out.write(" cursor: pointer;\n");
      out.write("    \n");
      out.write("width: 35%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("input.ng-invalid.ng-dirty{border:1px solid red;}\n");
      out.write("  \n");
      out.write("   \n");
      out.write(" </style>\n");
      out.write("    \n");
      out.write("<head>\n");
      out.write("      \n");
      out.write("       \n");
      out.write(" <title> Login</title>\n");
      out.write("       \n");
      out.write(" <script src=\"./js/angular.min.js\"></script>\n");
      out.write("   \n");
      out.write(" </head>\n");
      out.write("   \n");
      out.write("    \n");
      out.write("        \n");
      out.write("       \n");
      out.write(" <h1>Sign in </h1>\n");
      out.write("  \n");
      out.write("  <div class=\"container\">\n");
      out.write("  \n");
      out.write(" \n");
      out.write(" </div>\n");
      out.write("      \n");
      out.write("              \n");
      out.write(" \n");
      out.write("     <form action=\"LoginServlet\" name=\"myform\" method=\"post\">\n");
      out.write("     \n");
      out.write("    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write(" \n");
      out.write("     <center> <label><b>Username</b></label>\n");
      out.write("     \n");
      out.write(" <input type=\"text\" placeholder=\"Enteremail\" name=\"mail\" ng-model=\"user.name\" />\n");
      out.write("   \n");
      out.write(" <span ng-show=\"myform.name.$dirty && myform.name.$error.required\">Required!</span><br>\n");
      out.write("           \n");
      out.write("  \n");
      out.write("  <label><b>Password</b></label>\n");
      out.write(" \n");
      out.write("<input type=\"password\" placeholder=\"Enter Password\" name=\"pass\" ng-model=\"user.psw\" />\n");
      out.write("   \n");
      out.write(" <span ng-show=\"myform.psw.$dirty && myform.psw.$error.required\">Required!</span><br>\n");
      out.write("\n");
      out.write("        \n");
      out.write(" <button type=\"submit\">Login</button></center>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("  </form><br>\n");
      out.write("      \n");
      out.write("   \n");
      out.write("\n");
      out.write(" <center>   <a href =\"#\">Forget password?</a></center>\n");
      out.write("      \n");
      out.write("\n");
      out.write("    \n");
      out.write(" </body>\n");
      out.write("    \n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("   ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
