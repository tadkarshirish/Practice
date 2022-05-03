package bin;

import lib.*;
import java.util.*;

import javax.management.openmbean.OpenMBeanParameterInfo;

class Main {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num,op;
		String User="";
		String Pass="";
		char exit='Y';
		boolean flag=false;
		boolean flag1=false;
		
		System.out.println("                Welcome to Recharge portal                    ");
		System.out.println("**************************************************************");
			do{
				flag=false;
				System.out.println("Enter Your Login Username");
				User=sc.next().trim();
				System.out.println("Enter Your Login Password");
				Pass=sc.next().trim();
				System.out.println(User);
				System.out.println(Pass);
			
				if((User.equals("User")) && (Pass.equals("Pass")))
				{
					System.out.println(" Login Successful, Welcome Back ! ");
				}
				else{
					flag=true;
					System.out.println("Opps Wrong Credentials, Please Try Again");
				}
			}while(flag);
		
		do{
	
		System.out.println("Kindly Select Which Type of Recharge");
		System.out.println("Mobile Recharge    -  Press 1 ");
		System.out.println("DTH Recharge       -  Press 2 ");
		System.out.println("Exit               -  Press 3 ");
		int option=sc.nextInt();
		
		switch(option){
		case 1 : 
		mobile m1 = new mobile();
			System.out.println("Enter your mobile number");
			num=sc.nextInt();
			m1.getdata(num);
			break;
		case 2:
		DTH D1 = new DTH();
			System.out.println("Select your DTH operator");
			System.out.println("Press 1- Dishtv");
			System.out.println("      2- Tatasky ");
			System.out.println("      3- Videocon ");
			System.out.println("      4- Hathway ");
			 op=sc.nextInt();
			System.out.println("Enter viwer Id (Printed On Back of Your Setup Box) : ");
			num=sc.nextInt();
			D1.getdata(num);
			break;
		case 3:
				break;
		
		}
		
	System.out.println("Thank You For Using Our Service.");	
	System.out.println("Want To Use Other Services ?");
	System.out.println("Press \"Y\" for Yes or \"N\" for No.");
	exit=sc.next().charAt(0);
	if(exit=='Y')
		flag=true;
	else
		flag=false;
	
	}while(flag);			
						
	}
}
