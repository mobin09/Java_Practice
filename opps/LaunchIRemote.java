package opps;

interface Remote{
	int MIN_VALUME = 0;
	int MAX_VALUE = 100;
}

class LG implements Remote{
	void print() {
		System.out.println(MIN_VALUME);
		System.out.println(MAX_VALUE);
	}
}

public class LaunchIRemote {
	static int x ;
	final static int y = 10;
	public static void main(String[] args) {		
		LG lg = new LG();
		lg.print();
		
		System.out.println(x);
		
	}
}
