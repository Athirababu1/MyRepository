package collection;

import java.util.HashSet;
import java.util.Set;

public class Set_Operation {

	public static void main(String[] args) {
Set<String> s=new HashSet<String>();
s.add("athi");
s.add("athi");
s.add("sana");
s.add("hanan");
s.add(null);
s.add(null);
s.add("den");
System.out.println(s);
//addall
//size
//isempty
s.remove("athi");
System.out.println(s);
//addall
//containsall
//clear
s.clear();
System.out.println(s);
s.add("athi");
s.add("athi");
s.add("sana");
s.add("hanan");
s.add(null);
s.add(null);
s.add("den");
System.out.println(s);



	}

}
