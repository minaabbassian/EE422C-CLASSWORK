package classwork7_lists;
import java.util.*;

public class ListMain {

	public static void main(String[] args) {

		MyLinkedList l1 = new MyLinkedList();
		l1.add(3);
		// l1.add("hello");
		Queue<Integer> q = new LinkedList<Integer> ();
		LinkedList<String> l = new LinkedList<String>();
		l.add("hiaksdf");
		System.out.println(l.peek());
		
		
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Hi");
		al.add("h");
		al.add("Hi");
		System.out.println(al);
		
		Set<String> hs = new HashSet<String>();
		hs.add("Hi");
		hs.add("h");
		hs.add("Hi");
		System.out.println(hs);
		
		Set<String> ts = new TreeSet<String>();
		ts.add("gi");
		ts.add("gg");
		ts.add("gi");
		System.out.println(ts);
		
		Map<String, Double> m1 = new HashMap<String, Double>();
		m1.put("Raj",  1000.0);
		m1.put("Raj",  2000.0);
		m1.put("Curt",  1500.0);
		m1.put("Maria",  1000500.0);
		System.out.println(m1);


		Set<Employee> se = new TreeSet<>();
		se.add(new Employee(1000, ""));
		se.add(new Employee(200, ""));
		System.out.println(se);

		

	}

}
