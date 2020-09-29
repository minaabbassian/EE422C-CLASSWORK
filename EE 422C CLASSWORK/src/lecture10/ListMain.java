package lecture10;

import java.util.*;

public class ListMain {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("ello");
		al.add("there");
		al.add(3 + "");
		System.out.println(al);
		
		List<String> ll = new LinkedList<String>();
		ll.add("ello");
		ll.add("there");
		ll.add(3 + "");
		System.out.println(ll);
		
		// ll = new ArrayList<String>();

		printList(ll);
		printList(al);
		
		System.out.println("++++++++++++");
		
		Iterator<String> it1 = al.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		Iterator<String> it2 = al.iterator();
		al.add("java");
		// it2.next(); // CME
		
		// CME again
		for (String s: al) {
			System.out.println(s);
			// al.remove(s);
		}
		
		Iterator<String> it3 = al.iterator();
		while (it3.hasNext()) {
			String s = it3.next();
			it3.remove();
		}
		
		List<java.awt.Point> pl = new ArrayList<java.awt.Point>();
		for (java.awt.Point p : pl) {
			p.getX();
		}
		
		/*
		// CLICKER
		Iterator<String> it4 = al.iterator();
		al.add("prog");
		Iterator<String> it5 = al.iterator();
		it4.next(); // line 1
		it5.next(); // line 2
		
		The above code leads to 
		A: CE line 1 only
		B: CE line 2 only
		C: RE line 1 only
		D: RE line 2 only
		E: None of the above
		*/
		
		printList(al);
		printList(ll);
	}
	
	public static void printList(List<String> list) {
		System.out.println(list);
	}

}
