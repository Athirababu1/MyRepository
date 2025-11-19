package encapsulation;

public class Childclass_Encap {

	public static void main(String[] args) {
		Parentclass_encap obj=new Parentclass_encap();
		obj.SetAge(12);
		obj.setName("Hello");
		System.out.println(obj.getName());
		System.out.println(obj.getAge());

	}

}
