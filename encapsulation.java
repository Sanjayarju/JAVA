package objectandclass;

public class encapsulation {
	
	public static void main (String[]args) {
		
		jas s = new jas();
		s.setid(100);
		System.out.println("ID="+ s.getid());
	}

}

     class jas {
    	 
    	 private int Id;
    	 
    	 void setid(int id) {
    		 this.Id=id;
    	 }
    	 
    	 int getid() {
    		 return Id;
    	 }	
    	 
}