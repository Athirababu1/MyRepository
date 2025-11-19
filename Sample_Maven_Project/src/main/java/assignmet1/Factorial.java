package assignmet1;

public class Factorial

    {
   public void factorial(int n)
    {
	   int fact = 1;   // start with 1 (since 1 is the neutral element for multiplication)

       for (int i = 1; i <= n; i++)
       {
           fact = fact * i; 
          
       }
       System.out.println("factorial of " +n +" is " +fact);// multiply each number from 1 to n
    }
	public static void main(String[] args)  
	{
		Factorial obj =new Factorial();
		obj.factorial(5);

	}

}
