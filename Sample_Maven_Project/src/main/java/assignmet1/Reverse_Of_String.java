package assignmet1;

public class Reverse_Of_String 
    {
  public void rev(String name)
  {
      String rev = "";  // to store reversed string

      // Loop from last character to first
      for (int i = name.length() - 1; i >= 0; i--)
      {
          rev = rev + name.charAt(i);  // take each character and add to rev
      }

      System.out.println("Reversed string: " + rev);
  }
  
	public static void main(String[] args)  
	{
		Reverse_Of_String obj = new Reverse_Of_String();
		obj.rev("Athira");
    
	}

}
