package opps;

public class ManyToOne {

	public static void main(String[] args) {
		Branch cs = new Branch();
		cs.setBranchId("0175CSE033");
		cs.setBranchName("Computer Science");

		Branch bcom = new Branch();
		bcom.setBranchId("BCOM102");
		bcom.setBranchName("Commerce");

		Student_ s1 = new Student_();
		s1.setStudentId("101");
		s1.setStudnetName("Mobin");
		s1.setStudentAddr("Rahmat Nagar");
		s1.setBranch(cs);

		Student_ s2 = new Student_();
		s2.setStudentId("102");
		s2.setStudnetName("Mohit");
		s2.setStudentAddr("Delhi");
		s2.setBranch(cs);

		Student_ s3 = new Student_();
		s3.setStudentId("103");
		s3.setStudnetName("Nadeem");
		s3.setStudentAddr("Rahmat Nagar");
		s3.setBranch(bcom);

		Student_[] stus = { s1, s2, s3 };
		int count = 1;
		for (Student_ s : stus) {
			// Student info
			System.out.println("=========" + count + "==========");
			System.out.println("Student id::" + s.getStudentId());
			System.out.println("Student Name::" + s.getStudnetName());
			System.out.println("Student Address::" + s.getStudentAddr());
			System.out.println("Studnet Branch ID::" + s.getBranch().getBranchId());
			System.out.println("Student Branch Name::" + s.getBranch().getBranchName());
			System.out.println();
			count++;
		}

	}

}
