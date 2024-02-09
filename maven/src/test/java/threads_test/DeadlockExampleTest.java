// test_threads/DeadlockExampleTest.java
package test_threads;

import threads.DeadlockExample;

public class DeadlockExampleTest {
    public static void main(String[] args) {
        final DeadlockExample deadlockExample = new DeadlockExample();

        Thread t1 = new Thread(() -> {
            deadlockExample.method1();
        });

        Thread t2 = new Thread(() -> {
            deadlockExample.method2();
        });

        t1.start();
        t2.start();
    }
}