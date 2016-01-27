<%-- 
    Document   : requests
    Created on : Jan 26, 2016, 4:50:55 PM
    Author     : zhangqian
    --%>

    <%@page contentType="text/html" pageEncoding="UTF-8"%>
    <!DOCTYPE html>
    <html>
    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <script src="js/jquery-1.11.1.min.js"></script>
        <title>Requests</title>
        <!-- Data Table -->
        <script type="text/javascript" src="https://cdn.datatables.net/r/bs-3.3.5/jqc-1.11.3,dt-1.10.8/datatables.min.js"></script>
        <link href="https://cdn.datatables.net/1.10.10/css/jquery.dataTables.min.css" rel="stylesheet">
        <!-- Bootstrap Core CSS -->
        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <!-- Bootstrap Core JavaScript -->
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <!-- Custom CSS -->
        <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">
        <link href="css/simple-sidebar.css" rel="stylesheet">
        <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic&subset=latin,greek,greek-ext' rel='stylesheet' type='text/css'>
        <link rel="stylesheet" href="css/style.css">
        <script type="text/javascript" src="js/script1.js"></script>

        <style type="text/css">
        td {
            word-break: normal
        }
        </style>
    </head>
    <body>
        <div id="wrapper">
           <div id="sidebar-wrapper" style="font-family:Open Sans">
            <ul  class="sidebar-nav">
                <li class="sidebar-brand" >
                    <a href="usermainpage.jsp" style="color:#fff">
                        ProofReading
                    </a>
                </li>
                <li>
                    <a href="usermainpage.jsp" style="color:#fff">My Home</a>
                </li>
                <li>
                    <a href="requests.jsp" style="color:#fff">My Requests</a>
                </li>

                <li>
                    <a href="#" style="color:#fff">Events</a>
                </li>

                <li>
                    <a href="userBasicInfoSetting.jsp" style="color:#fff">Settings</a>
                </li>
                <li>
                    <a href="#" style="color:#fff">Feedback</a>
                </li>
            </ul>
        </div>
        <div id="page-content-wrapper">
            <div class="container-fluid" id="mainIntro">
                <div class="row">
                    <div class="col-lg-12" style="font-family:Open Sans">
                        <h1 style="display:block;width:100%;height:100px;">See all requests you've made here,<h2 id = "username"><%=request.getSession().getAttribute("username")%></h2></h1>
                        <hr>
                        <div id="content">
                         <table id="table" class="display"  width="100%">
                          
                        </table>


            </div>


            <div class="row">

            </div>
        </div>
    </div>
</div>
</div>
</div>
</body>
</html>
