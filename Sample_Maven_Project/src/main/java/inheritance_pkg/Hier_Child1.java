package inheritance_pkg;

public class Hier_Child1 extends  Hier_Parent
    {
      public void display2()
      {
    	  System.out.println("Child 2 - Hier");
    	  
      }
	public static void main(String[] args) {
		Hier_Child1 obj=new Hier_Child1();
				obj.display1();
				obj.display2();

	}

}
