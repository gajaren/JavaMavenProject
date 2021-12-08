package SingletonClassImplementation;

public class SingletonUsingLazyInitialization {

    private static SingletonUsingLazyInitialization singletonUsingLazyInitialization;

    //private constructor is needed to restrict others to
    //create objects out of singleton class and force to
    //use getInstance() method
    private SingletonUsingLazyInitialization() {}

    public static SingletonUsingLazyInitialization getInstance() {
        if (singletonUsingLazyInitialization == null) {
            singletonUsingLazyInitialization = new SingletonUsingLazyInitialization();
        }

        return singletonUsingLazyInitialization;
    }
}

