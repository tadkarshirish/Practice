<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"> 

    <link rel="stylesheet" href="./CSS/stylelstudent.css">
    <link rel="stylesheet" href="./CSS/stylelstudent2.css">
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
    <div ><a class="div5" href="http://localhost:8081/AdvJava/Stafflogin.jsp" style="text-decoration: none;">STAFF LOGIN</a></div>
    <div ><a class="div7" href="http://localhost:8081/AdvJava/Studentlogin.jsp" style="text-decoration: none;"> LOGOUT </a></div>
  <div class="div6">    
<img src="./CSS/Images/photo.jpg" alt="" style="position:absolute; margin: 100px 0px 0px 350px ;"> 
        <span>
             <div class="whitebox">
             
         </div></span>
    </div>
    <div class="text1">
    <h1 style="  font-family: 'Poppins', sans-serif;">${studentData.name }</h1>
    <div style="display:inline;">
    <p>Course : &emsp;&emsp;&emsp;&emsp;&ensp;        ${studentData.course }</p>
    <p>Roll No : &emsp;&emsp;&emsp;&emsp;&ensp;        ${studentData.id }</p>
<p>Admission Date: &emsp; 03/04/2022</p>
<p>Email: &emsp;&emsp;&emsp; &ensp;&emsp;&emsp;${studentData.email }</p>
<p>Phone no: &emsp;&emsp;&emsp;&ensp;&ensp; ${studentData.mobileNumber }</p>
<p>Birth  :&emsp;&emsp; &emsp;&emsp;&emsp;&ensp;    </p> 
<p>Address : Lorem ipsum dolor sit amet consectetur <br> adipisicing elit. Quo, reprehenderit.</p>
</div>


        

    <div id="feedback-main">
            <div id="feedback-div">
              <form action="Requpdate.cdac" class="form" id="feedback-form1" name="form1" enctype="multipart/form-data">
          
          <h2>Update Request</h2>
          	 
          	 <select name="UpdateSection" class="validate[required,custom[email]]" >
  				<option name ="Course" values="Course"> Course</option>
  				<option name ="Email" values="Email">Email</option>
  				<option name = "Mobileno" values="Mobileno">Phone No</option>
 			 	 </select>
                <p class="name">
                  <input name="rollno" type="text" class="validate[required,custom[email]]" required placeholder="Roll No" id="feedback-name" />
                </p>
                
                <p class="email">
                  <input id="UpdateValue" name="UpdateValue" type="text" class="validate[required,custom[email]] feedback-input" id="feedback-email" placeholder="Data To Update" required />
                </p>
          
                <p class="text">
                  <textarea id="fcmt" name="reason" type="comment" class="validate[required,length[6,300]] feedback-input" id="feedback-comment" required placeholder="Explanation , reason for updation"></textarea>
                </p>
         
                <div class="feedback-submit">
                <button  type="submit" id="feedback-button-blue" onclick="submit_alert()" >Update</button>
    
                  <!-- <input type="submit" value="SEND" id="feedback-button-blue" onclick="submit()" /> -->
                 
                  <div class="feedback-ease"></div>
                  
                 
                  
                </div>
              </form>
            </div>
          </div>
          <button id="popup" class="feedback-button" onclick="toggle_visibility()">Update Request</button>
        

                </div>
                  </div>
              </div> 
     </main>
</body>
<script type="text/javascript">
function toggle_visibility() {
	
	   console.log("entered feed");
	    var e = document.getElementById('feedback-main');
	    
	    if(e.style.display == 'block')
	       e.style.display = 'none';
	    else
	       e.style.display = 'block';
	 };</script>
</body>
<script>
function submit_alert() {
      alert("Your Request is submited for validation");
   };
</script>
</html>