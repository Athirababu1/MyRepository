package interfacepkg;

import java.util.Scanner;

public class HDFC_Cls_Intr implements  RBI_Interface 
{
	static int timeperiod_yearly=1;
String bankname="HDFC";
	@Override
	public void recurringDEposit() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.next();
		System.out.println("Enter your account number");
		int accountnumber=sc.nextInt();
		System.out.println("Your bank is " +bankname);
		System.out.println("Enter the amount to deposit");
		int amount=sc.nextInt();
		System.out.println("Your total amount is " +amount);
		System.out.println("Interset after 1 year is " +interest);
		int after1year=interest+amount;
		System.out.println("Amount after 1 year =" +after1year );
	}


	
}
