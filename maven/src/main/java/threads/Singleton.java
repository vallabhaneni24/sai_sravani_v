package threads;

public class Singleton {
    // Private static variable to hold the instance of the Singleton class
    private static Singleton instance;

    // Private constructor to prevent instantiation from other classes
    private Singleton() {
    }

    // Static method to get the instance of the Singleton class
    public static Singleton getInstance() {
        // Check if the instance is null, then create a new instance
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}