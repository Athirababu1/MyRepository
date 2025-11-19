package exception_pkg;

public class Excptin_Cls {

	public static void main(String[] args)
	{
		try 
		{
    int a=10,b=0,div;
   div=a/b;
   System.out.println(div);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception handled");
		}
	
		finally
		{
			System.out.println("Imp code of the pgm");
		}
		System.out.println("print");
		
		
		
		
		
		
		
		//int a[]= {1,3,4};
		//for(int i =0; i<=5;i++)
		/*{
			System.out.println(a[i]);
		}*/
		
		//String a=null;
		//System.out.println(a.length());
		
		
	}

}
