<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"> 

<link href="./CSS/Reg.css" rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css2?family=Alata&family=Slabo+27px&display=swap" rel="stylesheet">
     <link href="https://fonts.googleapis.com/css2?family=Share&display=swap" rel="stylesheet">
     <title>Document</title>
     <script>
     function valid(){
    	 console.log("hello");
    	 var name = document.MyForm.Fullname.value;
    	 var email = document.MyForm.email.value;
    	 var phone = document.MyForm.mobileNumber.value;
    	 var password = document.MyForm.password.value;
    	 var password2 = document.MyForm.password2.value;
    	 var pin = document.MyForm.pincode.value;
 //==============================================================================================
    	 if(name==""){
    		 document.getElementById("sp1").innerHTML = "";
    		 document.getElementById("sp1").innerHTML = "*Please enter name";
    		 document.getElementById("sp1").style.color = 'red';
    		 //alert("Please enter name");
    		 return false;
    	 } 
    	 if((name.length<5)|| (name.length>30)){
    		 document.getElementById("sp1").innerHTML = "";
    		 document.getElementById("sp1").innerHTML = "*Name is of invalid length";
    		 document.getElementById("sp1").style.color = 'red';
    		 return false;
    	 }
    	 
    	 
 //============================================================================================== 	 
    	 
    	  if(email == "") {
    		 document.getElementById("sp2").innerHTML = "*Please enter your Email";
    		 document.getElementById("sp2").style.color = 'red';
    		 return false;
    	    } else {
    	        var regex = /^\S+@\S+\.\S+$/;
    	        if(regex.test(email) === false) {
    	        	document.getElementById("sp2").innerHTML = "*Please Enter Valid Email-Id";
    	    		 document.getElementById("sp2").style.color = 'red';
    	    		 return false;
    	        } 
    	    }
//===============================================================================================   	  
    	  if(phone==""){
     		 document.getElementById("sp3").innerHTML = "*Please enter your Phone No.";
     		 document.getElementById("sp3").style.color = 'red';
     
     		 return false;
     	 } 
     	 if((phone.length<10)|| (phone.length>10)){
     		 document.getElementById("sp3").innerHTML = "*Phone No. must be 10 digits";
     		 document.getElementById("sp3").style.color = 'red';
     		 return false;
     	 }
 //============================================================================================== 	 
     	if(password==""){
    		 document.getElementById("sp4").innerHTML = "*Please enter your Password";
    		 document.getElementById("sp4").style.color = 'red';
    		 return false;
     	}
     	else if(password.length < 5){
     		document.getElementById("sp4").innerHTML = "*Password must be greater than 5 digits";
   		 	document.getElementById("sp4").style.color = 'red';
   		 	return false;
     	}
//=============================================================================================
     	if(password2==""){
   		 document.getElementById("sp5").innerHTML = "*Please Re-enter your Password";
   		 document.getElementById("sp5").style.color = 'red';
   		 return false;
    	}
    	else if(password != password2){
    		document.getElementById("sp5").innerHTML = "*Password does not match";
  		 	document.getElementById("sp5").style.color = 'red';
  		 	return false;
    	}
    	
//================================================================================================
     	if(pin==""){
      		 document.getElementById("sp6").innerHTML = "*Please enter Pin code";
      		 document.getElementById("sp6").style.color = 'red';
      		 return false;
       	}
       	else if(pin.length < 6 || pin.length > 6){
       		document.getElementById("sp6").innerHTML = "*Pin Code must have 6 digits";
     		 	document.getElementById("sp6").style.color = 'red';
     		 	return false;
       	}
	
     }
     
     
     
     </script>
 
</head>
<body>
<main>
    <div class="div1" > C-DAC STUDENT PORTAL</div>
    <div ><a class="div2" href="http://localhost:8081/AdvJava/index.jsp" style="text-decoration: none;" >HOME</a></div>
    <div  float:left;><a class="div3" href="http://localhost:8081/AdvJava/course.jsp" style="text-decoration: none;" >COURSE</a> </div>
    <div  ><a class="div4" href="http://localhost:8081/AdvJava/Gallary.jsp" style="text-decoration: none;">GALLARY</a></div>
    <div ><a class="div5" href="http://localhost:8081/AdvJava/Stafflogin.jsp" style="text-decoration: none;">STAFF LOGIN</a></div>
    <div ><a class="div7" href="http://localhost:8081/AdvJava/Studentlogin.jsp" style="text-decoration: none;"> STUDENT LOGIN </a></div>
    <div class="div6"> 


 <div class="container">

            <div class="title">Registration</div>
            <div class="content">
            
              <form name="MyForm" action="register.cdac">
              
                <div class="user-details">
                  <div class="input-box" name="user">
                    <span class="details">Full Name</span>
                    <input type="text" id="red" name="Fullname" class="form-control" placeholder="Enter your name" required>
                    <div id="sp1"></div>
                  </div>
                 
                  <div class="input-box">
                    <span class="details">Email</span>
                    <input type="text" name="email" id="email" placeholder="Enter your email" required>
					<span id="sp2"></span>                  
                  </div>
                  <div class="input-box">
                    <span class="details">Phone Number</span>
                    <input type="text" name="mobileNumber" id="mobileNumber" placeholder="Enter your number" required>
                  	<span id="sp3"></span>
                  </div>
                  <div class="input-box">
                    <span class="details">Password</span>
                    <input type="text" name="password" id="password" placeholder="Enter your password" required>
                  	<span id="sp4"></span>
                  </div>
                  <div class="input-box">
                    <span class="details">Re-Enter Password</span>
                    <input type="text" name="password2" id="password2" placeholder="Enter your password" required>
                  	<span id="sp5"></span>
                  </div>
                  <div class="input-box">
                    <span class="details">Pincode</span>
                    <input type="text" name="pincode" id="pincode" placeholder="Confirm your password" required>
                  	<span id="sp6"></span>
                  </div>
                  <div class="input-box">
                    <span class="details">Birthdate</span>
                    <input type="date" name="Birthday" id="Birthday" placeholder="Birthday" required>
                  </div>
                  <div class="input-box">
                    <span class="details">Education</span>
                    <input type="text" name=" placeholder="Your Education" required>
                  </div>
                  
                </div>
    		 
                <div class="gender-detail">
                    <input type="radio" name="course" value="Engineering" id="dot-1">
                    <input type="radio" name="course" value="Commerece" id="dot-2">
                    <input type="radio" name="course" value="Management" id="dot-3">
                    <span class="gender-title">Course</span>
                    <div class="category">
                      <label for="dot-1">
                      <span class="dot one"></span>
                      <span class="course">Engineering</span>
                    </label>
                    <label for="dot-2">
                      <span class="dot two"></span>
                      <span class="course">Commerece</span>
                    </label>
                    <label for="dot-3">
                      <span class="dot three"></span>
                      <span class="course">Management</span>
                      </label>
                    </div>
                  </div> 
    

    
                <div class="button"> <center>
                  <div class="button"> <center>
                  <input type="submit" style="margin-left: 218px;padding-left: ‒0;"  value="Register" onClick="return valid();">
				  <input type="reset"  style="margin-left: 218px; margin-top: 15px; ;" value="Reset" ></center>
                </div>
                
              </form>
            </div>
          </div>
    </div>
    <div class="div9"><p> Website Policies|Copyright Policy|Terms & Conditions |Help|© 2022 C-DAC. All rights reserved|Last Updated: Tuesday, January 04, 2022</p></div>
    </main>
</body>

</html>