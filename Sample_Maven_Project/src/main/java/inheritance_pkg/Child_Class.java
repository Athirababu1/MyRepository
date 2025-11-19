package inheritance_pkg;

public class Child_Class extends Single_Parent
    {

	public void show()
	{
		System.out.println("Child class");
	}
	
	
	
	
	
	public static void main(String[] args)
	{
		
		Child_Class obj = new Child_Class();
		obj.show();
		obj.display();
		Single_Parent obj1=new Single_Parent();
		obj1.display();
		//obj1.show(); we cannot access child class property 
	}

}
