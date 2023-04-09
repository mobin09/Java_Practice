package opps;

public class LaunchVarargs {

	public void add(int ...x) {
		System.out.println("Addition of Numbers");
	}
	
	public static void main(String[] args) {
		LaunchVarargs l = new LaunchVarargs();
		l.add();
		l.add(10, 30);
		l.add(30, 40,50);

	}

}
