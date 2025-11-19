package assignmet1;

public class Fctorial_Assigmt  
    {
  public static void fact(int number)
  {
	  int result = 1;   // start with 1 (since 1 is the neutral element for multiplication)

      for (int i = 1; i <= number; i++)
      {
          result = result * i; 
         
      }
      System.out.println("factorial of " +number +" is " +result);// multiply each number from 1 to n

   }
  
	public static void main(String[] args)  
	{
		fact(5);
	}

}
