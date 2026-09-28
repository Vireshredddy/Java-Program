import java.io.*;

public class ThreadSafeSingleton implements Serializable, Cloneable {
    private static volatile ThreadSafeSingleton instance;
    private ThreadSafeSingleton() {}
    public static ThreadSafeSingleton getInstance() {
        if (instance == null) synchronized (ThreadSafeSingleton.class) {
            if (instance == null) instance = new ThreadSafeSingleton();
        }
        return instance;
    }
    protected Object readResolve() { return getInstance(); }
    @Override protected Object clone() throws CloneNotSupportedException { throw new CloneNotSupportedException("Singleton"); }
    public static void main(String[] args) { System.out.println(getInstance()==getInstance()); }
}