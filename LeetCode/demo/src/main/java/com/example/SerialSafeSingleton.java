import java.io.Serializable;

public class SerialSafeSingleton implements Serializable {
    private static final long serialVersionUID = 1L;
    private static final SerialSafeSingleton INSTANCE = new SerialSafeSingleton();

    private SerialSafeSingleton() {}

    public static SerialSafeSingleton getInstance() {
        return INSTANCE;
    }

    // This method is called during deserialization
    protected Object readResolve() {
        return getInstance(); // Returns the original instance instead of the new one
    }
}