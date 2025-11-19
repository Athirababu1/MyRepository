package pkg_accessspecifier;

public class Maincls_Accessspcfr {
	public void pubmthd()
	{
		System.out.println("public mthd");
	}
	private void privtemthd()
	{
		System.out.println("private mthd");
	}
    protected void protctedmthd()
    {
    	System.out.println("protected mthd");
    }
    void defaultmthd()
    {
    	System.out.println("default mthd");
    }
    
    
	public static void main(String[] args)
	{
		Maincls_Accessspcfr obj =new Maincls_Accessspcfr();
		obj.pubmthd();
		obj.privtemthd();
		obj.defaultmthd();
	}

}
