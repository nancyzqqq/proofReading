<%@ page import="edu.pitt.beans.*" %>
<!DOCTYPE html>
<html lang="en">

<%
String name = (String) request.getSession().getAttribute("username");
userBean user = (userBean) request.getSession().getAttribute("user");
//String email = user.getEmail();
%>

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Be a Volunteer</title>
    <script src="js/jquery-1.11.1.min.js"></script>
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <script src="js/jquery.backstretch.min.js"></script>
    
    
    <!-- CSS -->
    <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="css/form-elements.css">
    <link rel="stylesheet" href="css/styleVol.css">
    <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic&subset=latin,greek,greek-ext' rel='stylesheet' type='text/css'>
    <link href='https://fonts.googleapis.com/css?family=Montserrat|Source+Sans+Pro|Droid+Sans|Ubuntu|Arimo|Poiret+One|Dosis|Oxygen' rel='stylesheet' type='text/css'>
    <!-- JS -->
    <script src="js/scriptsVol.js"></script>

</head>

<body>

  <!-- Top menu -->
  <nav class="navbar navbar-inverse navbar-no-bg" role="navigation">
     <div class="container">
        <div class="navbar-header">
           <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#top-navbar-1">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="usermainpage.jsp"></a>
      </div>

  </div>
</nav>

<!-- Top content -->
<div class="top-content">

    <div class="inner-bg">
        <div class="container">
            <div class="row">
                <div class="col-sm-8 col-sm-offset-2 text" >
                    <h1 style="font-family:Open Sans; color:#727272" ><strong>ProofReading</strong> To be a VOLUNTEER now!</h1>
                    <div class="description">
                       <p  style="font-family:Open Sans; font-weight:400;color:black;font-size:20px">
                          this would be a great chance for you to help others in the same time increasing your writing skills.
                      </p>
                  </div>
              </div>
          </div>
          <div class="row">

            <div class="col-sm-12 form-box">
                <div class="form-top">
                    <div class="form-top-left">
                        <h3 style="font-size:30px">Give us your detailed information</h3>
                         <p style="font-size:20px">Fill in the form below:</p>
                     </div>
                     <div class="form-top-right">
                         <i class="fa fa-pencil"></i>
                    </div>
                </div>
                <div class="form-bottom">
                    <form role="form" action="" method="post" class="form-horizontal" style="font-family:Open Sans; color:#727272">
                        
                       
                            
                        <div class="form-group">
                            <div class="container">
                                <label class="" for="form-first-name" style="color:#fff;font-size:20px;display:block">Please give us your previous proofreading experience...
                                </label>
                            </div>
                        </div>


                        <!-- previous experience -->
                        <div class="form-group" id="experiences">
                            <div class='container oneExp' id='oneExp' style='width:100%;padding-top:5px'>
                                <div class='row'>
                                    <div class='col-md-2'> 

                                        <input type='text' class='form-control'  name='expTime' placeholder='time... (MM/YY)'>
                                    </div>
                                <!-- <div class="col-md-1"></div> -->
                                <div class='col-md-10' >
                                
                                    <input type='text' name='expDes' class='form-control'  placeholder='experience description...'>
                                 </div>
                            
                                </div>
                            </div>
                            
                            
                        </div>
                        <!-- plus -->
                        <div class="form-group">
                          <div class='container' style="width:100%">
                            <div class="row">
                                <div class='col-md-11' id='minusExp'>
                                    
                                </div>
                                <div class="col-md-1">
                                    <a class="btn" id="addMore"><i class="fa fa-plus fa-2x" style="color:#fff"></i></a>
                                </div>
                            </div>
                           </div>
                        </div>

                        <!-- user interest and available time -->
                        <div class="form-group">
                          <div class="container" style="width:100%">
                            <div class="row">
                                <div class = "col-md-6">
                                    <div class="container">
                                        <label for="" class=" control-label" style="font-family:Open Sans; color:#fff;font-size:20px;display:block">Domain of Interests</label>
                                    </div>
                                        <div class = "col-xs-4">
                                            <label class="checkbox-inline" style="font-family:Open Sans; color:#fff">
                                            <input class= "domainCheckbox" type="checkbox"  id="inlineCheckbox1" name= "domainCheckbox" value="Computer Science" > Computer Scienece
                                            </label>
                                        </div>
                                        <div class = "col-xs-4">
                                            <label class="checkbox-inline" style="font-family:Open Sans; color:#fff">
                                            <input class= "domainCheckbox" type="checkbox"  id="inlineCheckbox1" name= "domainCheckbox" value="Computer Science"> Information Science
                                            </label>
                                        </div>
                                        <div class = "col-xs-4">
                                            <label class="checkbox-inline" style="font-family:Open Sans; color:#fff">
                                             <input class= "domainCheckbox" type="checkbox"  id="inlineCheckbox1" name= "domainCheckbox" value="Computer Science"> Library Information Science
                                             </label>
                                        </div>
                                </div>
                                <div class = "col-md-6">
                                    <label class="control-label" style="font-family:Open Sans; color:#fff;font-size:20px;display:block">Your Available Time</label>
                                    <input type="text" name="form-avatime" placeholder="Time...(.e.g 5 hours per week)" class="form-control " id="form-avatime">
                                </div>
                                       
                            </div>
                          </div>
                        </div>
                        <!-- Strength of editing -->
   
                        <div class="form-group">
                            <div class="container">
                                 <label for="" class=" control-label" style="font-family:Open Sans; color:#fff;font-size:20px;display:block">Domain of Interests</label>
                            
                                <div class="row">
                                <div class = "col-xs-4">
                                            <label class="checkbox-inline" style="font-family:Open Sans; color:#fff">
                                            <input class= "strengthCheckbox" type="checkbox"  id="inlineCheckbox1" name= "strengthCheckbox" value="1" > Language Editing
                                            </label>
                                        </div>
                                        <div class = "col-xs-4">
                                            <label class="checkbox-inline" style="font-family:Open Sans; color:#fff">
                                            <input class= "strengthCheckbox" type="checkbox"  id="inlineCheckbox2" name= "strengthCheckbox" value="2"> Content Editing
                                            </label>
                                        </div>
                                        <div class = "col-xs-4">
                                            <label class="checkbox-inline" style="font-family:Open Sans; color:#fff">
                                             <input class= "strengthCheckbox" type="checkbox"  id="inlineCheckbox3" name= "strengthCheckbox" value="3"> Graphic Design
                                             </label>
                                        </div>
                                </div>
                            </div>
                        
                        </div>
                        <a class="btn" id="back" href="usermainpage.jsp" style="font-size:16px;margin-top:5px" >Cancel</a>
                        <button type="submit" class="btn btn-primary" style="float:right">Register!</button>
                       
                    </form>
               
            </div>
</div>
</div>
</div>

</div>




</body>

</html>