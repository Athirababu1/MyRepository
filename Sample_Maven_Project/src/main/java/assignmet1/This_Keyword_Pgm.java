package assignmet1;

public class This_Keyword_Pgm 
     {
	int number;
	 public This_Keyword_Pgm ()
	  {
		  System.out.println("finfing reverse");
	  }
  public This_Keyword_Pgm (int number)
  {
	  this();
	  this.number=number;
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
		This_Keyword_Pgm  obj=new This_Keyword_Pgm (123);
	}

}
