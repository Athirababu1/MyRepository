package employee_salary;

public class Total_Salary extends HraandPf  
 {
	protected double totalsalary;
public void totalsalary()
{
	totalsalary=basicsalary+hra-pf-deduction+bonus;
	System.out.println("Total salary = " +totalsalary);
}
 }
