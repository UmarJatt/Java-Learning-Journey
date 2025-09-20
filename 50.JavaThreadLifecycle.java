// This program explains the lifecycle of a thread in Java.
// A thread goes through several states: New, Runnable, Running, Waiting/Blocked, and Terminated.
// Methods like start(), sleep(), and join() help control the thread's lifecycle.

public class JavaThreadLifecycle {
    public static void main(String[] args) {

        System.out.println("Java Thread Lifecycle Example\n");

        // Creating a thread
        Thread thread = new Thread(new MyRunnable(), "Thread-1");

        // State: New
        System.out.println(thread.getName() + " state before start(): " + thread.getState());

        // Starting the thread -> state changes to Runnable
        thread.start();
        System.out.println(thread.getName() + " state after start(): " + thread.getState());

        try {
            // Wait for the thread to finish
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // State: Terminated
        System.out.println(thread.getName() + " state after completion: " + thread.getState());
    }
}

// Runnable class
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running...");
        try {
            Thread.sleep(1000); // Simulate work and thread enters Timed Waiting
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " finished execution");
    }
}

/*
Thread States in Java:

1. New: Thread object is created but start() is not called.
2. Runnable: Thread is ready to run and waiting for CPU scheduling.
3. Running: Thread's run() method is executing.
4. Waiting/Blocked/Timed Waiting: Thread is waiting for a resource or sleep/join time.
5. Terminated: Thread has finished execution.

Key Methods:
- start(): moves thread from New to Runnable
- run(): defines the task (called by JVM internally)
- sleep(milliseconds): pauses thread temporarily
- join(): waits for thread to finish before proceeding
- getState(): returns current state of thread
*/
