void main() {
    System.out.println("Teste do singleton ingênuo em single thread:\n");

    Singleton singleton = Singleton.getInstance("DIT");
    Singleton outroSingleton = Singleton.getInstance("DAH");

    System.out.println(singleton.value);
    System.out.println(outroSingleton.value);

    System.out.println("\nTeste do singleton ingênuo em multi thread:\n");

    Thread threadDitUnsafe = new Thread(new ThreadDitUnsafe());
    Thread threadDahUnsafe = new Thread(new ThreadDahUnsafe());
    try {
        threadDitUnsafe.start();
        threadDahUnsafe.start();

        threadDitUnsafe.join();
        threadDahUnsafe.join();
    } catch (InterruptedException e){
        throw new RuntimeException(e);
    }
    System.out.println("\nTeste do singleton seguro em multi thread:\n");

    Thread threadDitSafe = new Thread(new ThreadDitSafe());
    Thread threadDahSafe = new Thread(new ThreadDahSafe());
    try {
        threadDitSafe.start();
        threadDahSafe.start();

        threadDitSafe.join();
        threadDahSafe.join();
    } catch (InterruptedException e){
        throw new RuntimeException(e);
    }
}

static class ThreadDitUnsafe implements Runnable {
    @Override
    public void run() {
        SingletonTU singleton =SingletonTU.getInstance("DIT");
        System.out.println(singleton.value);
    }
}

static class ThreadDahUnsafe implements Runnable {
    @Override
    public void run() {
        SingletonTU singleton = SingletonTU.getInstance("DAH");
        System.out.println(singleton.value);
    }
}

static class ThreadDitSafe implements Runnable {
    @Override
    public void run() {
        SingletonTS singleton =SingletonTS.getInstance("DIT");
        System.out.println(singleton.value);
    }
}

static class ThreadDahSafe implements Runnable {
    @Override
    public void run() {
        SingletonTS singleton = SingletonTS.getInstance("DAH");
        System.out.println(singleton.value);
    }
}