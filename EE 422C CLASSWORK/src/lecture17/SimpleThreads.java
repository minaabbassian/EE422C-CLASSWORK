package lecture17;

/*
 * This program illustrates thread interruption during sleep.
 */
public class SimpleThreads {

    // Display a message, preceded by
    // the name of the current thread
    static void threadMessage(String message) {
        String threadName =
            Thread.currentThread().getName();
        System.out.format("%s: %s%n",
                          threadName,
                          message);
    }

    private static class MessageLoop implements Runnable {
    	/*
    	 * This task prints out a line from the array below every 4 s.
    	 * 
    	 */
        public void run() {
            String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
            };
            try { // print out the 4 lines, one every 4 seconds.
                for (int i = 0; i < importantInfo.length; i++) {
                    // Pause for 4 seconds
                    Thread.sleep(4000);
                    // Print a message
                    threadMessage(importantInfo[i]);
                }
            } catch (InterruptedException e) {
                threadMessage("I wasn't done!");
            }
        }
    } // end of Runnable MessageLoop

    public static void main(String args[]) throws InterruptedException {

        // Delay, in milliseconds before we interrupt MessageLoop
        // thread (default 30 seconds).
        long patience = 1000 * 30;

        //patience = 1000 * 5;

        threadMessage("Starting MessageLoop thread");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new MessageLoop());
        t.start(); // kicks off thread that prints lines every 4 s

        threadMessage("Waiting for MessageLoop thread to finish");
        // loop until MessageLoop thread exits
        while (t.isAlive()) {
            threadMessage("Still waiting...");
            // Wait maximum 1 second for MessageLoop thread to finish.
            t.join(1000);
            
            // If we have to wait > patience, then interrupt sleep of Thread t.
            if (((System.currentTimeMillis() - startTime) > patience)
                  && t.isAlive()) {
                threadMessage("Tired of waiting!");
                t.interrupt();
                // Shouldn't be long now
                t.join();
            }
        }
        threadMessage("Finally!");
    }
}