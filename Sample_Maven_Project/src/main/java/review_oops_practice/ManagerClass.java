package review_oops_practice;

public class ManagerClass extends Inheritance_Memberclass
   {
	 String specialization;
		String dep;
	  public void mthd()
	  {
		  System.out.println("specialization = " +specialization);
		  System.out.println("department = " +dep);
	  }
	
	public static void main(String[] args) 
	{
		ManagerClass obj=new ManagerClass();
		obj.specialization="Engg";
		obj.dep="QA auto+manual";
		obj.mthd();
		obj.name="athi";
		obj.age=24;
		obj.phno=1234567890;
		obj.address="adh";
		obj.salary=25000.00;
		obj.printdetails();
	}

}
