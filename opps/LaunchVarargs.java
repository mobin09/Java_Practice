package opps;

public class LaunchVarargs {

	public void add(int ...x) {
		for(int ele: x) {
			System.out.print(ele+" ");
		}
		System.out.println();
	}
	
	
	public void addInt(int ...x) {
		int sum = 0;
		for(int ele: x) {
			sum += ele;
		}		
		System.out.println("SUM of Integer is: "+sum);		
	}
	
	
	public void m1(int name, int ...x) {
		
	}
	
	public static void main(String[] args) {
		LaunchVarargs l = new LaunchVarargs();
		l.add(); // new int[]{}
		l.add(10, 30); // new int[]{10, 30}
		l.add(30, 40,50); //new int[]{30,40,50}
		
		l.addInt();
		l.addInt(10, 30, 40, -50);
		
		

	}

}
