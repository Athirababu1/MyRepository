package abstraction;

public class Child_Abstract extends Parent_Abstract
{

	public static void main(String[] args) 
	{
		Child_Abstract obj=new Child_Abstract();
		obj.display();
		System.out.println(obj.show());
		obj.dis();
	}

	@Override
	public void display()
	{
System.out.println("hi");		
	}

	@Override
	public int show() {
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	

}
