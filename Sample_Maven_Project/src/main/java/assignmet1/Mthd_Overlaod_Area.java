package assignmet1;

public class Mthd_Overlaod_Area 
    {
public float area(int base, int height)  //triabgle
{
	float area= 0.5f*base*height;
	return area;
}
public void area(float radius)  //circle
{
	float area=3.14f*radius*radius;
	System.out.println("area of circle is " +area);
}
public int area(int side) //square
{
	int area=4*side;
	return area;
	
}

	public static void main(String[] args) 
	{
		Mthd_Overlaod_Area  obj=new Mthd_Overlaod_Area ();
		System.out.println("Area of triangle is " +obj.area(4, 2));
		obj.area(3.3f);
		System.out.println("Area of square is " +obj.area(4));
	}

}
