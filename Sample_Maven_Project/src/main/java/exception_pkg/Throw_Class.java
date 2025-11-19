package exception_pkg;

public class Throw_Class {

	public static void main(String[] args) throws Exception
	{
       int age=15;
       if(age>18)
       {
    	   System.out.println("eligible for votting");
    	   
       }
       else 
       {
    	   throw new Exception("below 18");
       }
		
		
	}

}
