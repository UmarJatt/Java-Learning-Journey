// This program explains creating threads in Java using the Runnable interface.
// Runnable interface allows a class to define a thread task without extending Thread class.
// We implement the run() method to define the task and pass the Runnable object to a Thread.
// Call start() on the Thread object to execute the thread.

public class ThreadUsingRunnableInterface {
    public static void main(String[] args) {

        System.out.println("Threading using Runnable interface Example\n");

        // Creating Runnable objects
        MyRunnable runnable1 = new MyRunnable("Runnable-1");
        MyRunnable runnable2 = new MyRunnable("Runnable-2");

        // Passing Runnable objects to Thread
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        // Starting threads
        thread1.start();
        thread2.start();

        System.out.println("Main thread ends here");
    }
}

// Class implementing Runnable interface
class MyRunnable implements Runnable {
    private String threadName;

    // Constructor to set thread name
    MyRunnable(String name) {
        threadName = name;
    }

    // Overriding run() method
    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(threadName + " is running: " + i);
            try {
                Thread.sleep(500); // pause for 0.5 second
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted");
            }
        }
        System.out.println(threadName + " finished execution");
    }
}

/*
Key Points:

1. Implement Runnable interface and override run() method to define thread task.
2. Pass Runnable object to Thread constructor.
3. Call start() on Thread object to begin execution.
4. Multiple threads can run concurrently, managed by JVM scheduler.
5. Runnable interface allows extending another class while creating a thread.
*/
