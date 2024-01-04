package objectandclass;

public class interFace {
	
	public static void main(String[] args) {
    System.out.println("Iam going to write interface concepts");
	syed s = new syed();
	s.display();
}
}

interface inter1{
	String stu_id="Syed";
	 void display(); 
	 
}

class syed implements inter1{
	public void display() {
		System.out.println("Student Name=" + stu_id);
	}
	
}
