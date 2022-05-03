package lib;
import java.util.*;

interface Database 
{
	public void getdata(int num);
	public void showpacks();
	public void AmountCal(int o);
}

public class mobile implements Database
{
	private long number;
	private int region;
	private double amount;
	private int operator;
	private int rechargesel;
	private double recharge;
	private int upi;
	boolean flag=false;
	Scanner sc= new Scanner(System.in);



	public void getdata(int num) // get the details from the user.
	{
		this.number=num;

		do{
		flag=true;
		System.out.println("Select Your Region");
		System.out.println("Press 1- for Maharashtra & Goa ");
		System.out.println("          2- Karnataka ");
		System.out.println("          3- Gujrat ");
		System.out.println("          4- Jammu ");
		region=sc.nextInt();
		if(region>=4 || region<=0)
			System.out.println("****  Please Select Correct Option  *****");
		else
			flag=false;
		}while(flag);
		
		
		System.out.println("Select Your Operator");
		System.out.println("Press 1- Airtel");
		System.out.println("          2- Jio");
		System.out.println("          3- Vodafone ");
		System.out.println("          4- Bsnl ");
		operator=sc.nextInt();
		showpacks();
		
		AmountCal(operator);
		System.out.printf("Your Final Amount with GST is %.2f \n",recharge);
		
		do{
		flag=true;	
		System.out.println("Enter your Credit Card Password");
		upi=sc.nextInt();
		
		if(upi!=1234)
			System.out.println("Wrong Information Please Try Again");
		else
			flag=false;
		}while(flag);
		
		System.out.println("Congratulations your Recharge on "+this.number+" is succesful");

	}

	public void showpacks()  // Show Recharge packs and get the selected pack
	{	
		System.out.println("Press  1 - 1.5 GB / Day Combo 4G Data Pack(84 days)   799 rs ");
		System.out.println("       2 - 1.5 GB / Day Combo 3G Data Pack(54 days)   459 rs ");
		System.out.println("	   3 -   2 GB / Day Combo 3G Data Pack(84 days)   945 rs ");
		System.out.println("       4 -   2 GB / Day Combo 3G Data Pack(54 days)   600 rs ");
		rechargesel=sc.nextInt();
		if(rechargesel==1)
		recharge=799;
		else if(rechargesel==2)
		recharge=459;
		else if(rechargesel==3)
		recharge=945;
		else
		recharge=600;
	}
	
	public void AmountCal(int o)   // add GST according to the operators
	{
	int s=o;	
		if(s==0)
		recharge=recharge*1.02;
		else if(s==1)
		recharge=recharge*1.01;
		else if(s==3)
		recharge=recharge*1.00;
		else
		recharge=recharge*1.05;
		
	}	


}