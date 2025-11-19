package exception_pkg;

public class CustomExeption {

	public static void main(String[] args) throws MyException 
	{
  int age=15;
  if(age>18)
  {
	  System.out.println("eligible for voting");
  }
  else
  {
	  throw new MyException("not eligible");
	  
  }
	}

}
