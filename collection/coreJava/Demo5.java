package collection.coreJava;

import java.util.TreeSet;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		if (i1 > i2) {
			return -1;
		} else if (i1 < i2) {
			return 1;
		} else {
			return 0;
		}
	}

}

class MyComparator1 implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		return -i1.compareTo(i2);
	}

}

class MyComparator2 implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {

		return +1; // insertion order preserved
	}

}

class MyComparator3 implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {

		return -1; // reverse of insertion order
	}

}

class MyComparator4 implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {

		return 0; // reverse of insertion order
	}

}

public class Demo5 {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("A");
		ts.add("Z");
		ts.add("L");
		ts.add("B");
		// System.out.println(ts);

		TreeSet ts1 = new TreeSet();
		ts1.add("A");
		ts1.add("B");
		// ts1.add(null); // RE: NullPointerException
		// ts1.add(10); RE: ClassCastException

		// System.out.println(ts1);

		TreeSet<StringBuffer> ts2 = new TreeSet<>();
		ts2.add(new StringBuffer("A"));
		ts2.add(new StringBuffer("Z"));
		ts2.add(new StringBuffer("L"));
		ts2.add(new StringBuffer("B"));
		System.out.println(ts2);

		System.out.println("A".compareTo("Z"));
		System.out.println("Z".compareTo("K"));
		System.out.println("Z".compareTo("Z"));
		// System.out.println("Z".compareTo(null)); // NullPointerException

		System.out.println("TreeSet in Ascending Order");
		TreeSet ts3 = new TreeSet(new MyComparator());
		ts3.add(10);
		ts3.add(0);
		ts3.add(5);
		ts3.add(20);
		ts3.add(8);
		System.out.println(ts3);

		ArrayList list = new ArrayList();
		list.add(10);
		list.add(0);
		list.add(60);
		list.add(-30);
		list.add(-5);
		System.out.println(list);
		Collections.sort(list, new MyComparator());
		System.out.println(list);
		System.out.println("*******");

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(80);
		al.add(10);
		al.add(50);
		al.add(0);
		al.add(10);
		al.add(-30);
		Collections.sort(al, new MyComparator1());
		System.out.println(al);
		System.out.println("TreeSet with insertion order preserved");
		TreeSet ts4 = new TreeSet(new MyComparator2());
		ts4.add(20);
		ts4.add(-30);
		ts4.add(10);
		ts4.add(5);
		ts4.add(0);
		System.out.println(ts4);

		System.out.println("TreeSet with Reverse of Insertion order");
		TreeSet ts5 = new TreeSet(new MyComparator3());
		ts5.add(20);
		ts5.add(-30);
		ts5.add(10);
		ts5.add(5);
		ts5.add(0);
		System.out.println(ts5);
		System.out.println("====");
		ArrayList list1 = new ArrayList();
		list1.add(10);
		list1.add(0);
		list1.add(60);
		list1.add(-30);
		list1.add(-5);
		list1.add(0);
		System.out.println(list1);
		Collections.sort(list1, new MyComparator4());
		System.out.println(list);

	}
}
