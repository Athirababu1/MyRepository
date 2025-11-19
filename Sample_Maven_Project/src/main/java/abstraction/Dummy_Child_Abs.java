package abstraction;

public class Dummy_Child_Abs extends Dummy_Parent_Abs {

	public static void main(String[] args) 
	{
		Dummy_Child_Abs obj= new Dummy_Child_Abs();
		obj.sum();
		System.out.println(obj.sum(5, 3));
		obj.sub();
	}

	
	
	
	
	
	
	
	
	
	
	@Override
	public void sum() {
System.out.println("sum");		
	}


	@Override
	public int sum(int a, int b)
	{
		int sum=a+b;
		return sum;

}}
