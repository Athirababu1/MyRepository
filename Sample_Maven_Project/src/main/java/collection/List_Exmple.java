package collection;

import java.util.ArrayList;
import java.util.List;

public class List_Exmple {

	public static void main(String[] args) {
        List <String> l=new ArrayList<String>();
        
        System.out.println(l);
        //add() - to insert new element in the collection
        l.add("red");
        l.add("white");
        l.add("red");
        l.add("black");
        l.add("pink");
        System.out.println(l);
        
        //indexOf() - to return the index of the object
        System.out.println(l.indexOf("white"));
        System.out.println(l.indexOf("red"));
        //lastIndexOf() - Will show the last occurance
        System.out.println(l.lastIndexOf("red"));
        System.out.println(l.lastIndexOf("pp"));
        //contains - to check whether an elemet is present or not
        System.out.println(l.contains("black"));
        
        System.out.println(l.contains("bk"));
        //get()- inorder to get an element based on index position
        System.out.println(l.get(3));
        //remove() - to remove an element based on index position 
        System.out.println(l.remove(4));
        System.out.println(l);
        //isEmpty() - to check whether an elemet is empty or not
        System.out.println(l.isEmpty());
        System.out.println(l.remove(2));
        System.out.println(l);
        for(int i=0;i<3;i++)
        {
        	System.out.println(l.get(i));
        }
        for(String ar:l)
        {
        	System.out.println(ar);
        }
        
        
        

        
        
        
        

        
	}
	

}
