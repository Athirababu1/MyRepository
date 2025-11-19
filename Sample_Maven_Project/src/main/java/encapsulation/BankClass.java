package encapsulation;

import java.util.Scanner;

public class BankClass 
{
private int pin;
public void setPin(int pin)
{
	this.pin=pin;
}
public boolean getPin()
{
	if(pin==1001 || pin==1234 || pin== 1212)
	{
		System.out.println("pin validation is successfull");
		return true;
	}
	else
	{
		System.out.println("Invalid pin number");
	    return false;
	}
	
	
}
	public void withdraw()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to withdraw");
		int amount=sc.nextInt();
		System.out.println("Successfully debitted the amount " +amount);
	}
	
}
