// This program explains multithreading in Java.
// Multithreading allows a program to execute multiple threads (tasks) simultaneously.
// Benefits: efficient CPU utilization, faster execution of tasks, better resource management.
// Two ways to create a thread:
// 1. By extending Thread class
// 2. By implementing Runnable interface

public class MultithreadingInJava {
    public static void main(String[] args) {

        System.out.println("Multithreading Example\n");

        // 1. Using Thread class
        ThreadExample thread1 = new ThreadExample();
        thread1.start(); // start the thread

        // 2. Using Runnable interface
        RunnableExample runnable = new RunnableExample();
        Thread thread2 = new Thread(runnable);
        thread2.start();

        System.out.println("Main thread ends here");
    }
}

// ---------------- Using Thread class ----------------
class ThreadExample extends Thread {
    @Override
    public void run() {
        // Code executed by this thread
        for(int i = 1; i <= 5; i++) {
            System.out.println("ThreadExample running: " + i);
            try {
                Thread.sleep(500); // pause for 0.5 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

// ---------------- Using Runnable interface ----------------
class RunnableExample implements Runnable {
    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("RunnableExample running: " + i);
            try {
                Thread.sleep(500); // pause for 0.5 second
            } catch (InterruptedException e) {
                System.out.println("Runnable thread interrupted");
            }
        }
    }
}

/*
Key Points:

1. Thread class:
   - Extend Thread and override run() method.
   - Call start() to begin execution.

2. Runnable interface:
   - Implement Runnable and override run() method.
   - Pass Runnable object to Thread and call start().

3. Thread methods:
   - start(): begins thread execution
   - run(): contains code executed by thread
   - sleep(milliseconds): pauses thread
   - join(): waits for thread to finish
*/
