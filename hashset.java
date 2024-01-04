package objectandclass;

import java.util.*;

public class hashset {
	public static void main(String[]args) {
		
		LinkedList<String> l3=new LinkedList<String>();
		l3.add("ruby");
		l3.add("java21");
		l3.add("C#");
		HashSet<String> hs=new HashSet(l3);
		hs.add("SQL");
		hs.add("java");
		hs.add("python");
		System.out.print(l3);
		System.out.print(hs);

}
}
