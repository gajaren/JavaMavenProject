package SingletonClassImplementation;

//https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
//https://dzone.com/articles/java-singletons-using-enum

public class SingletonUsingDoubleCheckedLocking {

    private static SingletonUsingDoubleCheckedLocking singletonUsingLazyInitialization;

    //private constructor is needed to restrict others to
    //create objects out of singleton class and force to
    //use getInstance() method
    private SingletonUsingDoubleCheckedLocking() {}

    public static SingletonUsingDoubleCheckedLocking getInstance() {
        if (singletonUsingLazyInitialization == null) {
            //synchronized creates a lock on first thread and doesn't
            //allow another thread in it. Next time onwards, if condition
            //outside synchronized block fails hence no need to create a lock.
            //It will directly return new instance. Useful in heavy multithreading
            //environmnet

            synchronized (SingletonUsingDoubleCheckedLocking.class) {
                if (singletonUsingLazyInitialization == null) {
                    singletonUsingLazyInitialization = new SingletonUsingDoubleCheckedLocking();
                }
            }
        }

        return singletonUsingLazyInitialization;
    }
}

