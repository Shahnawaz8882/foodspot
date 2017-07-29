package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <head>\n");
      out.write("       <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <title>Signup</title>\n");
      out.write("\n");
      out.write("        <script src=\"./js/angular.min.js\"></script>\n");
      out.write("  </head>  \n");
      out.write("  <style>\n");
      out.write("    \n");
      out.write("    input[type=firstname] , input[type=lastname] , input[type=text], \n");
      out.write("    \n");
      out.write(" input[type=password], input[type=text], input[type=password], \n");
      out.write(" \n");
      out.write("input[type=address], input[type=contact] \n");
      out.write(",input[type=text], input[type=password] \n");
      out.write("{\n");
      out.write("\n");
      out.write("    width: 20%;\n");
      out.write("    padding: 12px 20px;\n");
      out.write("\n");
      out.write("    margin: 8px 0;\n");
      out.write("  \n");
      out.write("  display: inline-block;\n");
      out.write("    \n");
      out.write("border: 1px solid #ccc;\n");
      out.write("  \n");
      out.write("  box-sizing: border-box;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("button \n");
      out.write("{\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    \n");
      out.write("color: white;\n");
      out.write("   \n");
      out.write(" padding: 14px 20px;\n");
      out.write("  \n");
      out.write("  margin: 10px 0;\n");
      out.write("   \n");
      out.write(" border: none;\n");
      out.write(" \n");
      out.write("   cursor: pointer;\n");
      out.write("\n");
      out.write("    width: 20%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(".cancelbtn {\n");
      out.write("\n");
      out.write("    padding: 12px 20px;\n");
      out.write("    \n");
      out.write("background-color: #f44336;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".cancelbtn,\n");
      out.write(".signupbtn {\n");
      out.write("    \n");
      out.write("    width: 20%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("input.ng-invalid.ng-dirty{border:1px solid red;}\n");
      out.write("\n");
      out.write("#form{\n");
      out.write("     width: 500px;\n");
      out.write("    height: 500px;\n");
      out.write("    margin-left: 350px;\n");
      out.write("   \n");
      out.write("}\n");
      out.write("\n");
      out.write("#h1{\n");
      out.write("   margin-left: 100px;\n");
      out.write("   font-family: Cooper;\n");
      out.write("   color: black;\n");
      out.write("   font-size: 50px;\n");
      out.write("}\n");
      out.write("#data{\n");
      out.write("    font-family: Algerian;\n");
      out.write("    color:#003333;\n");
      out.write("    font-size: 20px;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("  <body background=\"images/image17.jpg\">\n");
      out.write("\n");
      out.write("  <div id=\"form\">\n");
      out.write("      <h1 id=\"h1\">Sign Up Form</h1>\n");
      out.write("    \n");
      out.write("    <form action=\"RegisterServlet\" method=\"post\">\n");
      out.write("           \n");
      out.write("        <label id=\"data\"><b>Name</b></label>\n");
      out.write(" \n");
      out.write("             <input type=\"text\" placeholder=\"Enter First Name\" name=\"name\" required><br>\n");
      out.write("             <span id=\"error\" ng-show=\"myform.name.$dirty && myform.name.$error.required\">Required!</span>\n");
      out.write(" \n");
      out.write(" <label id=\"data\"><b>Email</b></label>\n");
      out.write("   <input type=\"email\" placeholder=\"Enter Email\" name=\"email\" ng-model=\"user.email\"  required/>\n");
      out.write("<span id=\"error\" ng-show=\"myform.email.$dirty && myform.email.$error.required\">Required!</span>\n");
      out.write("<span id=\"error\" ng-show=\"myform.email.$dirty && myform.email.$error.email\">Not an email.!</span>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("   \n");
      out.write(" <label id=\"data\"><b>Password</b></label>\n");
      out.write("    <input type=\"password\" placeholder=\"Enter Password\" name=\"password\" ng-model=\"user.password\" ng-change=\"ValidatePassword()\" required ng-minlength=\"3\" ng-maxlength=\"9\" maxlength=\"10\"/>\n");
      out.write("<span id=\"error\" ng-show=\"myform.password.$dirty && myform.password.$error.required\">Required!</span>\n");
      out.write("<span id=\"error\" ng-show=\"myform.password.$dirty && myform.password.$error.minlength\">To Short.!</span>\n");
      out.write("<span id=\"error\" ng-show=\"myform.password.$dirty && myform.password.$error.maxlength\">Strong.!</span>\n");
      out.write(" \n");
      out.write("<label id=\"data\"><b>Repeat Password</b></label>\n");
      out.write("<input type=\"password\" placeholder=\"Repeat Password\" name=\"psw-repeat\" ng-model=\"user.confirm\" ng-change=\"ValidatePassword()\" required />\n");
      out.write("<span id=\"error\" class=\"text text-danger\" ng-show=\"passwordmismatch\">Passwords do not match</span>\n");
      out.write("\n");
      out.write("\n");
      out.write("<label id=\"data\"><b>Contact</b></label>\n");
      out.write("<input type =\"number\" placeholder=\"Enter Contact no. \" name=\"contact\" ng-model=\"user.number\" required ng-minlength=\"10\" maxlength=\"10\"/>\n");
      out.write("<span id=\"error\" ng-show=\"myform.number.$dirty && myform.number.$error.required\">Required!</span>\n");
      out.write("<span id=\"error\" ng-show=\"myform.number.$dirty && myform.number.$error.minlength\">Invalid Number.!</span>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("  \n");
      out.write(" <button type=\"button\" class=\"cancelbtn\">Cancel</button>\n");
      out.write("      \n");
      out.write("<button type=\"submit\" >Sign Up</button>\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("  </div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("      \n");
      out.write("        ");
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
