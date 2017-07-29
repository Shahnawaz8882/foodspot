package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <title>FoodSpot</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write(" <style>\n");
      out.write("  body{\n");
      out.write("    \n");
      out.write("            background-image: url(\"images/image9.jpg\");\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("               \n");
      out.write("               \n");
      out.write("        }\n");
      out.write("</style>\n");
      out.write(" \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body style=\"background-color:lightgoldenrodyellow;\">\n");
      out.write(" \n");
      out.write("    \n");
      out.write("    \n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("       <div class=\"navbar-header\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">FoodSpot</a>\n");
      out.write("    </div>\n");
      out.write("    <ul class=\"nav navbar-nav\">\n");
      out.write("      <li class=\"active\"><a href=\"#\">Home</a></li>\n");
      out.write("      <li><a href=\"aboutus.jsp\">About Us</a>\n");
      out.write("      </li>\n");
      out.write("      <li><a href=\"contactus.jsp\">Contact Us</a></li>\n");
      out.write("      \n");
      out.write("         </ul>\n");
      out.write("    <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("      <li><a href=\"signup.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\n");
      out.write("      <li><a href=\"login.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("  <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("    <!-- Indicators -->\n");
      out.write("    <ol class=\"carousel-indicators\">\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("       <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\n");
      out.write("    </ol>\n");
      out.write("    \n");
      out.write("    <!-- Wrapper for slides -->\n");
      out.write("    <div class=\"carousel-inner\">\n");
      out.write("      <div class=\"item active\">\n");
      out.write("          <center> <img src=\"images/image1.jpg\" alt=\"hii\" width=\"640\" height=\"360\">\n");
      out.write("      </div>\n");
      out.write("       \n");
      out.write("      <div class=\"item\">\n");
      out.write("          <center>  <img src=\"images/image2.jpg\" alt=\"hii\" width=\"640\" height=\"360\">\n");
      out.write("      </div>\n");
      out.write("    \n");
      out.write("      <div class=\"item\">\n");
      out.write("          <center><img src=\"images/image3.jpg\" alt=\"hii\" width=\"640\" height=\"360\">\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("       <div class=\"item\">\n");
      out.write("           <center><img src=\"images/image4.jpg\" alt=\"hii\" width=\"640\" height=\"360\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- Left and right controls -->\n");
      out.write("    <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-left\"></span>\n");
      out.write("      <span class=\"sr-only\">Previous</span>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-right\"></span>\n");
      out.write("      <span class=\"sr-only\">Next</span>\n");
      out.write("    </a>\n");
      out.write("  </div>\n");
      out.write("    <br><br>\n");
      out.write("\n");
      out.write("     <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    <center><image src=\"images/image5.jpg\" class=\"img-rounded\" width=\"160\" height=\"160\"> <p style=\"font-size:200%;\">Chinese Food<p> <a href=\"chinese food\" >  Click For Menu </center>\n");
      out.write("       </div>\n");
      out.write("        <div class=\"col-sm-3\">\n");
      out.write("            <center><image src=\"images/image6.jpg\" class=\"img-rounded\" width=\"160\" height=\"160\"> <p style=\"font-size:200%;\">Non-Veg. Food<p> <a href=\"Non-veg. Food\"> <a href=\"nonveg.jsp\" > Click For Menu </a></center>\n");
      out.write("       </div>\n");
      out.write("<div class=\"col-sm-3\">\n");
      out.write("        <center><image src=\"images/image7.jpg\" class=\"img-rounded\" width=\"160\" height=\"160\"> <p style=\"font-size:200%;\">South Indian Food<p> <a href=\"South Indian Food\"> <a href=\"southindian.jsp\" > Click For Menu </a></center>\n");
      out.write("       </div>  \n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("        <center><image src=\"images/image8.jpg\" class=\"img-rounded\" width=\"160\" height=\"160\"> <p style=\"font-size:200%;\">North Indian Food<p> <a href=\"North Indian Food\"> <a href=\"northindian.jsp\" > Click For Menu </a></center>\n");
      out.write("</br></br>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("     </div>\n");
      out.write("</div>\n");
      out.write("                </body>\n");
      out.write("</html>");
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
