package assignmet1;

public class Discount_Pgm  
    {
	
	static int totalprice;
    public static void total_purchase(int price1, int price2)
    {
        totalprice=price1+price2;
    	System.out.println("Total purchased " +totalprice);
    		
    }
    public static void discount()
    {
    	int discount=5000;
    	if(totalprice>discount)
    	{
    		System.out.println("Eligible to apply discount ");
    	}
    	else
    	{
    		System.out.println("Not eligible to apply discount ");

    	}
    	
    	
    	int discountedprice=(totalprice*20)/100;
    	System.out.println("So reduction amount is  = " +discountedprice);
    	int total=totalprice-discountedprice;
    	System.out.println("Your total price after reduction is = " +total);
    	
    	
    	
    	
    }
   
	public static void main(String[] args) 
	{
		total_purchase(7000,2000);
		discount();
		
	}

}
