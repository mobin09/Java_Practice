package opps;


interface Left{
	int x = 888;
}

interface Right {
	int x = 999;
}

public class LaunchLRIr implements Left, Right {

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		System.out.println(Left.x);
		System.out.println(Right.x);

	}

}
