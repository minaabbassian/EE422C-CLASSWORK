package lecture17;

// What is wrong with the program below?  How would you fix it?

public class Deadlock {

	Object o1 = new Object();
	Object o2 = new Object();


	public static void main (String [] args) {
		new Deadlock();
	}

	public Deadlock () {
		Thread t1 = new Thread(new Task1());
		Thread t2 = new Thread(new Task2());
		t1.start();
		t2.start();
		System.out.println("No of threads running: " + Thread.activeCount());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("No of threads still running: " + Thread.activeCount());
	}

	class Task1 implements Runnable {
		@Override public void run() {
			synchronized(o1) {
				System.out.println("1");
				synchronized(o2) {
					System.out.println("2");
				}
			}
		}
	}
	class Task2 implements Runnable {
		@Override public void run() {
			synchronized(o2) {
				System.out.println("3");
				synchronized(o1) {
					System.out.println("4");
				}
			}
		}
	}
	/*
	 * Soln A: use some other lock arrangement
	 * Soln B: have some yield/sleep
	 * Soln C: else
	 */

}
