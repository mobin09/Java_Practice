package snippets;

 class Test10 {

	public static void main(String[] args) {
		boolean flag1 = true;
		boolean flag2 = false;
		boolean flag3 = true;
		boolean flag4 = false;
		
		System.out.println(!flag1 == flag2 != flag3 == !flag4);
		System.out.println(flag1 = flag2 != flag3 == !flag4);
		
		if(false)
			System.out.print(flag4);
		System.out.println("Hello wolrd");
	}

}
