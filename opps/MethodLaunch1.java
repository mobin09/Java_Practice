package opps;


class Calculator1{
	int a,b,c;
	void add() {
		a = 10;
		b= 20;
		c = a+b;
		System.out.println(c);
				
	}
}

public class MethodLaunch1 {

	public static void main(String[] args) {
		Calculator1 calc = new Calculator1();
		calc.add();
		
		System.out.println(calc.a);
		System.out.println(calc.b);
		System.out.println(calc.c);
		
		int x = 3;
		switch(x) {
		 default: System.out.println("default");
		  case 0: System.out.println("0");
		      break;
		  case 1: System.out.println("1");
		  case 2: System.out.println("2");
		 
		}
		
		Integer m =0;
		Integer n = 0;
		
		for(Short s = 0; s<5; s++)
			if((++m)>2|| (++n)>2)
				m++;
		System.out.println(m +" " + n );
				 
		
		

	}

}
