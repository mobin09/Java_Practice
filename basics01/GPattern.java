package basics01;

public class GPattern {

	public static void main(String[] args) {
		// printing the G pattern
		
		int n = 10;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(
						(i == 0 && j < (3*n)/4 && j>0) ||
						(i >0 && j==0 && i<n-1) ||
						(i<= n/4 && j == 3*n/4  && i != 0) ||
						(i == n-1 && j<3*n/4 && j != 0) ||
						(i>= 3*n/4 && j == 3*n/4) ||
						(j < n-1 & j>= n/2 && i==n-3 )
					
						) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		

	}

}
