package interfacepkg;

public class Interface_Childclass implements Interface_Parent {

	public static void main(String[] args) 
	{
		Interface_Childclass obj=new Interface_Childclass();
		obj.sum();
		obj.sub();
		Interface_Parent.mul();
		System.out.println(a);
		Interface_Parent obj1=new Interface_Childclass();
		obj1.sum();
		obj1.sub();
	}

	@Override
	public void sum()
	{
		System.out.println("sum");
	}

}
