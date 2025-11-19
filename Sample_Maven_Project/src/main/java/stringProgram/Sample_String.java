package stringProgram;

public class Sample_String {

	public static void main(String[] args) {
		StringBuffer a=new StringBuffer("Hello");
		StringBuilder b=new StringBuilder("World");
		System.out.println(a);
		
		System.out.println(a.insert(5, " Athira"));
		System.out.println(a.insert(12, " Welcome to obscura"));
		System.out.println(a.append(" , You are onboard ."));
		System.out.println(a.delete(31,50));
		System.out.println(a.replace(6, 11, "Madam"));
		System.out.println(a.deleteCharAt(11));
		System.out.println(a.reverse());
		
		String s= "Hello";
		String d="Hello";
		String f=new String("Hello");
		System.out.println(s.equals(d));
		System.out.println(s==d);
		System.out.println(s==f);

		
		
		
		
	}

}
