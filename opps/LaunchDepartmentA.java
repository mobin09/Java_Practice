package opps;

public class LaunchDepartmentA {

	public static void main(String[] args) {
		EmployeeA e1 = new EmployeeA("ABC", "Mobin", "Rahmant Nagar");
		EmployeeA e2 = new EmployeeA("XYZ", "Nitin", "Gajipur");
		EmployeeA e3 = new EmployeeA("KAN", "Angad", "Kanpur");
		EmployeeA[] emps = { e1, e2, e3 };

		DepartmentA d = new DepartmentA("CS1", "Computer Science", emps);
		d.getDeparmentDetails();

	}

}
