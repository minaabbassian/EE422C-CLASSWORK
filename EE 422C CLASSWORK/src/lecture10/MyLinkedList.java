package lecture10;

public class MyLinkedList implements MyListInterface, MyIterable {

	private Node head;
	private int size;

	static class Node {
		Node next;
		Node prev;
		Integer data;
		
		public Node () {
			this(0);
		}

		public Node (Integer i) {
			next = null;
			prev = null;
			data = i;
		}
	}
	
	public MyLinkedList () {
		head = new Node();
		size = 0;
	}
	
	@Override
	public void add(Integer a) {
		Node n = head;
		while (n.next != null) {
			n = n.next;
		}
		n.next = new Node (a);
		n.next.prev = n;
		size++;
	}

	@Override
	public boolean remove(Integer val) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public Integer get(int pos) {
		return null;
	}
	
	public boolean find(int value) {
		return find(value, head);
	}
	
	private boolean find(int value, Node n) {
		if (n == null) return false;
		if (n.data == value) return true;
		return find(value, n.next);
		
	}

	
	void removeAt(int index) { //only called from interator
		if(index >= size || index < 0)
			throw new IndexOutOfBoundsException();
		Node n = head.next;
		int pos = 0;
		while(pos != index) {
			n = n.next;
			pos++;
		}
		
		//n is item to be removed
		if(n.next == null) {
			n.prev.next = null;
			n = null;
		} else {
			n.prev.next = n.next;
			n.next.prev = n.prev;
		}
		size--;
		
	}
	
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public MyIterator iterator() {
		// TODO Auto-generated method stub
		return new MyIterator(this);
	}
	
}
