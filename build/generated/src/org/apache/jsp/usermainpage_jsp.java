package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class usermainpage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("    <script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("    <title>Mainpage</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\n");
      out.write("    <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"font-awesome/css/font-awesome.min.css\">\n");
      out.write("    <link href=\"css/simple-sidebar.css\" rel=\"stylesheet\">\n");
      out.write("    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic&subset=latin,greek,greek-ext' rel='stylesheet' type='text/css'>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <script type=\"text/javascript\" src=\"js/script1.js\"></script>\n");
      out.write("    \n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("        <!-- Sidebar -->\n");
      out.write("        <div id=\"sidebar-wrapper\" style=\"font-family:Open Sans\">\n");
      out.write("            <ul  class=\"sidebar-nav\">\n");
      out.write("                <li class=\"sidebar-brand\" >\n");
      out.write("                    <a href=\"#\" style=\"color:#fff\">\n");
      out.write("                        ProofReading\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\" style=\"color:#fff\">My Home</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\" style=\"color:#fff\">Shortcuts</a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\" style=\"color:#fff\">Events</a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\" style=\"color:#fff\">Settings</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\" style=\"color:#fff\">Feedback</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <!-- /#sidebar-wrapper -->\n");
      out.write("\n");
      out.write("        <!-- Page Content -->\n");
      out.write("        <div id=\"page-content-wrapper\">\n");
      out.write("            <div class=\"container-fluid\" id=\"mainIntro\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-lg-12\" style=\"font-family:Open Sans\">\n");
      out.write("                        <h1 style=\"display:block;width:100%;height:100px;\">Welcome to Panther Editing Service, ");
 out.println("123"); 
      out.write("</h1>\n");
      out.write("                        <hr>\n");
      out.write("                        <div id=\"content\">\n");
      out.write("                            <p><strong style=\"color:#0097A7\">Our</strong> vision is to break research inequality caused by language. We would like to see more Chinese research being published and wish that Chinese scholars can make long-lasting impact. We invite you to get involved in the whole paper editing process and learn more writing skills. At the end, we hope you gain the ability of composing high-quality research publication (in terms of language) independently.\n");
      out.write("\n");
      out.write("                            </p>\n");
      out.write("                            <p>Panther Editing Service (PES) is a language and content proofreading service for scientific publication. Our current service only targets at Chinese scholars. Aside from novelty, we see three major reasons that impede researchers to publish their work on International conferences and journals ? translation quality, language use and content representation (e.g., paragraph organization, design of figures and tables). We have three different teams working on that, each taking charge of one aspect. Particularly, we hire native English speakers for language editing.</p>\n");
      out.write("                            <p>We aim to respond each submission within <strong style=\"color:#0097A7\">one week</strong>. Our current price is <strong style=\"color:#0097A7\">$18/hour</strong>. A paper with 10,000 words usually requires 6-7 hours. We are starting from January 4th, 2016.</p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <a href=\"#menu-toggle\" class=\"btn btn-default col-xs-4\" id=\"menu-toggle\"><i class=\"fa fa-file-text\"></i> Request Now!</a>\n");
      out.write("                            <p style=\"display:block\" class=\"col-md-4\"> or </p>\n");
      out.write("                            <a href=\"regVol.html\" class=\"btn btn-default col-xs-4\" id=\"menu-toggle\"><i class=\"fa fa-user\"></i> Be a volunteer!</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"container-fluid\" id=\"requestForm\" style=\"font-family:Open Sans\">\n");
      out.write("              <div class=\"top-content\">\n");
      out.write("\n");
      out.write("                <div class=\"inner-bg\" style=\"padding:0\">\n");
      out.write("                    <div class=\"container\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6 col-sm-offset-3 form-box\">\n");
      out.write("                            <div class=\"form-top\">\n");
      out.write("                                <div class=\"form-top-left\">\n");
      out.write("                                    <h3>Quickly make a proofreading request now!</h3>\n");
      out.write("                                    <p>Please enter the basic information about your request:</p>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-top-right\">\n");
      out.write("                                    <i class=\"fa fa-file-text-o\"></i>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-bottom\">\n");
      out.write("                                <form role=\"form\" action=\"\" method=\"post\" class=\"login-form\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"sr-only\">Paper Name</label>\n");
      out.write("                                        <input type=\"text\" name=\"form-papername\" placeholder=\"Papername...\" class=\"form-papername form-control\" id=\"form-papername\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"sr-only\">option 1</label>\n");
      out.write("                                        <input type=\"text\" name=\"\" placeholder=\"Option 1...\" class=\"form- form-control\" id=\"\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"sr-only\" for=\"\">Option 2</label>\n");
      out.write("                                        <input type=\"text\" name=\"form-\" placeholder=\"Option 2...\" class=\"form- form-control\" id=\"form-\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label class=\"sr-only\" for=\"\">Option 3</label>\n");
      out.write("                                        <select id = \"form-paperType\" class=\"form-control\" >\n");
      out.write("                                          <option>option a</option>\n");
      out.write("                                          <option>option b</option>\n");
      out.write("                                          <option>option c</option>\n");
      out.write("                                          <option>option d</option>\n");
      out.write("                                          <option>option e</option>\n");
      out.write("                                      </select>\n");
      out.write("                                  </div>\n");
      out.write("                                  <div class=\"form-group\">\n");
      out.write("                                    <label class=\"sr-only\">General Discription</label>\n");
      out.write("\n");
      out.write("                                    <textarea type=\"text\" name=\"form-description\" placeholder=\"General Discription...\" id=\"form-description\" class=\"form-control\" rows=\"3\"></textarea>\n");
      out.write("                                </div>\n");
      out.write("                                <button type=\"submit\" class=\"btn\" id=\"addNewRequest\" style=\"color:#fff\">Request!</button>\n");
      out.write("                                <hr style=\"margin:10px;\">\n");
      out.write("                                <button class=\"btn\" id=\"backToMain\" style=\"color:#fff\">Back to main menu</button>\n");
      out.write("\n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<!-- /#page-content-wrapper -->\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Menu Toggle Script -->\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
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
