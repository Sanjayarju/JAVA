package objectandclass;

public class StringbufferandStringbuilder {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("JAVA");
		System.out.println("Capacity= "+sb.capacity());
		
		sb.append("Programming");
		System.out.println("String append= "+sb);
		
		sb.insert(2, "A");
		System.out.println("after insert= "+sb);
		sb.replace(2,5,"aaaaa");
		System.out.println("After Replace= "+sb);
		sb.delete(6, 10);
		System.out.println("After deleting= "+sb);
		sb.reverse();
		System.out.println("After Reverse= "+sb);
		
		
		sb.append("Programming");
		System.out.println("Capacity= "+sb.capacity());
	}

}
