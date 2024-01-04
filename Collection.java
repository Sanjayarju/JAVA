package objectandclass;
import java.util.*;

public class Collection {
	public static void main(String[] args) {
		ArrayList<Student> stulist= new ArrayList<Student>();
		Student s =new Student(100, "ragul");
		Student s1 =new Student(101, "ragull");
		stulist.add(s1);
		stulist.add(s);
		for(Student s2:stulist) {
		System.out.println("Student id= "+ s2.s_id + "Studnet name= "+ s2.s_name);
	}
		}
}

class Student{
	int s_id;
	String s_name;
	public Student(int s_id,String s_name) {
		this.s_id=s_id;
		this.s_name=s_name;
	}
}
