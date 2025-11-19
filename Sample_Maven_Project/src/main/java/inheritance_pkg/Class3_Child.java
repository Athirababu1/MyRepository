package inheritance_pkg;

public class Class3_Child extends Class2_Child {

	public void exam()
	{
		System.out.println("main class");
	}
	
	public static void main(String[] args) {
		
		Class3_Child obj=new Class3_Child();
		obj.exam();
		obj.display();
		obj.show();
		
	}

}
