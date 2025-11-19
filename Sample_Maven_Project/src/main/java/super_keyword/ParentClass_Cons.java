package super_keyword;

public class ParentClass_Cons {
	public ParentClass_Cons()
	{
		System.out.println("Non para Cons");
	}
   public ParentClass_Cons(int a)
   {
	   System.out.println(a);
   }
   public ParentClass_Cons(int a, int b)
   {
	   int sum=a+b;
	   System.out.println(sum);
   }
}
