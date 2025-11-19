package super_keyword;

public class Child_Super_Key extends Parent_Super_key{
 
	public void show()
	{
		System.out.println("Child-superkey");
		super.display();
		super.diplay2(6);
		this.showw();
	}
	  
	public void showw()
	{
		System.out.println("hlo");
	}
	
	public static void main(String[] args)
	{
		Child_Super_Key obj=new Child_Super_Key();
		obj.show();
		
	}

}
