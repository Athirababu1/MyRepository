package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_list_cls {

	public static void main(String[] args)
	{
       ArrayList<String > obj= new ArrayList<String>();
       obj.add("athi");
       obj.add("monu");
       obj.add("sonu");
       System.out.println(obj);
       
       ArrayList<String > obj1= new ArrayList<String>();
		obj1.add("pin");
		obj1.add("drop");
		obj1.add("sil");
		System.out.println(obj1);
		//addall() - (boolean result will generate) to add elements from one list to another
		System.out.println(obj.addAll(obj1));
		System.out.println(obj);
		System.out.println(obj1);
		//containsall - to check whether a list is present on another list
		System.out.println(obj.containsAll(obj1));
		System.out.println(obj1.containsAll(obj));
		//size()
		System.out.println(obj.size());
		System.out.println(obj1.size());
		//iterator
		Iterator<String> it=obj.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove();
		System.out.println(obj);
	}

}
