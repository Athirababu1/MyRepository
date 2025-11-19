package pkg_aggregation;

public class Address {
	String staddress;
	Student ref;
	public Address(String staddress,Student ref)
	{
		this.staddress=staddress;
		this.ref=ref;
	}
	public void mthd()
	{
		System.out.println("Student address = " +staddress);
		System.out.println("Student name = " +ref.stname +"\n" +"Student roll no = " +ref.rollno);
	}

	public static void main(String[] args)
	{
		
	Student objparent=new Student("Athira", 17);
	
    Address objchild=new Address("St villaa",objparent);
    objchild.mthd();
    
	}

}
