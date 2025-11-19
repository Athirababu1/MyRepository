package super_keyword;

public class Divisibility_Child extends Divisibility_Parent 
   {
	public void show()
	{
		int result=super.add(5, 3);
		System.out.println(result);
		if(result%10==0)
		{
			System.out.println("it is divisible by 10");
		}
		else
		{
			System.out.println("not divisible by 10");

		}
	}

	public static void main(String[] args) 
	{
		Divisibility_Child obj=new Divisibility_Child();
		obj.show();
	}

}
