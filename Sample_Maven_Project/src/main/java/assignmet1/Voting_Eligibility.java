package assignmet1;

public class Voting_Eligibility
    {

    public static void vote(int age)
    {
    	if(age>=18&& age<=59)
    	{
    		System.out.println("eligible for voiting");
    	}
    	else if(age>=70)
    	{
    		System.out.println("Senior citizen , eligible for voting");
    	}
    	else
    	{
    		System.out.println("Under age, Not eligible for voiting");
    	}
    }
	public static void main(String[] args)
	{
		vote(89);

	}

}
