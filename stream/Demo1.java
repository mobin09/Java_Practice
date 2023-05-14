package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Demo1 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(5);
		al.add(0);
		al.add(10);
		al.add(20);
		al.add(7);
		al.add(6);
		al.add(40);
		// System.out.println(al);
		ArrayList<Integer> evenList = new ArrayList<Integer>();
		for (int i : al) {
			if (i % 2 == 0)
				evenList.add(i);
		}
		// System.out.println(evenList);
		List<Integer> list = al.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		// list.forEach(System.out::println);

		List<Integer> l = al.stream().map(i -> i * 2).collect(Collectors.toList());
		// System.out.println(l);

		ArrayList<String> al2 = new ArrayList<>();
		al2.add("NDLS");
		al2.add("Mumbai");
		al2.add("Rahmat Nagar");
		al2.add("Gorakhpur");
		al2.add("Deoria");
		al2.add("Banglore");

		List<String> listName = al2.stream().filter(name -> name.length() >= 7).collect(Collectors.toList());
		//System.out.println(listName);
		long cnt = al2.stream().filter(name -> name.length() >= 7).count();
		//System.out.println(cnt);

		List<String> upperAdd = al2.stream().filter(name -> name.length() >= 7).map(city -> city.toUpperCase())
				.collect(Collectors.toList());
		//System.out.println(upperAdd);
		
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al3.add(10);
		al3.add(5);
		al3.add(20);
		al3.add(0);
		al3.add(7);
		al3.add(8);
		al3.add(6);
		al3.add(-50);
		//System.out.println(al3);
		
		// default natural sorting order
		List<Integer> lst =   al3.stream().sorted().collect(Collectors.toList());
		//System.out.println(lst);
		// customized sorting order
		
		List<Integer> lst2 =  al3.stream().sorted((obj1, obj2)-> - obj1.compareTo(obj2)).collect(Collectors.toList());
		//System.out.println(lst2);
		// for min and max element should be sorted in ascending order
		Integer minElement= al3.stream().min((i1, i2)-> i1.compareTo(i2)).get();
		//System.out.println(minElement);
		Integer maxElement= al3.stream().max((i1, i2)-> i1.compareTo(i2)).get();
		//System.out.println(maxElement);
		
		Integer[] arr = al3.stream().toArray(Integer[]::new);
		
		for(Integer o: arr) {
			//System.out.print(o + " ");
		}
		
		Stream s = Stream.of(9, 99, 999, 9999);
		s.forEach(System.out::println);
		
		Double[] d = {10.0, 10.1, 10.2, 10.3};
		Stream s1 = Stream.of(d);
		s1.forEach(System.out::println);
		
		
	}
}
