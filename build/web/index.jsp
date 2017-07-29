<%-- 
    Document   : index.jsp
    Created on : May 13, 2017, 12:13:04 AM
    Author     : mohds
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <title>FoodSpot</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 <style>
  body{
    
            background-image: url("images/image9.jpg");
            background-repeat: no-repeat;
               
               
        }
</style>
 

    </head>
    
    <body style="background-color:lightgoldenrodyellow;">
 
    
    
        <nav class="navbar navbar-inverse">
  <div class="container-fluid">
       <div class="navbar-header">
      <a class="navbar-brand" href="#">FoodSpot</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="aboutus.jsp">About Us</a>
      </li>
      <li><a href="contactus.jsp">Contact Us</a></li>
      
         </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="signup.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>

<div class="container">
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
       <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>
    
    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
          <center> <img src="images/image1.jpg" alt="hii" width="640" height="360">
      </div>
       
      <div class="item">
          <center>  <img src="images/image2.jpg" alt="hii" width="640" height="360">
      </div>
    
      <div class="item">
          <center><img src="images/image3.jpg" alt="hii" width="640" height="360">
      </div>
      
       <div class="item">
           <center><img src="images/image4.jpg" alt="hii" width="640" height="360">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
    <br><br>

     <div class="container">
            <div class="row">
                <div class="col-sm-3">
                    <center><image src="images/image5.jpg" class="img-rounded" width="160" height="160"> <p style="font-size:200%;">Chinese Food<p> <a href="chinese.jsp" >  Click For Menu </a> </center>
       </div>
        <div class="col-sm-3">
            <center><image src="images/image6.jpg" class="img-rounded" width="160" height="160"> <p style="font-size:200%;">Non-Veg. Food<p>  <a href="nonveg.jsp" > Click For Menu </a></center>
       </div>
<div class="col-sm-3">
        <center><image src="images/image7.jpg" class="img-rounded" width="160" height="160"> <p style="font-size:200%;">South Indian Food<p>  <a href="southindian.jsp" > Click For Menu </a></center>
       </div>  
                <div class="col-sm-3">
        <center><image src="images/image8.jpg" class="img-rounded" width="160" height="160"> <p style="font-size:200%;">North Indian Food<p> <a href="northindian.jsp" > Click For Menu </a></center>
</br></br>
                </div>
            </div>
     </div>
</div>
                </body>
</html>