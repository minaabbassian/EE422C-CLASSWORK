package lecture17;
import java.util.*;

/*
 * Adding and removing simultaneously to a data structure -- synchronization needed.
 */
public class LinkedListCheck {

	public static void main(String[] args) {
		List<Integer> l1 = new LinkedList<Integer>();
		
		new Thread(new Runnable() {
			@Override public void run () {
				add(l1);
			}		
		}).start();
		
		new Thread(new Runnable() {
			@Override public void run () {
				remove(l1);
			}		
		}).start();
		
		
	}
	
	public static void add (List<Integer> l) {
		for (int i = 0; i < 100; i++) {
			synchronized(l) 
			{
				l.add(i);
			}
		}
	}

	public static void remove (List<Integer> l) {
		for (int i = 0; i < 100; i++) {
			synchronized(l) 
			{
				if (l.size() != 0) {
					System.out.print(l.get(0) + " ");
					l.remove(0);
				}
			}
		}
	}
}
