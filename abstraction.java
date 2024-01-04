package objectandclass;

public class abstraction {
	
	public static void main(String[] args) {
	    System.out.println("Iam going to write abstraction concepts");
		ab2 s = new ab2();
		s.display2();
		s.show();
	}
	}

	abstract class ab1{
		String name = "syed";
		abstract void show();
		void display2() {
			System.out.println("Hii everyone="+name);
		}
	}
	
	class ab2 extends ab1{
		void show() {
			System.out.println("Name="+name);
		}
	} 
	
	
