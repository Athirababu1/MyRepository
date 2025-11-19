package assignmet1;

public class Armstrong_of_a_number
    {
   public void armstrong(int number)
   {
	   int originalNum = number;
       int sum = 0;

       while (number != 0) {
           int digit = number % 10;           // get last digit
           sum = sum + (digit * digit * digit);  // cube and add
           number = number / 10;                 // remove last digit
       }

       if (sum == originalNum) {
           System.out.println(originalNum + " is an Armstrong number.");
       } else {
           System.out.println(originalNum + " is NOT an Armstrong number.");
       }
	   
   }
	public static void main(String[] args)  
	{
		Armstrong_of_a_number obj = new Armstrong_of_a_number();
		obj.armstrong(153);
		
		
    }

}
