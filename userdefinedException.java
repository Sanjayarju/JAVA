package objectandclass;

public class userdefinedException {
	
	public static void main(String[] args) {
		try {
		Ex s = new Ex("Throws Exception");
		throw s;
		}
		catch(Ex ex) {
			System.out.println("Message=" +ex.getMessage());
		}
	}

}

class Ex extends Exception{
	public Ex(String str) {
		super(str);
	}
}
