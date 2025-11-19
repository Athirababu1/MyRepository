package assignmet1;

import java.util.Scanner;

public class Assignmet2

    {
	static int number;
	int age;
	public static void possitiveornot()
	{
		if (number>0)
		{
		System.out.println("it is a possitive number");	
		}
		else if(number==0)
		{
			System.out.println("it is zero");
		}
		
		
		else
		{
			System.out.println("it is a negative number");	
	
		}
	}
	public void drivnglisence()
	{
		if(age>=18)
		{
			System.out.println("eligible for driving lisence");
		}
		else if(age>=16 && age<18)
		{
			System.out.println("eligible for learners lisence");
		}
		else
		{
			System.out.println("Not eligible for driving lisence");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("enter the number "); 
				number=sc.nextInt();
				possitiveornot();
				System.out.println("enter the age "); 
				int age=sc.nextInt();
				 Assignmet2 obj1=new  Assignmet2();
				 obj1.drivnglisence();
				
				

	}

}
