<%@ page import="edu.pitt.beans.*" %>
<!DOCTYPE html>
<html lang="en">
  
<%
    String name = (String) request.getSession().getAttribute("username");
    userBean user = (userBean) request.getSession().getAttribute("user");
    String email = user.getEmail();
%>

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Be a Volunteer</title>
        <script src="js/jquery-1.11.1.min.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <script src="js/jquery.backstretch.min.js"></script>
        <script src="js/retina-1.1.0.min.js"></script>
        <script src="js/scriptsVol.js"></script>
        <!-- CSS -->
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="css/form-elements.css">
        <link rel="stylesheet" href="css/styleVol.css">
        <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic&subset=latin,greek,greek-ext' rel='stylesheet' type='text/css'>
        <link href='https://fonts.googleapis.com/css?family=Montserrat|Source+Sans+Pro|Droid+Sans|Ubuntu|Arimo|Poiret+One|Dosis|Oxygen' rel='stylesheet' type='text/css'>

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
					<a class="navbar-brand" href="index.html">Bootstrap Registration Form Template</a>
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
                            	<p  style="font-family:Open Sans; color:#727272;font-size:20px">
	                            	this would be a great chance for you to help others in the same time increasing your writing skills.
                            	</p>
                            </div>
                        </div>
                    </div>
                    <div class="row">
<!--                     	<div class="col-sm-6 book">
                    		<img src="img/sideimg1.jpg" alt="">
                    	</div> -->
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
			                    <form role="form" action="" method="post" class="registration-form">
			                    	<div class="form-group">
			                    		<label class="" for="form-first-name" style="font-family: 'Poiret One', cursive;color:#fff;font-size:20px">Please give us your previous proofreading experience...</label>
			                        	<input type="text" name="form-first-name" placeholder="First name..." class="form-first-name form-control" id="form-first-name">
			                        </div>
			                        <div class="form-group">
			                        	<label class="sr-only" for="form-last-name">Last name</label>
			                        	<input type="text" name="form-last-name" placeholder= <% out.println(email); %> class="form-last-name form-control" id="form-last-name">
			                        </div>
			                        <div class="form-group">
			                        	<label class="sr-only" >University</label>
			                        	<input type="text" name="form-university" placeholder="Your university..." class="form-university form-control" id="form-university">
			                        </div>
			                        <button type="submit" class="btn">Register!</button>
                                    <button class="btn" id="back" style="float:right">Cancel</button>
			                    </form>
		                    </div>
                        </div>
                    </div>
                </div>
            </div>
            
        </div>


        <!-- Javascript -->
   <% out.println(email); %>
    

    </body>

</html>