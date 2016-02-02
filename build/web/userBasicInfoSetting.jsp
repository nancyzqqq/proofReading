<%@ page import="edu.pitt.beans.*" %>

<!DOCTYPE html>
<html lang="en">

<%
String name = (String) request.getSession().getAttribute("username");
userBasicInfoBean userInfo = (userBasicInfoBean) request.getSession().getAttribute("userBasicInfo");

String firstname = userInfo.getFirstname();
String lastname = userInfo.getLastname();
String institution = userInfo.getInstitution();
String domainInterests= userInfo.getDomainInterests();
boolean cs = domainInterests.contains("Computer Science");
boolean is = domainInterests.contains("Information Science");
boolean lis = domainInterests.contains("Library Information System");


if(firstname == null){
firstname = "Please ini your firstname....";
}
if(lastname == null){
lastname = "Please ini your lastname....";
}
if(institution == null){
institution ="Please ini your institution...";
}

%>

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="description" content="">
  <meta name="author" content="">
  <script src="js/jquery-1.11.1.min.js"></script>
  <title>ProofReading User Basic Information Setting</title>

  <!-- Bootstrap Core CSS -->
  <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!-- Bootstrap Core JavaScript -->
  <script src="bootstrap/js/bootstrap.min.js"></script>
  <!-- Custom CSS -->
  <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">
  <link href="css/simple-sidebar.css" rel="stylesheet">
  <!-- Google Font CSS -->
  <link href='https://fonts.googleapis.com/css?family=Oswald|Montserrat|Dosis|Francois+One|Righteous|Roboto+Mono|Volkhov' rel='stylesheet' type='text/css'>
  <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic&subset=latin,greek,greek-ext' rel='stylesheet' type='text/css'>
  <!-- jquery dialog -->
  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
  

  <link rel="stylesheet" href="css/style.css">
  

   <script type="text/javascript" src="js/checkVol.js"></script>


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
        <li>
          <a href="usermainpage.jsp" style="color:#fff">My Home</a>
        </li>
        <li>
          <a href="requests.jsp" style="color:#fff">My Requests</a>
        </li>

        <li>
          <a id = "volPointer" href="#" style="color:#fff">My Voluntary</a>
        </li>

        <li style="background-color:rgba(256,256,256,0.2)">
          <a href="userBasicInfoSetting.jsp" style="color:#fff">Settings</a>
        </li>
        <li>
          <a href="#" style="color:#fff">Feedback</a>
        </li>
      </ul>
    </div>
    <!-- /#sidebar-wrapper -->

    <!-- Page Content -->
    <div id="page-content-wrapper" style="height:600px;background-color:rgba(191,189,189,0.20)">
     <div class="container-fluid" id="requestForm" style="font-family:Open Sans">
      <div class="top-content">

        <div class="inner-bg" style="padding:0">
          <div class="container">

          </div>
          <div class="row">
            <div class="col-sm-12 col-sm-offset-3 form-box" style="margin-left:0">
              <div class="form-top" style="background-color:rgba(255,255,255,0)">
                <div class="form-top-left">
                  <h3 style="color:#1976D2;font-family: 'Montserrat', sans-serif;font-size:40px"><strong>Optimize</strong> your file now!</h3>

                  <p style="color:#2196F3;font-size:20px">Please enter the basic information about your request:</p>
                  <p id = "username" ><% out.println(name); %></p>
                </div>
                <div class="form-top-right">
                  <i class="fa fa-file-text-o" style="color:#F44336"></i>
                </div>
              </div>
              <div class="form-bottom" style="background-color:rgba(187,222,251,0.35)">
                <form role = "form" action="userSettingServlet" method="post" class="settingform">
                  <div class="row">
                    <div class="col-md-6">
                      <label for="" class="col-md-4 control-label">First Name</label>
                      <div class="col-md-8">
                        <input type="text" class="form-control" id="firstname" name="form_firstname" placeholder=<% out.println(firstname); %>>
                      </div>
                    </div>

                    <div class="col-md-6">
                      <label for="i" class="col-md-4 control-label">Last Name</label>
                      <div class="col-md-8">
                        <input type="text" class="form-control" id="lastname" name ="form_lastname" placeholder=<% out.println(lastname); %>>
                      </div>
                    </div>

                  </div>

                  <div class="row" style="padding-top:10px">
                    <div class="col-md-12">
                      <label for="" class="col-md-2 control-label">Institution</label>
                      <div class="col-md-10" id="institution">
                        <input type="text" class="form-control" name ="form_institution" id="institution1" placeholder=<% out.println(institution); %>>
                      </div>
                    </div>
                  </div>

                  <div class="row" style="padding-top:10px">
                    <div class="col-md-12" id="domain">
                      <label for="" class="col-md-4 control-label">Domain of Interests</label>
                      <div class="col-md-12">
                       <label class="checkbox-inline">
                        <input class= "domainCheckbox" type="checkbox"  id="inlineCheckbox1" name= "domainCheckbox" value="Computer Science" <% if(cs) out.println("checked"); %> > Computer Scienece
                      </label>
                      <label class="checkbox-inline">
                        <input class= "domainCheckbox" type="checkbox" id="inlineCheckbox2" name= "domainCheckbox" value="Information Science" <% if(is) out.println("checked"); %>> Information Science
                      </label>
                      <label class="checkbox-inline">
                        <input class= "domainCheckbox" type="checkbox" id="inlineCheckbox3" 
                        name= "domainCheckbox" value="Library Information System" <% if(lis) out.println("checked"); %>> Library Information System
                      </label>
                    </div>
                  </div>
                </div>
                <div class="row" style="padding-top:20px">
                 <button type="submit" class="btn" id="setting" style="color:#fff">Change!</button>
               </div>
             </form>




           </div>
         </div>
       </div>

     </div>
   </div>

 </div>
</div>
</div>
<!-- /#page-content-wrapper -->

</div>
 <div id="dialog" title="Basic dialog">
            <p>You have to register to be a volunteer!</p>
</div>


<script type="text/javascript">


</script>


</body>

</html>
