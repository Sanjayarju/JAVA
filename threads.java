package objectandclass;

public class threads {
	
	public static void main(String[] args) {
		
		th1 s = new th1();
		Thread s1 = new Thread(s);
		s1.start();
		System.out.println("Thread.....");
		
	}

}

class th1 extends Thread{
	
	void Run(){
	
		
	
	}
	
	
	
}
