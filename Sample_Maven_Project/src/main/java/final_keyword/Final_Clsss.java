package final_keyword;

public class Final_Clsss
    {
      public void finalmthd()
      {
    	  System.out.println("final mthd");
      }
	public static void main(String[] args)
	{
		final String name="Hello";
		//name="hi"; 
		Final_Clsss obj=new Final_Clsss();
		obj.finalmthd();
		

	}

}
