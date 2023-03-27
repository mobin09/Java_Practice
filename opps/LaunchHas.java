package opps;
/**
 * How many ways to initialize the instance variables 
 * @author Mobin
 *
 */

class StudentB{
	private String  sname;
	private Integer sId;
	private String addr;
	public StudentB(String sname, Integer sId, String addr) {
		super();
		this.sname = sname;
		this.sId = sId;
		this.addr = addr;
	}
		
	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return "StudentB [sname=" + sname + ", sId=" + sId + ", addr=" + addr + "]";
	}
	
}


class CarB{
	// Car has a engine
	Engine eng = new Engine();
}

class Engine{
	
}

public class LaunchHas {

	public static void main(String[] args) {
		StudentB st1 = new StudentB("Mobin Arshad", 101, "Rahmat Nagar");
        System.out.println(st1);
	}

}
