// This program explains the constructors of the Thread class in Java.
// The Thread class has multiple constructors to create threads with different options like thread name, Runnable, or ThreadGroup.
// Common constructors:
// 1. Thread()                   -> creates a thread with default name
// 2. Thread(Runnable r)         -> creates a thread with a Runnable task
// 3. Thread(String name)        -> creates a thread with a given name
// 4. Thread(Runnable r, String name) -> creates thread with Runnable task and custom name

public class JavaThreadConstructor {
    public static void main(String[] args) {

        System.out.println("Java Thread Constructors Example\n");

        // 1. Default constructor
        Thread t1 = new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " running using default constructor");
            }
        };
        t1.start();

        // 2. Constructor with Runnable
        Runnable task = () -> {
            System.out.println(Thread.currentThread().getName() + " running using Runnable constructor");
        };
        Thread t2 = new Thread(task);
        t2.start();

        // 3. Constructor with custom thread name
        Thread t3 = new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " running with custom name constructor");
            }
        };
        t3.setName("CustomThread");
        t3.start();

        // 4. Constructor with Runnable and name
        Thread t4 = new Thread(task, "RunnableThread");
        t4.start();
    }
}

/*
Key Points about Thread Constructors:

1. Thread(): Default constructor, assigns system-generated name like Thread-0.
2. Thread(Runnable r): Creates a thread with the task defined in Runnable.
3. Thread(String name): Assigns custom name to thread.
4. Thread(Runnable r, String name): Defines both Runnable task and thread name.
5. ThreadGroup can also be passed to group threads logically.
6. Use start() to begin thread execution; run() should not be called directly.
*/
