package pkg_aggregation;

public class Child_Aggregation 
{
	String subject;
	int id;
	Parent_Aggregation ref;
   public Child_Aggregation(String subject,int id,Parent_Aggregation ref )
   {
	  this.subject=subject;
	  this.id=id;
	  this.ref=ref;
   }
   public void childmthd()
   {
	   System.out.println(subject +" " +id);
	   System.out.println(ref.name +" " +ref.age);
   }
   
	public static void main(String[] args)
	{
		Parent_Aggregation obj1=new Parent_Aggregation("Hi",12);
		Child_Aggregation obj=new Child_Aggregation("CSE",101,obj1);
		obj.childmthd();
	}

}
