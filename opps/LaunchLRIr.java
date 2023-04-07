package opps;


abstract class AA{
 	abstract public void m1();
}

interface Left{
	int x = 888;
}

interface Right {
	int x = 999;
}

public class LaunchLRIr extends AA implements Left, Right {
    public void m1() {
    	System.out.println("Reference can be created for abstract class");
    }
	public static void main(String[] args) {
		
		System.out.println("Hello World");
		System.out.println(Left.x);
		System.out.println(Right.x);
        AA a = new LaunchLRIr();
        a.m1();
        
        Left c = null;
        
	}

}
