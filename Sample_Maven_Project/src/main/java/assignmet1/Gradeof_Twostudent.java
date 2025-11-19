package assignmet1;

public class Gradeof_Twostudent
    {
	public Gradeof_Twostudent(int mark1, int mark2,int mark3)
	{
	int total=mark1+mark2+mark3;
	System.out.println("Total mark : " +total);
	if(total < 155)
	{
		System.out.println("failed");
	}
	else
	{
		System.out.println("pass");
	}
	}
	public Gradeof_Twostudent(float mark1, int mark2, int mark3)
	{
		float total= mark1+mark2+mark3;
		System.out.println("Total mark : " +total);
		if(total < 155)
		{
			System.out.println("failed");
		}
		else
		{
			System.out.println("pass");
		}
		
	}
	

	public static void main(String[] args)  
	{
		Gradeof_Twostudent obj=new Gradeof_Twostudent(34,80,40);
		
		
		Gradeof_Twostudent obj1=new Gradeof_Twostudent(45,80,40);
		
		
	}

	

}
