//Singleton ingênuo para multi thread(thread unsafe)
public final class SingletonTU {
    private static SingletonTU instance;
    public String value;

    private SingletonTU(String value){
        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.value = value;
    }

    public static SingletonTU getInstance(String value){
        if (instance == null) {
            instance = new SingletonTU(value);
        }
        return instance;
    }
}
