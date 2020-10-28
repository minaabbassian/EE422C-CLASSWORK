package lecture16;

public class TaskThreadDemo {

	public static void main(String[] args) {
		
		//First, I make a Runnable object
		//These are tasks
		//Each task is an instance of the Runnable interface
		Runnable printA = new PrintChar(100, 'a'); //print 100 a's
		Runnable printB = new PrintChar(100, 'b'); 
		Runnable print100 = new PrintNum(100); //prints numbers 0 to 99
		
		
		//A thread is essentially an object that facilitates the 
		//		execution of a task
		Thread thread1 = new Thread(printA); //parameter is Runnable object
		Thread thread2 = new Thread(printB);
		Thread thread3 = new Thread(print100);
		thread2.setPriority(Thread.MAX_PRIORITY);
		
		//CASE1
		/*
		thread1.run(); //first, all the a's got printed
		thread2.run(); //then, all the b's got printed
		thread3.run(); //then numbers from 0 to 99
		*/

		//CASE2 - MULTITHREADING
		//the tasks are mixed up; simultaneous
		//attention/context switching between the threads
		thread1.start();
		thread2.start();
		thread3.start();
		
		try {
			//means the current thread should sleep and let the other threads go
			Thread.sleep(10); //wait 1 milliseconds
		} catch (InterruptedException e) {
		}
		//prints the active number of threads after 10 milliseconds
		//expect 3
		System.out.println("\n" + Thread.activeCount() + "\n");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		//by then, all the threads should have finished
		//expect 0
		System.out.println("\n" + Thread.activeCount() + "\n");
/*
		Thread thread4 = new PrintStar(100);
		Thread thread3 = new Thread(printNum);
		Thread thread5 = new Thread(printA);
		thread1.start();
		thread5.start();
		//thread2.start();
		//thread3.start();
		//thread4.start();
		
		thread1.run();
		thread2.run();
		thread3.run();
		thread4.run();
*/
	}

}
