
public class ineuron {

	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<n;i++) {
			System.out.println("*");
		}
		for(int i=0;i<n;i++) 
		{
		
		     for(int j=0;j<n;j++) {
			  
			  if(i==j||j==0||j==n-1)
			  {
			
			    System.out.print("*");
			  }
			  else
			  {
				  System.out.print(" ");
			  }
		   }
		  System.out.println();
			
	}
		for(int i=0;i<n;i++) 
		{
		
		     for(int j=0;j<n;j++) {
			  
			  if(i==0||i==(n-1)/2||i==n-1||j==0)
			  {
			
			    System.out.print("*");
			  }
			  else
			  {
				  System.out.print(" ");
			  }
		   }
		  System.out.println();
			
	}
		for(int i=0;i<n;i++) 
		{
		
		     for(int j=0;j<n;j++) {
			  
			  if(i==n-1||j==0||j==n-1)
			  {
			
			    System.out.print("*");
			  }
			  else
			  {
				  System.out.print(" ");
			  }
		   }
		  System.out.println();
			
	}
		int k = 1;
        for (int r = 1; r <= 6; r++) {
            for (int c = 1; c <= 5; c++) {
                if (c == 1 || r == 1 || r == 3 || (c == 5 & r <= 3) || r + c == k)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
            System.out.println();
            k = k + 2;
        }
        for(int i=0;i<n;i++) 
		{
		
		     for(int j=0;j<n;j++) {
			  
			  if(i==0||i==n-1||j==0||j==n-1)
			  {
			
			    System.out.print("*");
			  }
			  else
			  {
				  System.out.print(" ");
			  }
		   }
		  System.out.println();
			
	}
        for(int i=0;i<n;i++) 
		{
		
		     for(int j=0;j<n;j++) {
			  
			  if(i==j||j==0||j==n-1)
			  {
			
			    System.out.print("*");
			  }
			  else
			  {
				  System.out.print(" ");
			  }
		   }
		  System.out.println();
			
	}



	}

}
