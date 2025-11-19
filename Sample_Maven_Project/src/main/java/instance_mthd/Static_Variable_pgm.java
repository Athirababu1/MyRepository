package instance_mthd;

public class Static_Variable_pgm 
    {
    static int a=4,b;
    String s;
    public static void sum()
    {
    	
    	int sum=a+b;
    	System.out.println(sum);
    }
	public static void main(String[] args) 
	{
		
		System.out.println(Static_Variable_pgm.a);
            Static_Variable_pgm  obj=new Static_Variable_pgm ();
            obj.s="yyy";
            obj.b=5;
            sum();
          System.out.println(obj.s);
	}

}
