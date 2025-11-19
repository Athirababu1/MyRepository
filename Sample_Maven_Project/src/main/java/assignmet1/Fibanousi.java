package assignmet1;

import java.util.Scanner;

public class Fibanousi
   {
	static int number;
   
   public void fib()
   {
	   int first = 0, second = 1;
       System.out.print("Fibonacci Series: " + first + " " + second);
       for (int i = 2; i < number; i++) {
           int next = first + second;
           System.out.print(" " + next);
           first = second;
           second = next;
       
   }}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("how many term you want"  );
		 number=sc.nextInt();
		 Fibanousi obj=new Fibanousi();
				 obj.fib();

	}

}
