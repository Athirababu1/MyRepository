package assignmet1;

public class Default_Constructr  
     {
       public Default_Constructr()
       {
    	   System.out.println("default constructer");
       }
       public Default_Constructr(int n) //parametrised constrtctr
       {
    	   this();
    	   System.out.println(n);
       }
     
       
	public static void main(String[] args) 
	{
		Default_Constructr obj=new Default_Constructr(8);

	}

}
