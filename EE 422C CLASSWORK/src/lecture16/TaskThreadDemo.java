package lecture16;

public class TaskThreadDemo {

	public static void main(String[] args) {
		Runnable printA = new PrintChar(100, 'a');
		Runnable printB = new PrintChar(100, 'b');
		Runnable printNum = new PrintNum(200);
		
		Thread thread1 = new Thread(printA);
		Thread thread2 = new Thread(printB);
		Thread thread4 = new PrintStar(100);
		Thread thread3 = new Thread(printNum);
		Thread thread5 = new Thread(printA);
		thread1.start();
		thread5.start();
		//thread2.start();
		//thread3.start();
		//thread4.start();
		
/*		thread1.run();
		thread2.run();
		thread3.run();
		thread4.run();
*/
	}

}
