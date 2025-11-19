package smple_pkg;

public class Amstg_Smple  
    {
	public void armstrng(int n)
	{
		int original=n;
		int sum=0;
		while(n!=0)
		{
			int digit=n%10;
		    sum=sum+(digit*digit*digit);
			n=n/10;
		}
		if(sum==original)
		{
			
			System.out.println("Armstrong");
		}
		else 
		{
			System.out.println("Not Armstrong");
		}
		
		}
	

	public static void main(String[] args) 
	{
		Amstg_Smple obj=new Amstg_Smple();
		obj.armstrng(151);
		

	}

}
