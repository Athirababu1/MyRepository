package super_keyword;

public class Chilsclass_Cons extends ParentClass_Cons
{
    public Chilsclass_Cons()
    {
    	super();
    	System.out.println("Non para cons - child");
    }
    public Chilsclass_Cons(int b)
    {
    	super(6,4);
    	System.out.println(b);
    }
    
	public static void main(String[] args) 
	{
		
		Chilsclass_Cons obj =new Chilsclass_Cons();
	    ParentClass_Cons obj1=new ParentClass_Cons(5);
	    Chilsclass_Cons obj3 = new Chilsclass_Cons(6);

	}

}
