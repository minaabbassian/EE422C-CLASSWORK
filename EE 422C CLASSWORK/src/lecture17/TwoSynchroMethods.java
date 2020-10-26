package lecture17;

public class TwoSynchroMethods {

	public static void main (String[] args) {
		Two two = new Two();
		
		new Thread(new Runnable () {
			@Override
			public void run() {
				two.methodA();
			}
		}).start();
		new Thread(new Runnable () {
			@Override
			public void run() {
				two.methodB();
			}
		}).start();		
		new Thread(new Runnable () {
			@Override
			public void run() {
				two.methodC();
			}
		}).start();		
	}
}

class Two {
	
	int i = 0;
	// Try removing synchronized from both methods
	// methodA prints a 10 times
	public  synchronized void methodA() {
		for (int i = 0; i < 10; i++) {
			System.out.print('a');
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	// methodB prints b 10 times
	public synchronized void methodB() {
		for (int i = 0; i < 10; i++) {
			System.out.print('b');
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	// methodC is not synchronized, so it can interleave with
	// methodA and methodB
	public void methodC() { 
		for (int i = 0; i < 10; i++) {
			System.out.print('c');
			//i++;
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}
