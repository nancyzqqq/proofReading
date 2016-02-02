<%@ page import="edu.pitt.beans.*" %>
<!DOCTYPE html>
<html lang="en">

<%
//        String username = reu....;
String name = (String) request.getSession().getAttribute("username");
userBean user = (userBean)request.getSession().getAttribute("user");
int type = user.getType();
String url = "";
if(type == 0){
    
}
%>

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- jquery -->
    
    <script src="js/jquery-1.11.1.min.js"></script>
    <title>ProofReading Mainpage</title>

    <!-- Bootstrap Core CSS -->
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- Bootstrap Core JavaScript -->
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <!-- Custom CSS -->
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">
    <link href="css/simple-sidebar.css" rel="stylesheet">
    <!-- google fonts -->
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic&subset=latin,greek,greek-ext' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="css/style.css">
    <!-- jquery dialog -->
    <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
    <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
    <script type="text/javascript" src="js/script1.js"></script>
    

</head>

<body>

    <div id="wrapper">

        <!-- Sidebar -->
        <div id="sidebar-wrapper" style="font-family:Open Sans">
            <ul  class="sidebar-nav">
                <li class="sidebar-brand" >
                    <a href="usermainpage.jsp" style="color:#fff">
                        ProofReading
                    </a>
                </li>
                <li style="background-color:rgba(256,256,256,0.2)">
                <a href="usermainpage.jsp" style="color:#fff">My Home</a>
                </li>
                <li>
                    <a href="requests.jsp" style="color:#fff">My Requests</a>
                </li>

                <li>
                    <a id = "volPointer" href="#" style="color:#fff">My Voluntary</a>
                </li>

                <li>
                    <a href="userBasicInfoSetting.jsp" style="color:#fff">Settings</a>
                </li>
                <li>
                    <a href="logout.jsp" style="color:#fff">Log out</a>
                </li>
            </ul>
        </div>
        <!-- /#sidebar-wrapper -->

        <!-- Page Content -->
        <div id="page-content-wrapper">
            <div class="container-fluid" id="mainIntro">
                <div class="row">
                    <div class="col-lg-12" style="font-family:Open Sans">
                        <h1 style="display:block;width:100%;height:100px;">Welcome to Panther Editing Service, <h2 id="username"><%=request.getSession().getAttribute("username") %></h2></h1>
                        <hr>
                        <div id="content">
                            <p><strong style="color:#0097A7">Our</strong> vision is to break research inequality caused by language. We would like to see more Chinese research being published and wish that Chinese scholars can make long-lasting impact. We invite you to get involved in the whole paper editing process and learn more writing skills. At the end, we hope you gain the ability of composing high-quality research publication (in terms of language) independently.

                            </p>
                            <p>Panther Editing Service (PES) is a language and content proofreading service for scientific publication. Our current service only targets at Chinese scholars. Aside from novelty, we see three major reasons that impede researchers to publish their work on International conferences and journals ? translation quality, language use and content representation (e.g., paragraph organization, design of figures and tables). We have three different teams working on that, each taking charge of one aspect. Particularly, we hire native English speakers for language editing.</p>
                            <p>We aim to respond each submission within <strong style="color:#0097A7">one week</strong>. Our current price is <strong style="color:#0097A7">$18/hour</strong>. A paper with 10,000 words usually requires 6-7 hours. We are starting from January 4th, 2016.</p>
                        </div>
                        <div class="row">
                            <a href="#menu-toggle" class="btn btn-default col-xs-4" id="menu-toggle"><i class="fa fa-file-text"></i> Request Now!</a>
                            <p style="display:block" class="col-md-4"> or </p>
                            <a href="regVol.jsp" class="btn btn-default col-xs-4" id="menu-toggle"><i class="fa fa-user"></i> Be a volunteer!</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="container-fluid" id="requestForm" style="font-family:Open Sans">
              <div class="top-content">

                <div class="inner-bg" style="padding:0">
                    <div class="container">

                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 form-box">
                            <div class="form-top">
                                <div class="form-top-left">
                                    <h3>Quickly make a proofreading request now!</h3>
                                    <p>Please enter the basic information about your request:</p>
                                </div>
                                <div class="form-top-right">
                                    <i class="fa fa-file-text-o"></i>
                                </div>
                            </div>
                            <div class="form-bottom">
                                <form role="form" action="requestFormServlet" method="post" class="login-form">
                                    <div class="form-group">
                                        <label class="sr-only">Paper Name</label>
                                        <input type="text" name="form-papername" placeholder="Papername..." class="form-papername form-control" id="form-papername">
                                    </div>
                                    <div class="form-group">
                                        <label class="sr-only">Paper Deadline</label>
                                        <input type="text" name="form-deadline" placeholder="Preferred Paper Deadline...(MM/YYYY)" class="form- form-control" id="form-deadline">
                                    </div>

                                    <div class="form-group">
                                        <label class="sr-only" for="">Domain</label>
                                        <select name="form-paperDomain" id = "form-paperType" class="form-control" >
                                          <option value = "cs">Computer Science</option>
                                          <option value = "is">Information Science</option>
                                          <option value = "lis" >Library Information Science</option>
                                      </select>
                                  </div>
                                  <div class="form-group">
                                    <label class="sr-only">General Discription</label>

                                    <textarea type="text" name="form-description" placeholder="General Discription..." id="form-description" class="form-control" rows="3"></textarea>
                                </div>
                                <div class="form-group">
                                    <label class="sr-only">Requirement</label>

                                    <textarea type="text" name="form-requirement" placeholder="Requirements...." id="form-requirement" class="form-control" rows="3"></textarea>
                                </div>
                                <button type="submit" class="btn" id="addNewRequest" style="color:#fff">Request!</button>
                                <hr style="margin:10px;">
                                <button type= "button" class="btn" id="backToMain" style="color:#fff">Back to main menu</button>

                            </form>

                        </div>
                    </div>
                </div>

            </div>


        </div>
        <div id="dialog" title="Basic dialog">
            <p>You have to register to be a volunteer!</p>
        </div>

    </div>
</div>
</div>
<!-- /#page-content-wrapper -->

</div>





<!-- Menu Toggle Script -->


</body>

</html>
