package objectandclass;

public class classCall {
	
	public void display() {
		int stu_id=12;
		String stu_name="Geetha";
		System.out.println("Student id="+stu_id);
		System.out.println("Student name="+stu_name);
	}
	
	
	public static void main(String[]args) {
		classCall c1=new classCall();
		c1.display();
		String stu_dept="CSE";
		System.out.println("Student dept="+stu_dept);
		System.out.println("Hii");}
}
