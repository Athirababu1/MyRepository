package assignmet1;

public class Two_NonPara_Constr
    {
    public Two_NonPara_Constr()
    {
    	System.out.println("Non para 1");
    }
    public Two_NonPara_Constr(String name)
    {
    	System.out.println("Non para 2" +name);
    }
	public static void main(String[] args)  
	{
		Two_NonPara_Constr obj1=new Two_NonPara_Constr("hi");
		Two_NonPara_Constr obj2=new Two_NonPara_Constr();
			
	}

}
