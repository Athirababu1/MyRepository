package review_oops_practice;

public class Method_Overloading 
   {
 public void add(int a,int b)
 {
 int sum=a+b;
 System.out.println(sum);
 
 }
	public void add(int a , double b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	public void add(double a, int b)
	{
		double sum=a+b;
		System.out.println(sum);
	}
	public void add(int a, double b, double d)
	{
		double sum=a+b+d;
		System.out.println(sum);
	}
	
	public static void main(String[] args)
	{
		Method_Overloading  obj=new Method_Overloading ();
		obj.add(4, 5);
		obj.add(5,33.50);
		obj.add(5.66, 8);
		obj.add(2, 378.884, 5.993);
	}

}
