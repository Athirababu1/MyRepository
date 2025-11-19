package employee_salary;

import java.util.Scanner;

public class Basic_Salary
{
	protected int basicsalary;
	protected int bonus;
	protected int deduction;


public void functionn()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your salary");
	basicsalary=sc.nextInt();
	System.out.println("enter your bonus amount");
    bonus=sc.nextInt();
	System.out.println("enter your deduction amount");
    deduction=sc.nextInt();
    

}
}