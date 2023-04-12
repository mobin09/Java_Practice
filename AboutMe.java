class Student{	

     static{
		 System.out.println("class has been loaded");
	 }
	public void m(){
		System.out.println("Hi, I am m() method");
	}
	
	public Student(){
		System.out.println("Zero parameterized Constructor");
	}
	
	
}

public class AboutMe {
	public static void main(String[] args) throws Exception{
		System.out.println("Learning Code");
		Class c = Class.forName("Student"); // Load the class file explicitly
		//Object obj = c.newInstance(); // constructor of loaded class will be called -- Class.newInstance() is deprecated
		Object obj = c.getDeclaredConstructor().newInstance();
		Student stu = (Student)obj;
		stu.m();
	}

}