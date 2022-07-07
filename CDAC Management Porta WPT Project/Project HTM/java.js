function toggle_visibility() {
   console.log("entered feed");
    var e = document.getElementById('feedback-main');
    if(e.style.display == 'block')
       e.style.display = 'none';
    else
       e.style.display = 'block';
 };


 function submit1()
 {
 console.log("entered submit");
     var femail = document.getElementById("femail").value;
     var fcmmt= document.getElementById("fcmt").value;


 localStorage.setItem("Femail",femail);
 localStorage.setItem("fcmmt",fcmmt);
    
  alert("Feedback Submitted");   
 };