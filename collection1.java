
package objectandclass;
import java.util.*;

public class collection1 {
		public static void main(String[]args) {
			LinkedList<String> li=new LinkedList<String>();
			li.add("SQL");
			li.add("java");
			li.add("python");
			LinkedList<String> l2=new LinkedList<String>();
			li.add("ruby");
			li.add("java21");
			li.add("C#");
			li.addAll(l2);
			li.add(0,"c++");
			li.add(4,"c++");
			System.out.println(li);
			li.removeLastOccurrence("c++");
			System.out.println(li);
		}
}
