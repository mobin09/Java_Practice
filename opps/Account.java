package opps;

class Account {
    private Long accountNo;
    private String accountName;
    private String accountType;
	public Account(Long accountNo, String accountName, String accountType) {
		super();
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.accountType = accountType;
	}
	public Long getAccountNo() {
		return accountNo;
	}
	public String getAccountName() {
		return accountName;
	}
	public String getAccountType() {
		return accountType;
	}  
}
