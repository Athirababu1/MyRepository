package inheritance_pkg;

public class Hier_Child2 extends Hier_Parent
{
    public void display3()
    {
    	System.out.println("Child 3 - Hier");
    }
	public static void main(String[] args) {
		Hier_Child2 obj=new Hier_Child2();
				obj.display1();
				obj.display3();
		     

	}

}
