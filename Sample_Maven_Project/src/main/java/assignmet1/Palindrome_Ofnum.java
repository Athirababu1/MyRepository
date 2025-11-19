package assignmet1;

public class Palindrome_Ofnum 
    {
    public void palindrome(int num)
    {
    	 int originalNum = num;
         int reverse = 0;

         while (num != 0) {
             int digit = num % 10;          // get last digit
             reverse = reverse * 10 + digit; // build reverse
             num = num / 10;                 // remove last digit
         }

         if (originalNum == reverse) {
             System.out.println(originalNum + " is a Palindrome number.");
         } else {
             System.out.println(originalNum + " is NOT a Palindrome number.");
         }
    	
    	
    	
    }
	public static void main(String[] args) 
	{
		Palindrome_Ofnum obj=new Palindrome_Ofnum();
		obj.palindrome(121);

	}

}
