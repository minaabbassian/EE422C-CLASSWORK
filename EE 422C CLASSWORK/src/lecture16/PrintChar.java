package lecture16;

//prints a character c, n number of times 
public class PrintChar implements Runnable {
	private char c;
	private int n;
	
	//constructor 
	public PrintChar (int n, char c) {
		this.n = n;
		this.c = c;
	}
	
	public synchronized void printMeTwice(char c) {
		System.out.print(c);
		System.out.print((char)(c - ('a' - 'A')));
	}

	@Override
	//prints a character c, i number of times 
	public void run() {
		for (int i = 0; i < n; i++) {
			System.out.print(c);
			
			//after one guy goes, you yield
			//another way to do this is to sleep
			//Thread.yield();
		/*	
			//sleep means that you are going to go to sleep for a fixed time
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
			
			//printMeTwice(c);
		}
	}
	
}
