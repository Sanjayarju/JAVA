package objectandclass;

public class var1 {
	int stu_id;
	String stu_Name;
	
	public void getData(int id,String name) {
		stu_id = id;
		stu_Name = name;
	}
	
	public void disPlay() {
		System.out.println("Student id is "+stu_id);
		System.out.println("Student Name is "+stu_Name);
	}
	
	public static void main(String[] args) {
		var1 v1= new var1();
		v1.getData(3,"sanjay");
		v1.disPlay();
		v1.getData(5,"ragul");
		v1.disPlay();
		System.out.println("The program is completed Successfully");
	}

}
