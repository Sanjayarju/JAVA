package objectandclass;

public class nullpointer {
	
	public static void main(String[] args) {
		
		try {
			String name=null;
			int len =name.length();
			System.out.println("Length ="+len);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		finally
		{
			System.out.println("Executed successfully...");
		}
	}

}
