package objectandclass;
import java.util.*;

public class exception {
	
	public static void main(String[] args) {
			try {
				Scanner s =new Scanner(System.in);
				System.out.println("Enter a number:");
				int num = s.nextInt();
				if(!(num>0&&num<=100))
				{
					throw(new Exception("Invalid number "+num));
					
				}
				else
				{
					System.out.println("Valid number");
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}

	}

