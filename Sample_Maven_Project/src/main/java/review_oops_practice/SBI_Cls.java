package review_oops_practice;

import java.util.Scanner;

public class SBI_Cls implements Bank_Interface
{
static String bankname="sbi";
int balance=10000;
int totalamount;


  



	@Override
	public void accountdetails() {
		
		Scanner sc=new Scanner(System.in);
System.out.println("Enter your name");
String name=sc.next();
System.out.println("Enter your account name");
int accountnumber=sc.nextInt();

	}

	@Override
	public void balance() {
		System.out.println("Your balance is " +balance);


	}

	@Override
	public void withdrwal() {
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the amount to withdraw");
int withdraw=sc.nextInt();
System.out.println("Entered amount " +withdraw +"is withdrawn");

int total=totalamount-withdraw;
System.out.println("Your total banace = " +total);

	}

	@Override
	public void deposit() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to deposit");
		int deposit=sc.nextInt();
		 totalamount=deposit+balance;
		System.out.println("Amount after deposit of " +deposit +" is" +totalamount);
		
	}

}
