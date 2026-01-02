package main.java.com.example;
public  class Singleton {
     // 1. Static variable to hold the one instance
    private static Singleton instance;
    //2. Private constructor so no one can instantiate it from outside
    private Singleton() {
        
    }
    // 3. Static method to provide global access
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

