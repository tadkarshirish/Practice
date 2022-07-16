<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style>
.button {
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}

.button1 {background-color: #4CAF50;} 
.button2 {background-color: #C3272B;} 
</style>
<head>
<meta charset="ISO-8859-1"> 

    <link rel="stylesheet" href="./CSS/stylelstaff.css">
<link href="https://fonts.googleapis.com/css2?family=Alata&family=Slabo+27px&display=swap" rel="stylesheet">
     <link href="https://fonts.googleapis.com/css2?family=Share&display=swap" rel="stylesheet">
     <title>Document</title>
</head>
<body>
<main>
    <div class="div1" > C-DAC STUDENT PORTAL</div>
 <div ><a class="div2" href="http://localhost:8081/AdvJava/index.jsp" style="text-decoration: none;" >HOME</a></div>
    <div  float:left;><a class="div3" href="http://localhost:8081/AdvJava/course.jsp" style="text-decoration: none;" >COURSE</a> </div>
    <div  ><a class="div4" href="http://localhost:8081/AdvJava/Gallary.jsp" style="text-decoration: none;">GALLARY</a></div>
    <div ><a class="div5" href="http://localhost:8081/AdvJava/Stafflogin.jsp" style="text-decoration: none;">LOGOUT</a></div>
    <div ><a class="div7" href="http://localhost:8081/AdvJava/Studentlogin.jsp" style="text-decoration: none;"> STUDENT LOGIN </a></div>
  
    <div class="div6">    
<img src="./CSS/Images/photo.jpg" alt="" style="position:absolute; margin: 100px 0px 0px 350px ;"> 
        <span>
             <div class="whitebox">
             
         </div></span>
    </div>
    <div class="text1">
    <h1 style="  font-family: 'Poppins', sans-serif;">${staffData.name }</h1>
    <h3 style=" position:inline; margin:0px 0px 40px 30px;font-family: 'Poppins', sans-serif;">Staff </h3>
    
    <div style="display:inline;">
    <p>Emp No : &emsp;&emsp;&emsp;&emsp;&ensp;   ${staffData.id}</p>
<p>Joining Date: &emsp;</p>
<p>Email: &emsp;&emsp;&emsp; &ensp;&emsp;&emsp;${staffData.email}</p>
<p>Phone no: &emsp;&emsp;&emsp;&ensp;&ensp; ${staffData.mobileNumber}</p>
<p>Pincode  :&emsp;&emsp; &emsp;&emsp;&emsp;&ensp;  ${staffData.pincode} </p>
<p>Address : Lorem ipsum dolor sit amet consectetur <br> adipisicing elit. Quo, reprehenderit.</p>


<form action="StudentList.cdac" )"><button type="submit" class="button button1" > Check Student List </button></form>

</div>
</div>
     </main>
</body>
</body>
</html>