package polymorphism;

import java.util.Scanner;

public class Offseason extends Onseason
{   
	 
	public void discount()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the offseason price ");
		int price=sc.nextInt();
		float discountprice=20*price/100f;
		System.out.println("Discount = " +discountprice);
		float totalprice=price-discountprice;
		System.out.println("Total price_Off Season  = " +totalprice);
		
		
	}

	public static void main(String[] args)
	{
		Onseason obj=new Offseason();
		obj.discount();
	    obj=new Onseason();
		obj.discount();
		

	}

}
