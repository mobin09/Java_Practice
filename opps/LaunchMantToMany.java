package opps;

public class LaunchMantToMany {

	public static void main(String[] args) {

		Course c1 = new Course("Java01", "Core java", 4000);
		Course c2 = new Course("Javascript01", "Java Script", 3000);
		Course c3 = new Course("JavaMaster", "Full Stack Java Development", 16000);

		Course[] c = { c1, c2, c3 };

		Student_A s1 = new Student_A("Mobin Arshad", "st01", "R.N", c);
		Student_A s2 = new Student_A("Jashim Arshad", "st02", "R.N", c);
		Student_A s3 = new Student_A("Washim Arshad", "st03", "Banglore", c);

		s1.getStudentDetails();

	}

}
