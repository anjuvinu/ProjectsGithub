package main.java.com.example;
//double checked locking for thread safety
public class ThreadSafeSingleton {
    // 1. Static variable to hold the one instance with volatile keyword
    private static volatile ThreadSafeSingleton instance;
    //2. Private constructor so no one can instantiate it from outside
    private ThreadSafeSingleton() {
        
    }
    // 3. Static method to provide global access
    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) { //check 1
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {//check2
                    instance = new ThreadSafeSingleton();
                }
            }
           
        }
        return instance;
    }
}
