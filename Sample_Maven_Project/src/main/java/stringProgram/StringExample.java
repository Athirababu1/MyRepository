package stringProgram;

public class StringExample {

	public static void main(String[] args) {
		String name="Athira";
		System.out.println(name);
		String name2=new String(" hi");
		System.out.println(name2);
		//length- return length of the string
		System.out.println(name.length());
		//concate-add two strings
		System.out.println(name.concat(name2));
		System.out.println(name);
		//charAt-to return the character of the string
		System.out.println(name.charAt(4));
		//contains- to check whether a char or word present in the string 
		
		String a="Hello, welcome to obsqura";
		System.out.println(a.contains("welcome"));
		System.out.println(a.contains("welome"));
		String b="java";
		String c="java";
		String d="Java";
		String e="Selenium";
		String f = "";
	    
		//equals-to compare 2 strings
		System.out.println(b.equals(c));
		System.out.println(b.equals(d));
		System.out.println(b.equals(e));
		//equalsignorecase - to compare 2 strings(case sensitive)
		System.out.println(b.equalsIgnoreCase(d));
       //touppercase - to convert the lowecase letter into uppercase
		System.out.println(b.toUpperCase());
      //tolowecase- to lowercase 
		System.out.println(b.toLowerCase());
		//isempty - to check whether a string is empty or not
		System.out.println(b.isEmpty());
		System.out.println(f.isEmpty());
		//valueof - to convert any datatype to string value
		int ab = 10;
		System.out.println(String.valueOf(ab));

	   String aa ="Athira";  //literal strng
	   String bb="Athira";    //literal strng
	   String fname=new String("Athira");   //new keyword
	   System.out.println(aa==bb);

	   System.out.println(aa==fname);
	   System.out.println(aa.equals(fname));
 //equal operator is used to compare object references , means it checks the if 2 variables point to the same memory location, on the other hand equals method is usd to compare the value of objects.
	   
      //Excersise
	   String name1="Aathii";  //string literal
	   String name3="Aathii";   //string literal
	   String s=new String("Aathii");  //new keyword
	   System.out.println(name1.equals(name3));
	   System.out.println(name1==name3);
	   System.out.println(name1==s); //when comparing with literals by using == the result was true.but in case of new kewrord and literal by using == gives false result.Because equal operator compares references / variable name .
	   System.out.println(name1.equals(s)); //equal method compares values
	   






	    
	   


		
		
		
		
		
		
		
	}

}
