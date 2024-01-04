package objectandclass;


  class class1 extends class3 {
	String stu_id;
	void display() {
		System.out.println("Student Name:" + stu_id);
	}
}
	
	class class3{
		
		String Stu_id = "Hii";
		void show() {
			System.out.println("Welcome");
		}
		
	}
	
	class class2{
		void show1(){
			System.out.println("hii");
		}
	}
	public class multipleInhertance{
	
	public static void main(String[] args) {
		class1 s = new class1();
		s.display();
		s.show();
	
		
		
	}

}
