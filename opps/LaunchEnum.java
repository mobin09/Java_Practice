package opps;

enum Courses {
	JAVA, JEE, SPRING, SPRINGBOOT;
	
	int courseID; 
	Courses(){
		System.out.println("I am the Course Constructor");
	}
	
	void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	
	int getCourseID() {
		return courseID;
	}
	
	
}


public class LaunchEnum {

	public static void main(String[] args) {
		System.out.println(Courses.JAVA.courseID);
		Courses.JAVA.setCourseID(30);
		int cId = Courses.JAVA.getCourseID();
		System.out.println(cId);

	}

}
