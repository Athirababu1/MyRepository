package review_oops_practice;

public class Constrr_Creation
{
int id;
String name;
public  Constrr_Creation(int id , String name)
{
	this.id=id;
	this.name=name;
	
}

/*public void mthd()
{
	System.out.println("id = " +this.id +" and " +"name = " +this.name);
	
}*/

public static void main(String[] args)
{
	Constrr_Creation obj=new Constrr_Creation(102, "athi");
	//obj.mthd();
	System.out.println(obj.id +" " +obj.name);
}
}
