package assignmet1;

public class Addint_andall

    {
	int a=5,b=6;
	float c=4.4f;
    public void addtwointegers()
    {
    	
	int sum=a+b;
	System.out.println("addition of 2 integers are "+sum);	
    }
    public void fltandint()
    {
    float sum=c+a;
    System.out.println("sum of 1 float and 1 int is "+sum);
    }
    public void area(int base , int height)
    {
    	float area=0.5f*base*height;
    	System.out.println("area of triangle is "+area);
    }
    public void nameandage(String name,int age)
    {
    	System.out.println("name is "+name +"\t" +"age is "+age);
    }
    public void swapwithtemp()
    {
    	int temp,a=8,b=10;
    	temp=b; //
    	b=a;
    	a=temp;
    	System.out.println("After swap values are "+a +" "+b);
    }
    public void swapwithouttemp()
    {
    int s=10,d=5;
    s=s-d;
    d=s+d;
    System.out.println("after swap values without temp variables are " +s +" " +d);
    }
	public static void main(String[] args) 
	{
		Addint_andall obj=new Addint_andall();
		obj.nameandage("Athira", 2);
		obj.area(10, 4);
		obj.fltandint();
		obj.addtwointegers();
		obj.swapwithtemp();
		obj.swapwithouttemp();
	}

}
