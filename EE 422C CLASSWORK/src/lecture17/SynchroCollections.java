package lecture17;

import java.util.*;

/* Program to compare use of sychronized collections vs. 
 * non-synchronized collections.
 */
public class SynchroCollections {
	public static void main (String [] args) {
		System.out.println("Start");
		//synced();
		unSynced();
	}

	static void synced () {
		// Create a synched linked list object, and add 100 numbers
		List<Integer> linkedList = 
				Collections.synchronizedList(new LinkedList<Integer>());
		for (int i = 0; i < 100; i++) {
			linkedList.add(i);
		}
		// launch a thread to add numbers 100 to 200 to the list
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("starting adding numbers");
				for (int i = 100; i < 200; i++) {
					linkedList.add(i);
					try { Thread.sleep(1);} 
					catch (InterruptedException e) {e.printStackTrace();}					
				}
				System.out.println("end");
			}
		}).start();

		// now run an iterator to go through the linked list that is 
		// synchronized with the linked list object.  
		synchronized(linkedList) {
			Iterator<Integer> iterator = linkedList.iterator();
			System.out.println("starting iteration");
			while (iterator.hasNext()) {
				try {Thread.sleep(4);} 
				catch (InterruptedException e) {e.printStackTrace();}
				System.out.println(iterator.next());
			}	
			System.out.println("finished iteration");
		}
	}

	static void unSynced () {
		// create a synched linked list object
		List<Integer> linkedList = Collections.synchronizedList(new LinkedList<Integer>());

		// fill it with numbers 1 to 100
		for (int i = 0; i < 100; i++) {
			linkedList.add(i);
		}

		// launch a thread to add 100 more numbers
		new Thread(new Runnable () {
			@Override
			public void run () {
				System.out.println("starting adding numbers");
				for (int i = 100; i < 200; i++) {
					linkedList.add(i);
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("ending adding numbers");
			}
		}).start();

		// try to iterate through the list in parallel with the numbers being added
		// interleaving occurs and the iterator throws a CME.
		Iterator<Integer> iterator = linkedList.iterator();
		System.out.println("starting iteration");
		while (iterator.hasNext()) { 
			try {
				Thread.sleep(4);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(iterator.next());
		}
		System.out.println("finished iteration");
	}
}
