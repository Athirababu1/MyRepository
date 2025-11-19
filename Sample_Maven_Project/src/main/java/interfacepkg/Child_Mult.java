package interfacepkg;

public class Child_Mult implements Multipleinheri_Parent1 ,Multiinhe_Parent2  {

	public static void main(String[] args) 
	{
		Child_Mult obj=new Child_Mult();
		obj.show();
		obj.display();
		obj.mthdadd();
	}

	@Override
	public void show()
	{
		System.out.println("show_body");
	}

	@Override
	public void display()
    {
		System.out.println("display_body");
	}

	@Override
	public void mthdadd() {
System.out.println("same mthd name");		
	}

}
