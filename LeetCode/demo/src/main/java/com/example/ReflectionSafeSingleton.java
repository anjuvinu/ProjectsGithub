public class ReflectionSafeSingleton {
    private static final ReflectionSafeSingleton INSTANCE = new ReflectionSafeSingleton();

    private ReflectionSafeSingleton() {
        // Protect against instantiation via Reflection
        if (INSTANCE != null) {
            throw new RuntimeException
            ("Use getInstance() method to get the single instance of this class.");
        }
    }

    public static ReflectionSafeSingleton getInstance() {
        return INSTANCE;
    }
}

