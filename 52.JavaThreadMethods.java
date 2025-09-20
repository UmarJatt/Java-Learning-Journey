// This program explains important methods of the Thread class in Java.
// Thread class provides methods to control and manage threads, such as start(), run(), sleep(), join(), setName(), getName(), setPriority(), and getPriority().

public class JavaThreadMethods {
    public static void main(String[] args) {

        System.out.println("Java Thread Methods Example\n");

        // Creating a thread using Runnable
        Thread thread = new Thread(new MyRunnable());

        // Setting thread name
        thread.setName("DemoThread");

        // Setting thread priority
        thread.setPriority(Thread.NORM_PRIORITY);

        System.out.println("Thread Name: " + thread.getName());
        System.out.println("Thread Priority: " + thread.getPriority());

        // Starting thread
        thread.start();

        // Main thread waiting for this thread to complete
        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting");
        }

        System.out.println("Main thread ends here");
    }
}

// Runnable class
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running...");
        try {
            // Pausing thread for 1 second
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrupted");
        }
        System.out.println(Thread.currentThread().getName() + " finished execution");
    }
}

/*
Important Thread Methods:

1. start(): Begins the thread execution, calling run() internally.
2. run(): Contains the code to be executed by the thread.
3. sleep(milliseconds): Pauses the thread for specified time.
4. join(): Waits for the thread to finish before continuing.
5. setName(String name): Assigns a name to the thread.
6. getName(): Returns the name of the thread.
7. setPriority(int priority): Sets thread priority (1 to 10).
8. getPriority(): Gets the priority of the thread.
9. isAlive(): Checks if thread is still running.
10. interrupt(): Interrupts a thread in waiting or sleeping state.
*/
