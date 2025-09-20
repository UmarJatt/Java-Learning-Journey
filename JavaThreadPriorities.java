// This program explains thread priorities in Java.
// Each thread has a priority that helps the JVM decide the order of execution (not guaranteed).
// Priorities range from 1 (MIN_PRIORITY) to 10 (MAX_PRIORITY), default is 5 (NORM_PRIORITY).

public class JavaThreadPriorities {
    public static void main(String[] args) {

        System.out.println("Java Thread Priorities Example\n");

        // Creating threads
        Thread t1 = new Thread(new MyRunnable(), "Thread-1");
        Thread t2 = new Thread(new MyRunnable(), "Thread-2");
        Thread t3 = new Thread(new MyRunnable(), "Thread-3");

        // Setting thread priorities
        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MAX_PRIORITY);   // 10

        // Starting threads
        t1.start();
        t2.start();
        t3.start();

        // Display thread priorities
        System.out.println(t1.getName() + " priority: " + t1.getPriority());
        System.out.println(t2.getName() + " priority: " + t2.getPriority());
        System.out.println(t3.getName() + " priority: " + t3.getPriority());
    }
}

// Runnable class
class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running iteration " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " interrupted");
            }
        }
    }
}

/*
Key Points:

1. Thread priorities range from 1 (MIN_PRIORITY) to 10 (MAX_PRIORITY).
2. Default priority is 5 (NORM_PRIORITY).
3. JVM may use priority as a hint for scheduling but does not guarantee execution order.
4. Methods:
   - setPriority(int priority): sets the thread's priority
   - getPriority(): gets the thread's priority
5. Higher priority threads may get more CPU time, but actual scheduling depends on JVM and OS.
*/
