<%-- 
    Document   : signup
    Created on : Jul 6, 2017, 10:52:28 PM
    Author     : mohds
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    
    <head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <title>Signup</title>

        <script src="./js/angular.min.js"></script>
  </head>  
  <style>
    
    input[type=firstname] , input[type=lastname] , input[type=text], 
    
 input[type=password], input[type=text], input[type=password], 
 
input[type=address], input[type=contact] 
,input[type=text], input[type=password] 
{

    width: 20%;
    padding: 12px 20px;

    margin: 8px 0;
  
  display: inline-block;
    
border: 1px solid #ccc;
  
  box-sizing: border-box;

}


button 
{
    background-color: #4CAF50;
    
color: white;
   
 padding: 14px 20px;
  
  margin: 10px 0;
   
 border: none;
 
   cursor: pointer;

    width: 20%;
}




.cancelbtn {

    padding: 12px 20px;
    
background-color: #f44336;
}


.cancelbtn,
.signupbtn {
    
    width: 20%;
}


input.ng-invalid.ng-dirty{border:1px solid red;}

#form{
     width: 500px;
    height: 500px;
    margin-left: 350px;
   
}

#h1{
   margin-left: 100px;
   font-family: Cooper;
   color: black;
   font-size: 50px;
}
#data{
    font-family: Algerian;
    color:#003333;
    font-size: 20px;
    
}

    input.ng-invalid.ng-dirty{border:1px solid red;}
    
</style>

  <body background="images/image17.jpg">

  <div id="form">
      <h1 id="h1">Sign Up Form</h1>
    
    <form action="RegisterServlet" method="post">
           
        <label id="data"><b>Name</b></label>
 
             <input type="text" placeholder="Enter First Name" name="name" required><br>
             <span id="error" ng-show="myform.name.$dirty && myform.name.$error.required">Required!</span><br>
 
 <label id="data"><b>Email</b></label>
 <input type="email" placeholder="Enter Email" name="email" ng-model="user.email"  required/><br>
<span id="error" ng-show="myform.email.$dirty && myform.email.$error.required">Required!</span>
<span id="error" ng-show="myform.email.$dirty && myform.email.$error.email">Not an email.!</span>
<br>

   
 <label id="data"><b>Password</b></label>
 <input type="password" placeholder="Enter Password" name="password" ng-model="user.password" ng-change="ValidatePassword()" required ng-minlength="3" ng-maxlength="9" maxlength="10"/><br>
<span id="error" ng-show="myform.password.$dirty && myform.password.$error.required">Required!</span>
<span id="error" ng-show="myform.password.$dirty && myform.password.$error.minlength">To Short.!</span>
<span id="error" ng-show="myform.password.$dirty && myform.password.$error.maxlength">Strong.!</span><br>
 
<label id="data"><b>Repeat Password</b></label>
<input type="password" placeholder="Repeat Password" name="psw-repeat" ng-model="user.confirm" ng-change="ValidatePassword()" required /><br>
<span id="error" class="text text-danger" ng-show="passwordmismatch">Passwords do not match</span><br>


<label id="data"><b>Contact</b></label>
<input type ="number" placeholder="Enter Contact no. " name="contact" ng-model="user.number" required ng-minlength="10" maxlength="10"/><br>
<span id="error" ng-show="myform.number.$dirty && myform.number.$error.required">Required!</span>
<span id="error" ng-show="myform.number.$dirty && myform.number.$error.minlength">Invalid Number.!</span>
<br>


  
  
 <button type="button" class="cancelbtn">Cancel</button>
      
<button type="submit" >Sign Up</button>

</form>
  </div>
</body>

</html>

   

      
        