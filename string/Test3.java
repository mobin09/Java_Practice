package string;


// check weather the data present in Heap or not
public class Test3 {

	public static void main(String[] args) {
		String s1 = new String("Mobin"); // Heap Data
		String s2 = s1.intern(); //search SCP data
		System.out.println(s1 == s2); // false 
		
		String s3 = "Mobin";
		System.out.println(s2 == s3);

	}

}
