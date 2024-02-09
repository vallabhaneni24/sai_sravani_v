// threads/DeadlockExample.java
package threads;

public class DeadlockExample {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void method1() {
        synchronized (lock1) {
            System.out.println("Thread 1: Holding lock 1...");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread 1: Waiting for lock 2...");

            synchronized (lock2) {
                System.out.println("Thread 1: Holding lock 1 and lock 2...");
            }
        }
    }

    public void method2() {
        synchronized (lock2) {
            System.out.println("Thread 2: Holding lock 2...");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Thread 2: Waiting for lock 1...");

            synchronized (lock1) {
                System.out.println("Thread 2: Holding lock 2 and lock 1...");
            }
        }
    }
}