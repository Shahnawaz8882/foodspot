<%-- 
    Document   : login.jsp
    Created on : Jul 6, 2017, 10:47:57 PM
    Author     : mohds
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
     <html lang="en" ng-app>
       
 <body background="images/image17.jpg">
            
   
 <style>
        
        
input[type=text], input[type=password] 
        
       
 {
    width: 35%;
    padding: 12px 20px;
   
 margin: 8px 0;
    display: inline-block;
   
 border: 1px solid #ccc;
    box-sizing: border-box;
}


button {
    background-color: #4CAF50;
   
 color: white;
    
padding: 14px 20px;
   
 margin: 8px 0;
   

 border: none;
   
 cursor: pointer;
    
width: 35%;
}


input.ng-invalid.ng-dirty{border:1px solid red;}
  
   
 </style>
    
<head>
      
       
 <title> Login</title>
       
 <script src="./js/angular.min.js"></script>
   
 </head>
   
    
        
       
 <h1>Sign in </h1>
  
  <div class="container">
  
 
 </div>
      
              
 
     <form action="LoginServlet" name="myform" method="post">
     
    ${msg}
 
     <center> <label><b>Email</b></label>
     
 <input type="text" placeholder="Enteremail" name="mail" ng-model="user.name" />
   
 <span ng-show="myform.name.$dirty && myform.name.$error.required"></span><br>
           
  
  <label><b>Password</b></label>
 
<input type="password" placeholder="Enter Password" name="pass" ng-model="user.psw" />
   
 <span ng-show="myform.psw.$dirty && myform.psw.$error.required"></span><br>

        
 <button type="submit">Login</button></center>
    
    
  </form><br>
      
   

 <center>   <a href ="#">Forget password?</a></center>
      

    
 </body>
    

</html>

   