package string;

/**
 * Pangram
 * @author mobin
 *
 */


class Test13 {

	public static void main(String[] args) {
		String str = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		int[] arr = new int[26];
		
		str = str.replace(" ", "").toUpperCase();
		System.out.println(str);
		
		for(int i=0; i<str.length(); i++) {
			int id = str.charAt(i)-65;
			arr[id]++;
		}
	
		boolean isPanGram  = true;
		
		for(int a: arr) {
			if(a==0) {
				isPanGram = false;
				break;
			}
		}
		
		if(isPanGram) {
			System.out.println("PAN GRAM");
		}else {
			System.out.println("Not Pan Gram");
		}
		
		

	}

}
