package polymorphism;

public class Child_Overload extends Parent_Overload 
    {
	public void add(int a , int b)
	{ 
		super.add(a, b);
		int sum=a-b;
		System.out.println("sum = " +sum);
	}
	public int mul(int a , int b)
	{ 
		System.out.println(super.mul(a, b));
		int mul=a*b;
		return mul;
	}


	public static void main(String[] args)
	{
		Child_Overload obj=new Child_Overload();
		obj.add(5,3);
		System.out.println("Mul is " +obj.mul(5, 2));

	}

}
