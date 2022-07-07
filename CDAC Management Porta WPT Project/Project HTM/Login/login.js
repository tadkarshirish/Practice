window.addEventListener('DOMContentLoaded', () => {
    let submitted = document.querySelector("#login");
    submitted.addEventListener('click', () => {
        let email = document.querySelector("#username").value;
        let password = document.querySelector("#password").value;

        if(email=="admin"&& password=="admin")
         {
            window.open('Student.html');
         }
         else{
             alert('Wrong Credentials')
         }
    });
});


// function validate()
// {
// var username=document.getElementById("username").value;
// var password=document.getElementById("password").value;
// if(username=="admin"&& password=="admin")
// {  
//     alert("login done")
  
//     windows.open('index.html');
   
// }
// else
// {
//     alert("login failed")
// }


// }


// function validate(){
//     U=document.getElementById("username").value;
//     P=document.getElementByid("password").value;
    
//     if(U=="staff" && P=="staff")
//     {
//         alert("Welcome")
//         window.location.href=".";
//         window.location.href="../Student/Student.html";
//     }
//     else if (U=="student" && P=="student")
//     {
//         alert("student")
//     }
//     else
//     {
//     alert(" Wrong Credential")
//     return false;
     
//     }
    