package lecture18;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class PriorityQueueTester {

	public static void main(String[] args) {
		Random rand = new Random(1);
		ArrayList<Integer> orig = new ArrayList<Integer>();
		ArrayList<Integer> out = new ArrayList<Integer>();

		// Add 10 random integers to a priority queue.  Then pull them out into an ArrayList called out.
		// The original list, after sorting with a standard algorithm, should be the same as 
		// the output ArrayList.
		
		int size = 10;
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		for (int i = 0; i < size; i++) {
			Integer val = rand.nextInt(size*2);
			
			// Add random int to orig (control list) and to q.
			orig.add(val);
			q.enqueue(val);
		}
		System.out.println("Orig list unsorted" + orig);
		System.out.println("enqueued list in q" + Arrays.toString(q.container));
		// empty out q by dequeueing, and store in out.
		while (!q.isEmpty()) {
			out.add(q.dequeue());  
		}
		System.out.println("Orig list unsorted" + orig);
		System.out.println("out list from heap" + out);
		Collections.sort(orig);
		System.out.println(out.equals(orig) ? "PASS": "FAIL");
		
		// Example of inputing a comparator object to a method.
		
		java.util.Arrays.sort(new Integer[10], new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				if (i1 == i2) return 0;
				if (i1 < i2) return -1;
				return 1;
			}
		});
		
		while (!q.isEmpty()) {
			q.dequeue();
		}
		q.enqueue(1);
		while (!q.isEmpty()) {
			System.out.println(q.dequeue());
		}
		q.enqueue(1);
		q.enqueue(2);
		while (!q.isEmpty()) {
			System.out.print(q.dequeue() + " ");
		}
		System.out.println();
		
		q.enqueue(1);
		q.enqueue(6);
		q.enqueue(4);
		while (!q.isEmpty()) {
			System.out.print(q.dequeue() + " ");
		}
		System.out.println();
	
		q.enqueue(1);
		q.enqueue(6);
		q.enqueue(4);
		q.enqueue(3);
		while (!q.isEmpty()) {
			System.out.print(q.dequeue() + " ");
		}
		System.out.println();
		PriorityQueue<String>  q11 = new PriorityQueue<String>();
	}
}

