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
</head>
<body>
<main>
    <div class="div1" > C-DAC STUDENT PORTAL</div>
    <div ><a class="div2" href="./index.html" style="text-decoration: none;" >HOME</a></div>
    <div  float:left;><a class="div3" href="./Courses/Courses.html" style="text-decoration: none;" >COURSE</a> </div>
    <div  ><a class="div4" href="./gallery/Gallery.html" style="text-decoration: none;">GALLARY</a></div>
    <div ><a class="div5" href="./gallery/Gallery.html" style="text-decoration: none;">STAFF LOGIN</a></div>
    <div ><a class="div7" href="./Login/login.html" style="text-decoration: none;"> STUDENT LOGIN </a></div>
    <div class="div6"> 


 <div class="container">

            <div class="title">Registration</div>
            <div class="content">
            
              <form action="register.cdac">
              
                <div class="user-details">
                  <div class="input-box">
                    <span class="details">Full Name</span>
                    <input type="text" name="Fullname" id="Fullname" placeholder="Enter your name" required>
                  </div>
                 
                  <div class="input-box">
                    <span class="details">Email</span>
                    <input type="text" name="email" id="email" placeholder="Enter your email" required>
                  </div>
                  <div class="input-box">
                    <span class="details">Phone Number</span>
                    <input type="text" name="mobileNumber" id="mobileNumber" placeholder="Enter your number" required>
                  </div>
                  <div class="input-box">
                    <span class="details">Password</span>
                    <input type="text" name="password" id="password" placeholder="Enter your password" required>
                  </div>
                  <div class="input-box">
                    <span class="details">Pincode</span>
                    <input type="text" name="pincode" id="pincode" placeholder="Confirm your password" required>
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
                  <input type="submit" style="margin-left: 218px;padding-left: ‒0;"  value="Register"">
                  
                  <input type="reset"  style="margin-left: 218px; margin-top: 15px; ;" value="Reset" ></center>
                </div>
                
              </form>
            </div>
          </div>
    </div>
    <div class="div9"><p> Website Policies|Copyright Policy|Terms & Conditions |Help|© 2022 C-DAC. All rights reserved|Last Updated: Tuesday, January 04, 2022</p></div>
    </main>
</body>
</body>
<script>

</script>
</html>