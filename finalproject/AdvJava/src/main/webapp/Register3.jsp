<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- <link rel="stylesheet" href="C:\Users\S\Desktop\Project HTM\style.css"> -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="./CSS/reg.css">
     <link href="https://fonts.googleapis.com/css2?family=Alata&family=Slabo+27px&display=swap" rel="stylesheet">
     <link href="https://fonts.googleapis.com/css2?family=Share&display=swap" rel="stylesheet">
     <title>Document</title>
     <script>
     function clearErrors(){

    	    errors = document.getElementsByClassName('formerror');
    	    for(let item of errors)
    	    {
    	        item.innerHTML = "";
    	    }


    	}
    	function seterror(id, error){
    	    //sets error inside tag of id 
    	    element = document.getElementById(id);
    	    element.getElementsByClassName('formerror')[0].innerHTML = error;

    	}

    	function validateForm(){
    	    var returnval = true;
    	    clearErrors();

    	    var name = document.forms['myForm']["fname"].value;
    	    if (name.length<5){
    	        seterror("name", "*Length of name is too short");
    	        returnval = false;
    	    }

    	    if (name.length == 0){
    	        seterror("name", "*Length of name cannot be zero!");
    	        returnval = false;
    	    }

    	    var email = document.forms['myForm']["femail"].value;
    	    if (email.length>15){
    	        seterror("email", "*Email length is too long");
    	        returnval = false;
    	    }

    	    var phone = document.forms['myForm']["fphone"].value;
    	    if (phone.length != 10){
    	        seterror("phone", "*Phone number should be of 10 digits!");
    	        returnval = false;
    	    }
    	    
    	    var aadhar = document.forms['myForm']["faadhar"].value;
    	    if (aadhar.length != 12){
    	        seterror("aadhar", "*aadhar number should be of 12 digits!");
    	        returnval = false;
    	    }


    	    var password = document.forms['myForm']["fpass"].value;
    	    if (password.length < 6){

    	        // Quiz: create a logic to allow only those passwords which contain atleast one letter, one number and one special character and one uppercase letter
    	        seterror("pass", "*Password should be atleast 6 characters long!");
    	        returnval = false;
    	    }

    	    var cpassword = document.forms['myForm']["fcpass"].value;
    	    if (cpassword != password){
    	        seterror("cpass", "*Password and Confirm password should match!");
    	        returnval = false;
    	    }

    	    return returnval;
    	}


	
	</script>
     <style>
	body {
            
            margin: 0px;
    padding: 0px;
    background: url('../images/Payment.png');
    background-size: cover;
    /* background-repeat: no-repeat; */
    font-family: 'Baloo Bhai 2',cursive;
    overflow-x:hidden;
}

        .formdesign {
            font-size: 20px;

        }

        .formdesign input {
            width: 60%;
            padding: 12px 20px;
            border: 1px solid blue;
            margin: 14px;
            border-radius: 4px;
            font-size: 15px;
        }

        .formerror {
            color: red;
        }

        .but {
            border-radius: 9px;
            width: 100px;
            height: 50px;
            font-size: 25px;
            margin: 22px 20px;
        }
        .mainDiv{
        	position: relative;
		    top: 29px;
		    left: 145px;
		    border: 3px solid white;
		    border-radius:8px;
		    width: 700px;
		    padding:20px 20px;
        }
        h1{
        	position:relative;
        	left : 400px;
        	top : 40px;
        }
        .ntb{
		position:relative;
		left: 290px;
		top: 10px;
		padding : 10px 21px;
		border-radius:9px;
		background-color:skyblue;
		cursor:pointer;
		background: linear-gradient(to right, skyblue 50%, white 50%);
	    background-size: 200% 100%;
	    background-position: right bottom;
	    transition: all .5s ease-out;
	}
	.ntb:hover{
		background-color:#749baf;
		background-position: left bottom;
	}
	.text:hover {
 		color: white;  
	}
	
	.mainDiv h1{
		position:relative;
		left:30px;
		top:-20px;
	}
	
	.mainDiv .formdesign input{
		width:600px;
		position:relative;
		left:20px;	
	
	}


	</style>
    
</head>
<body>
  <header class="header">
       
    

</header>
<div class="container">
    
    

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>JavaScript Form Validation</title>
    <link rel="stylesheet" href="style.css">

</head>

<body>
    <h1>Welcome to the best form on Internet!</h1>
    <form action ="slogin.cdac" name="myForm" onsubmit="return validateForm()" method="post">
        <div class="mainDiv">
	        <div class="formdesign" id="name">
	            Name: <input type="text" name="fname" required><b><span class="formerror"> </span></b>
	        </div>
	
	        <div class="formdesign" id="email">
	            Email: <input type="email" name="femail" required><b><span class="formerror"> </span></b>
	        </div>
	
	        <div class="formdesign" id="phone">
	            Phone: <input type="phone" name="fphone" required><b><span class="formerror"></span></b>
	        </div>
			<div class="formdesign" id="aadhar">
		        aadhar: <input type="number" name="faadhar" required><b><span class="formerror"></span></b>
		    </div> 
		    <div class="formdesign" id="username">
		        username: <input type="text" name="fuser" required><b><span class="formerror"></span></b>
		    </div>
	        <div class="formdesign" id="pass">
	            Password: <input type="password" name="fpass" required><b><span class="formerror"></span></b>
	        </div>
	
	        <div class="formdesign" id="cpass">
	            Confirm Password: <input type="password" name="fcpass" required><b><span class="formerror"></span></b>
	        </div>
	
	        <input class="but" type="submit" value="Submit">
		</div>
    </form>
</body>


</html>

    
    <!-- <form>
        <div class="form-group">
            <input type="text" name="" placeholder="Enter Your Name" id="name1" required>
        </div>
        <div class="form-group">
            <input type="text" name="" placeholder="Enter Your Age" id="age" required>
        </div>
        <div class="form-group">
            <input type="text" name="" placeholder="Enter Your Gender" id="gender" required>
        </div>
        <div class="form-group">
            <input type="text" name="" placeholder="Enter Your Locality" id="loc" required>
        </div>
        <div class="form-group">
            <input type="text" name="" placeholder="Enter Username" id="Username" required>
        </div>
        <div class="form-group">
            <input type="password" name="" placeholder="Enter Your Password" id="password" required>
        </div>
        <input type="submit" class="btn" onclick="signup()">
    </form> -->
</div>

</body>


</html>

