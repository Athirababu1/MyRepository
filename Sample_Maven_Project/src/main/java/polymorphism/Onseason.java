package polymorphism;

import java.util.Scanner;

public class Onseason
{
static int price;
static float discountprice;
public void discount()
{
	Scanner sc=new Scanner(System.in);
    System.out.println("Enter the actual price - onseason");
    price=sc.nextInt();
    discountprice=15*price/100f;
    System.out.println("Discount = "+discountprice);
    float totalprice=price-discountprice;
    System.out.println("Total price_OnSeason =  "+totalprice);
    
	
}
}
