package basics01;

public class Epattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==0 || j==0 || i== n/2 || i== n-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
			
		}

	}

}
