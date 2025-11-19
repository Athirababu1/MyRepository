package instance_mthd;

public class Instnce_mthd_pgm {

	public void sum(int a, int b) //parameterised instance methond
	{
		int sum=a+b;
		System.out.println("Sum of " +a +" and " +b +" is " +sum);
	}
	
	public void prnt()
	{
		System.out.println("non parametrised instance mthod");
	}
	
	public float sum(int a, float b) ///return value and return statemt
	{
		float sum = a+b;
		return sum;
		
	}
	public void sum(int a, int b, int c) //mthd overloading
	{
		int sum= a+b+c;
		System.out.println("The sum is " +sum);
	}
	
	
	
	public static void main(String[] args)
	{
		Instnce_mthd_pgm obj=new Instnce_mthd_pgm();
		obj.sum(4,3 );
		obj.prnt();
		obj.sum(3, 4, 5);
		System.out.println("return stmnt is " +obj.sum(4, 3.5f));
		
		

	}

}
