package opps;

class Employee {
   
	private Long empId;
    private String eName;
    private String eAddar;
    Account account;
    
    public Employee(Long empId, String eName, String eAddar, Account account) {
		super();
		this.empId = empId;
		this.eName = eName;
		this.eAddar = eAddar;
		this.account = account;
	}
    
    public void printEmpDetails() {
    	System.out.println("Employee Details");
    	System.out.println("Emp Name::"+eName);
    	System.out.println("Emp Id::"+ empId);
    	System.out.println("Emp Address::" + eAddar);
    	System.out.println("Employee Account Details");
    	System.out.println("Emp Account no.::" + account.getAccountNo());
    	System.out.println("Emp Account name::"+ account.getAccountName());
    	System.out.println("Emp Account type::" + account.getAccountType());
    }
    
    public static void main(String...args) {
       Account acc = new Account(456789L, "Mobin Arshad", "Saving");
       Employee emp = new Employee(8072021L, "Mohd Mobin Arshad", "Rahmat Nagar", acc);
       emp.printEmpDetails();
       
    }
    
    
    
}
