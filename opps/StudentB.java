package opps;

class Student_A {
	private String sName;
	private String sId;
	private String sAddr;
	private Course[] courses;

	public Student_A(String sName, String sId, String sAddr, Course[] courses) {
		super();
		this.sName = sName;
		this.sId = sId;
		this.sAddr = sAddr;
		this.courses = courses;
	}

	public String getsName() {
		return sName;
	}

	public String getsId() {
		return sId;
	}

	public String getsAddr() {
		return sAddr;
	}

	public Course[] getCourses() {
		return courses;
	}

	public void getStudentDetails() {
		System.out.println("Student and Enrolled Course Details");
		System.out.println("Studnet Name::" + sName);
		System.out.println("Studnet Name::" + sId);
		System.out.println("Studnet Name::" + sAddr);
		System.out.println(":::Course Details:::");
		for (Course c : courses) {
			System.out.println("Enrolled Course ID::" + c.getcId());
			System.out.println("Enrolled Course ID::" + c.getcName());
			System.out.println("Enrolled Course ID::" + c.getcCost());
		}
	}

}
