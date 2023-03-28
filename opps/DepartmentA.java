package opps;

class DepartmentA {
	private String did;
	private String dName;
	private EmployeeA[] empls;

	DepartmentA(String did, String dName, EmployeeA[] empls) {
		this.did = did;
		this.dName = dName;
		this.empls = empls;
	}

	public String getDid() {
		return did;
	}

	public String getdName() {
		return dName;
	}

	public EmployeeA[] getEmployees() {
		return empls;
	}

	public void getDeparmentDetails() {
		System.out.println("Deparment Details");
		System.out.println("Deparment id::" + did);
		System.out.println("Deparment Name::" + dName);
		System.out.println("Employee Details of the Deparment");

		//EmployeeA[] em = getEmployees();
		int count = 1;
		for (EmployeeA e : empls) {
			System.out.println("=============="+ count +"==========");
			System.out.println("Employee Name::" + e.getEmpName());
			System.out.println("Employee id::" + e.getEmpId());
			System.out.println("Employee Address::" + e.getEmpAddr());
			System.out.println();
			count++;

		}

	}

}
