package assignmet1;

public class Factorial_This_Kyword
    {
   public void fact(int n)
    {
	   int fact = 1;   // start with 1 (since 1 is the neutral element for multiplication
       for (int i = 1; i <= n; i++)
       {
           fact = fact * i; 
       }
       System.out.println("factorial of " +n +" is " +fact);// multiply each number from 1 to n
    }
    
   public void result()
   {
	   this.fact(5);
	   System.out.println("This is the  result of finding factorial ");
   }
	public static void main(String[] args) 
	{
		Factorial_This_Kyword obj= new Factorial_This_Kyword();
		obj.result();
		

	}

}
