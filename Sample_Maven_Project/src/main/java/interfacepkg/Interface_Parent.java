package interfacepkg;

public interface Interface_Parent 
{
	public static final int a=4;
	int b=6;
	
	
public abstract void sum();
default void sub()
{
	//b=9; final field cannot assigned
	System.out.println("sub");
}
public static void mul()
{
	System.out.println("mul");
}
}
