package objectandclass;
import java.util.*;

public class hashmap {
	public static void main(String[] args) {
		HashMap <Integer,String> nm=new HashMap <Integer,String>();
		nm.put(1,"ruby");
		nm.put(2,"java21");
		nm.put(3,"C#");
		nm.put(4,"C");
		System.out.println(nm);
		nm.replace(3, "Selenium");
		for(Map.Entry m:nm.entrySet()) {
			System.out.println("Key="+ m.getKey()+ " Value="+ m.getValue());
		}
	}

}
