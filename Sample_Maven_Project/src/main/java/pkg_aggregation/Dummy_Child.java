package pkg_aggregation;

public class Dummy_Child {
	
	
	String college;
	int rollno;
	Dummy_Parent ref;
	public Dummy_Child(String college, int rollno,Dummy_Parent ref)
	{
		this.college=college;
		this.rollno=rollno;
		this.ref=ref;
		
	}
	public void mthd()
	{
		System.out.println(college +" " +rollno);

		System.out.println(ref.age +" " +ref.name);
	}

	public static void main(String[] args) 
	{
		Dummy_Parent obj1=new Dummy_Parent(10, " athi ");
		Dummy_Child obj=new Dummy_Child("college_name", 17,obj1);
		obj.mthd();
		
	}

}
