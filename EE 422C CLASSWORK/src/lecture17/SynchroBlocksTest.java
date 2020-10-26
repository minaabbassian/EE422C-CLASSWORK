package lecture17;

public class SynchroBlocksTest {
	
	public static void main (String [] args) {
		Synchro s1 = new Synchro(0, 100);
		
		new Thread(new Runnable () {
			@Override 
			public void run () {
				s1.method3();
			}
		}).start();
		
		new Thread(new Runnable () {
			@Override 
			public void run () {
				s1.method1();
			}
		}).start();
		
		new Thread(new Runnable () {
			@Override 
			public void run () {
				s1.method2();
			}
		}).start();
	}
}

class Synchro {

	int a;
	int b;
	public Synchro(int i, int j) {
		a = i; b = j;
	}
	
	// Increments a, and prints a+"x ".
	public void method1() {
		synchronized(this) { 
			for (int i = 0; i < 100; i++) {
				try {
					Thread.sleep(20);
				} catch(InterruptedException e) {}
				a++;
				System.out.print(a + "x ");
			}
		}
	}
	
	// increments b and prints it
	public void method2() {
		synchronized(this) { 
			for (int i = 0; i < 100; i++) {
				try {
					Thread.sleep(20);
				} catch(InterruptedException e) {}
				b++;
				System.out.print(b + " ");
			}
		}
	}

	// Increments a, and prints a+"y "
	public void method3() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(20);
			} catch(InterruptedException e) {}
			a++;
			System.out.print(a + "y ");
		}
	}
}
