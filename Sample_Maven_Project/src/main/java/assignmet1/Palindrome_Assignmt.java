package assignmet1;

public class Palindrome_Assignmt 
    {
	 static int originalNum;
     static int reverse;
 public static void reverse(int number)
 {
	 originalNum = number;
    reverse = 0;

     while (number != 0) {
         int digit = number % 10;          // get last digit
         reverse = reverse * 10 + digit; // build reverse
         number = number / 10;   // remove last digit
     }
     System.out.println("Revserse " +" is " +reverse);  
     }
    
 public static void checkplaliornot()
 {
	 if (originalNum == reverse) {
         System.out.println(originalNum + " is a Palindrome number.");
     } else {
         System.out.println(originalNum + " is NOT a Palindrome number.");
     }
 }
	public static void main(String[] args) 
	{
	reverse(121);
	checkplaliornot();

	}

}
