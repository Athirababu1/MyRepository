package assignmet1;

public class Loop_Assignmt
    {
	public void sum1to10()
	{
		int sum=0;
		for(int i=1;i<=10;i++)
		{

	sum=sum+i;
		}
	System.out.println(sum);
	
			
	}
public void evensum1to10()
{
	int sum=0;
	for(int i=1;i<=10;i++)
	{
if(i%2==0)
{
	sum=sum+i;
	
}
	}
System.out.println(sum);		

	}
	public static void main(String[] args)
	{
		Loop_Assignmt obj=new Loop_Assignmt();
		obj.sum1to10();
		obj.evensum1to10();
		

	}

}
