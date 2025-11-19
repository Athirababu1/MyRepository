package super_keyword;

public class Child_Super extends Parent_Super
   {
String color="white";

public void display()
{
	System.out.println(super.color);
	System.out.println(color);
}
	public static void main(String[] args) {
		
		Child_Super obj=new Child_Super();
		System.out.println(obj.color);
		obj.display();
	}

}
