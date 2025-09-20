// This program explains creating threads in Java using the Thread class.
// By extending the Thread class, a class becomes a thread and can run concurrently.
// We override the run() method to define the task for the thread.
// Call start() to execute the thread, which internally calls run().

public class ThreadingUsingThreadClass {
    public static void main(String[] args) {

        System.out.println("Threading using Thread class Example\n");

        // Creating thread objects
        MyThread thread1 = new MyThread("Thread-1");
        MyThread thread2 = new MyThread("Thread-2");

        // Starting threads
        thread1.start(); // start Thread-1
        thread2.start(); // start Thread-2

        System.out.println("Main thread ends here");
    }
}

// Class extending Thread
class MyThread extends Thread {
    private String threadName;

    // Constructor to set thread name
    MyThread(String name) {
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

1. Extend Thread class and override run() method to define the task.
2. Call start() to begin thread execution. Do not call run() directly.
3. Multiple threads can run concurrently, controlled by JVM scheduler.
4. sleep(milliseconds) pauses the thread temporarily.
5. Thread names help identify threads in output.
*/
