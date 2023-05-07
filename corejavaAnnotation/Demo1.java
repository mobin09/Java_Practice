package corejavaAnnotation;

@FunctionalInterface
interface AddNum {
	int add(int a, int b);
	
}

class Demo1 {

	public static void main(String[] args) {
		AddNum ad = (a, b) -> {
			return a + b;
		};

		int x = ad.add(5, 5);
        System.out.println(x);
	}

}
