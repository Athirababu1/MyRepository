package review_oops_practice;

public class Mthdocerride_Child extends Mthdoveriding_Parent

   {
	public void add()
	{
		
		int sub;
		sub=a-b;
		System.out.println("sub result =" +sub);
		super.add();
	}

	public static void main(String[] args)
	{
		Mthdocerride_Child obj=new Mthdocerride_Child();
		obj.a=10;
		obj.b=2;
		obj.add();
	}

}
