package abstraction;

public class Abstract_child extends abstrct_two_parent{
public Abstract_child()
{
	super("athi");
	System.out.println("child class const");
}
	
	
	
	
	public static void main(String[] args) 
	{
		
		abstrct_two_parent obj=new Abstract_child();
		obj.disp();
		obj.nomalmthd();
		//we cannnot access child class property by creating parent class obj or reference.
		
	}

	@Override
	public void disp() {
System.out.println("mthd child");		
	}

	
}
