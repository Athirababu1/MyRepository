package assignmet1;

public class Factor_of_anumber 

    {
	
    
 public void factor(int num)   //parametrised mthd
 {  
	System.out.println( "factor of 6 are ");
	 for (int i = 1; i <= num; i++) 
	 
         if (num % i == 0) 
         {   // if divisible, then it's a factor
             
             System.out.print(i +" ");
         }
        
 }
	
	public static void main(String[] args) 
	{
		
		Factor_of_anumber obj=new Factor_of_anumber();
		obj.factor(6);
	}

}
