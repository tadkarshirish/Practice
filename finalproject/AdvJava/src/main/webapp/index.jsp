<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1"> 
<link href="./CSS/styel.css" rel="stylesheet" type="text/css">
<link href="./CSS/style.css" rel="stylesheet" type="text/css">
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
    <div ><a class="div7" href="http://localhost:8081/AdvJava/Studentlogin.jsp" style="text-decoration: none;"> STUDENT LOGIN </a></div>
    <div class="div6"> 

<br>
 <h2 style="margin-left: 180px;"> Learn From Home Earn From Home </h2>
    
<p style="width:350px; height:150px;margin-left: 180px;"> “Be courageous. Challenge orthodoxy. Stand up for what you believe in. When you are in your rocking chair talking to your grandchildren many years from now, be sure you have a good story to tell.”
 <br> — Amal Clooney <br>
  <br>
  “There is nothing impossible to they who will try.”
  — Alexander the Great
  

  </p>

        <button class="button" style="vertical-align:middle; position:absolute;margin-top:105px ; margin-left:220px; "><span><a href="http://localhost:8081/AdvJava/Register.jsp"> Register Now </a></span></button>
        <div id="feedback-main">
            <div id="feedback-div">
              <form  class="form" id="feedback-form1" name="form1" enctype="multipart/form-data">
          
                <p class="name">
                  <input name="name" type="name" class="validate[required,custom[onlyLetter],length[0,100]] feedback-input" required placeholder="Name" id="feedback-name" />
                </p>
          
                <p class="email">
                  <input id="femail" name="email" type="email" class="validate[required,custom[email]] feedback-input" id="feedback-email" placeholder="Email" required />
                </p>
          
                <p class="text">
                  <textarea id="fcmt" name="comment" type="comment" class="validate[required,length[6,300]] feedback-input" id="feedback-comment" required placeholder="Hey, I really love the site but I believe that you could incorporate some ..... and also get rid of the ...... on the section."></textarea>
                </p>
         
                <div class="feedback-submit">
                  <button  id="feedback-button-blue" onclick="submit1()" >SEND</button>
                  <!-- <input type="submit" value="SEND" id="feedback-button-blue" onclick="submit()" /> -->
                 
                  <div class="feedback-ease"></div>
                  
                 
                  
                </div>
              </form>
            </div>
          </div>
          <button id="popup" class="feedback-button" onclick="toggle_visibility()">Feedback</button>
        

                </div>
                  </div>
              </div>

        <!-- <div class="Socialbox">Shirish</div> -->
    </div>




    <div class="div9"><p> Website Policies|Copyright Policy|Terms & Conditions |Help|© 2022 C-DAC. All rights reserved|Last Updated: Tuesday, January 04, 2022</p></div>
    </main>
</body>
</body>
</html>