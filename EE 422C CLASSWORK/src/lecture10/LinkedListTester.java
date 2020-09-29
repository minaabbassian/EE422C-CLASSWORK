package lecture10;

public class LinkedListTester {

	public static void main(String[] args) {
		MyLinkedList l1 = new MyLinkedList();
		l1.add(3);
		l1.add(5);
		l1.add(9);
		System.out.println(l1);
		//System.out.println(l1.get(4));
		l1.removeAt(1);
		System.out.println(l1);
		l1.removeAt(1);
		System.out.println(l1);
		l1.add(6);
		l1.add(8);
		
		
		System.out.println("\n" + l1); // should be 3, 6, 8
		
		MyIterator i1 = l1.iterator();
		while (i1.hasNext()) {
			int j = i1.next();
			if (j == 6)
				i1.remove();
		}
		System.out.println("\n" + l1); // should be 3, 8

	}

}
