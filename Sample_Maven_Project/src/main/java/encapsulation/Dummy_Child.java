package encapsulation;

public class Dummy_Child {

	public static void main(String[] args) {
		Dummy_parent  obj=new Dummy_parent();
		obj.setName("hi");
		obj.setAge(20);
		System.out.println(obj.getAge());
		System.out.println(obj.getName());

	}

}
