class Student{	
     static{
		 System.out.println("class has been loaded");
	 }
	
}

public class AboutMe {
	public static void main(String[] args) throws ClassNotFoundException{
		System.out.println("Learning Code");
		Class.forName("Student"); // Load the class file explicitly
		
	}

}