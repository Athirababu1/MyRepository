package assignmet1;

public class Mthd_Ovrload_Sum
    {
	
	
    public void sum(int a, int b, int c)
    {
	int sum=a+b+c;
	System.out.println(sum);
    }
    public void sum(float a, int b, int c)
    {
	float sum=a+b+c;
	System.out.println(sum);

    }
	public static void main(String[] args) 
	{
		Mthd_Ovrload_Sum obj=new Mthd_Ovrload_Sum();
				obj.sum(4, 5, 6);
				obj.sum(5.5f, 8, 2);

	}

}
