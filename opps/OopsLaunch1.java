package opps;

class Student1 {
	// what student has (Has-part)
	int rollNo;
	int age;
	String name;
	String enrolled;
	// what student can does (does-part)

	Student1(int rollNo, int age, String name, String enrolled){
		this.rollNo = rollNo;
		this.age  = age;
		this.name = name;
		this.enrolled = enrolled;
	}
	Student1(){}
	
	public void study() {
        System.out.println("Student is studying");
        
	}

	public void eat() {
		System.out.println("Student is in mess for eating");
	}

	public void sleep() {
		System.out.println("Student is Sleeping");
	}

}

public class OopsLaunch1 {

	public static void main(String[] args) {
		Student1 st1 = new Student1();
		st1.study();

	}

}
