package encapsulation;


public class Bank_childclss {

	public static void main(String[] args) {
		BankClass obj=new BankClass();
		System.out.println("Enter your pin");
		obj.setPin(1001);
	   if (obj.getPin())
	   {
		   obj.withdraw();
	   }
	   else 
	   {
		   System.out.println("Failed transaction , due to incorrect pin");
	   }
	   
	}

}
