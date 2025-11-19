package assignmet1;

import java.util.Scanner;

public class Reverseofanumber 
    {
	static int number;
	public void rev()
	{
		 int reverse=0;
     while(number!=0)
     {
    	 int digit=number%10;   //last digit
    	 reverse = reverse * 10 + digit;  // add digit to reverse
    	 number=number/10;       // remove last digit
    	 
     }
	System.out.println("Reversed number: " +reverse);
	
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		 number = sc.nextInt();
		Reverseofanumber obj=new Reverseofanumber ();
		obj.rev();

	}
	}


