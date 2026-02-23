//Singleton seguro para threads usando metodo double check locking (DCL)
public final class SingletonTS {
    private static volatile SingletonTS instance;

    public String value;

    private SingletonTS(String value) {
        this.value = value;
    }

    public static SingletonTS getInstance(String value) {
        SingletonTS result = instance;
        if (result != null) {
            return result;
        }
        synchronized (SingletonTS.class) {
            if (instance == null) {
                instance = new SingletonTS(value);
            }
            return instance;
        }
    }
}
