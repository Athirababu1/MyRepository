package assignmet1;

import java.util.Scanner;

public class Grade_Of_Student
    {
    static int mark;
    public static void grade()
    {
    	if(mark<40)
    	{
    		System.out.println("failed");
    	}
    	else if(mark>=40&&mark<=60)
    	{
    		System.out.println("Grade D");
    	}
    	else if(mark>=61&&mark<=70)
    	{
    		System.out.println("Grade C");
    	}
    	else if(mark>=71&&mark<=80)
    	{
    		System.out.println("Grade B");
    	}
    	else 
    	{
    		System.out.println("Grade A");
    	}
    	
    	
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your mark");
		mark=sc.nextInt();
		
		grade();

	}

}
