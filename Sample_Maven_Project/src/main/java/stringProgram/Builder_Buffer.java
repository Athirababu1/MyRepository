package stringProgram;

public class Builder_Buffer {

	public static void main(String[] args) {
		StringBuffer sc=new StringBuffer("Paartha ");
		StringBuilder sc1=new StringBuilder("Sarathi ");
		System.out.println("String buffer is " +sc);
		System.out.println("String builder is  " +sc1);

        //insert() - insert a new string into the based on the index position
		System.out.println(sc.insert(7, "n"));
	

		System.out.println(sc);


		//append - add the new string at last
		System.out.println(sc.append(" PV"));

		//replace - replace one string to other string based on index 
		System.out.println(sc.replace(7, 8, "a"));
		System.out.println(sc.replace(8, 9, "n"));

		//delete - delete based on index
		System.out.println(sc.delete(8, 10));
		System.out.println(sc.delete(7, 9));
 
	
		
		//reverse - to reverse a string
		System.out.println(sc1.reverse());
		
		 
	}

}
