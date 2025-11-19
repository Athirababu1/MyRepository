package employee_salary;

public class HraandPf extends Basic_Salary 
{
	protected double hra;
	protected double pf;
	public void hrapf()
	{
		hra=0.5*basicsalary;
		pf=0.20*basicsalary;
		System.out.println("Hra =" +hra +"\n" +"pr =" +pf);
		
	}
	
	

}
