package test_threads;

import threads.Singleton;

public class SingletonTest {
    public static void main(String[] args) {
        // Get instances of Singleton and ensure they are the same
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        // Print hash codes to verify if both instances are the same
        System.out.println("Hash code of singleton1: " + singleton1.hashCode());
        System.out.println("Hash code of singleton2: " + singleton2.hashCode());

        // Check if both instances are the same
        if (singleton1 == singleton2) {
            System.out.println("Singleton pattern is working correctly!");
        } else {
            System.out.println("Singleton pattern has issues!");
        }
    }
}