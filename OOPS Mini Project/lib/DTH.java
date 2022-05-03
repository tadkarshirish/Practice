package lib;
import java.util.*;


public class DTH
{
	private long number;
	private int region;
	private double amount;
	private int operator;
	private int rechargesel;
	private double recharge;
	private int upi;
	Scanner sc= new Scanner(System.in);



	public void getdata(int num) // get the details from the user.
	{
		this.number=num;
		AmountCal(operator);
		System.out.println("Your Final Amount with GST is "+recharge);
		System.out.println("Enter your upi number");
		upi=sc.nextInt();

		System.out.println("Congratulations your Recharge on "+this.recharge+" is succesful");

	}

	public void showpacks()  // Show Recharge packs and get the selected pack
	{	
		System.out.println("Press  1 -  Sports & entertainment  799 rs ");
		System.out.println("       2 -	News & Regional         459 rs ");
		System.out.println("	   3 -  Songs & kids            945 rs ");
		System.out.println("       4 -  Food & lifestyle       600 rs ");
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