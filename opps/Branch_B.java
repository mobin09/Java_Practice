package opps;

class Course {
       private String cId;
       private String cName;
       private int cCost;
       private Student_A[] students;
       
	  public Course(String cId, String cName, int cCost) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cCost = cCost;
		//this.students = students;
	  }
	
	public String getcName() {
		return cName;
	}
	
    public String getcId() {
    	return cId;
    }       

    public int getcCost() {
    	return cCost;
    } 
    
    public Student_A[] getStudents() {
    	return students;
    }
    
       
}
