package assignmet1;

public class Square_Of_Numbr
    {
    public void sqr(int number)
    {
	int sqrt=number*number;
	System.out.println("Squrae root of " +number +" is " +sqrt);
    }
	public static void main(String[] args) 
	{
		Square_Of_Numbr obj=new Square_Of_Numbr();
		obj.sqr(6);

	}

}
