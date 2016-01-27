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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Bootstrap Login Form Template</title>\n");
      out.write("\n");
      out.write("        <!-- CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://fonts.googleapis.com/css?family=Roboto:400,100,300,500\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"font-awesome/css/font-awesome.min.css\">\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/form-elements.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("        <!-- Favicon and touch icons -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"ico/favicon.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"ico/apple-touch-icon-144-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"ico/apple-touch-icon-114-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"ico/apple-touch-icon-72-precomposed.png\">\n");
      out.write("        <link rel=\"apple-touch-icon-precomposed\" href=\"ico/apple-touch-icon-57-precomposed.png\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <!-- Top content -->\n");
      out.write("        <div class=\"top-content\">\n");
      out.write("        \t\n");
      out.write("            <div class=\"inner-bg\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-8 col-sm-offset-2 text\">\n");
      out.write("                            <h1 style=\"color:#727272\"><strong>ProofReading</strong> Log in | sign up</h1>\n");
      out.write("                            <div class=\"description\">\n");
      out.write("                            \t<p>\n");
      out.write("\t                            \t<!-- This is a free responsive login form made with Bootstrap. \n");
      out.write("\t                            \tDownload it on <a href=\"http://azmind.com\"><strong>AZMIND</strong></a>, customize and use it as you like! -->\n");
      out.write("                            \t</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6 col-sm-offset-3 form-box\">\n");
      out.write("                        \t<div class=\"form-top\">\n");
      out.write("                        \t\t<div class=\"form-top-left\">\n");
      out.write("                        \t\t\t<h3>Please sign up for our webiste</h3>\n");
      out.write("                            \t\t<p>Please enter your basic information to register:</p>\n");
      out.write("                        \t\t</div>\n");
      out.write("                        \t\t<div class=\"form-top-right\">\n");
      out.write("                        \t\t\t<i class=\"fa fa-lock\"></i>\n");
      out.write("                        \t\t</div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-bottom\">\n");
      out.write("\t\t\t                    <form role=\"form\" action=\"userSignUpServlet\" method=\"post\" class=\"login-form\">\n");
      out.write("\t\t\t                    \t<div class=\"form-group\">\n");
      out.write("\t\t\t                    \t\t<label class=\"sr-only\" for=\"form-username\">Username</label>\n");
      out.write("\t\t\t                        \t<input type=\"text\" name=\"form-username\" placeholder=\"Username...\" class=\"form-username form-control\" id=\"form-username\">\n");
      out.write("\t\t\t                        </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"sr-only\" for=\"form-username\">E-mail</label>\n");
      out.write("                                        <input type=\"text\" name=\"form-email1\" placeholder=\"E-mail...\" class=\"form-username form-control\" id=\"form-username\">\n");
      out.write("                                    </div>\n");
      out.write("                                      <div class=\"form-group\">\n");
      out.write("                                        <label class=\"sr-only\" for=\"form-username\">E-mail</label>\n");
      out.write("                                        <input type=\"text\" name=\"form-email2\" placeholder=\"Confirm your E-mail...\" class=\"form-username form-control\" id=\"form-username\">\n");
      out.write("                                    </div>\n");
      out.write("\t\t\t                        <div class=\"form-group\">\n");
      out.write("\t\t\t                        \t<label class=\"sr-only\" for=\"form-password\">Password</label>\n");
      out.write("\t\t\t                        \t<input type=\"password\" name=\"form-password\" placeholder=\"Password...\" class=\"form-password form-control\" id=\"form-password\">\n");
      out.write("\t\t\t                        </div>\n");
      out.write("\t\t\t                        <button type=\"submit\" class=\"btn\" id=\"signup1\" style=\"\">Sign up</button>\n");
      out.write("                                    <div class=\"sepOr\">\n");
      out.write("                                        <!-- <span class=\"or\">or</span> -->\n");
      out.write("                                        <hr>\n");
      out.write("                                    </div>\n");
      out.write("                                  \n");
      out.write("\n");
      out.write("                                    <button class=\"btn\" id=\"login1\" style=\"\">Log in</button>\n");
      out.write("\t\t\t                    </form>\n");
      out.write("\t\t                    </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6 col-sm-offset-3 social-login\">\n");
      out.write("                        \t<h3 style=\"color:#727272\">...you can follow us on:</h3>\n");
      out.write("                        \t<div class=\"social-login-buttons\">\n");
      out.write("\t                        \t<a class=\"btn btn-link-2\" href=\"#\">\n");
      out.write("\t                        \t\t<i class=\"fa fa-facebook\"></i> Facebook\n");
      out.write("\t                        \t</a>\n");
      out.write("\t                        \t<a class=\"btn btn-link-2\" href=\"#\">\n");
      out.write("\t                        \t\t<i class=\"fa fa-twitter\"></i> Twitter\n");
      out.write("\t                        \t</a>\n");
      out.write("\t                        \t<a class=\"btn btn-link-2\" href=\"#\">\n");
      out.write("\t                        \t\t<i class=\"fa fa-google-plus\"></i> Google Plus\n");
      out.write("\t                        \t</a>\n");
      out.write("                        \t</div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Javascript -->\n");
      out.write("        <script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/jquery.backstretch.min.js\"></script>\n");
      out.write("        <script src=\"js/scripts.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("        \n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
