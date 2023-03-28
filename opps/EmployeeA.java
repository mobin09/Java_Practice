package opps;

class EmployeeA {
	private String empId;
	private String empName;
	private String empAddr;

	EmployeeA(String empId, String empName, String empAddr) {
		this.empAddr = empAddr;
		this.empId = empId;
		this.empName = empName;
	}

	public String getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpAddr() {
		return empAddr;
	}
}
