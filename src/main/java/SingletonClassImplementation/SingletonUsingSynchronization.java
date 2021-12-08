package SingletonClassImplementation;

public class SingletonUsingSynchronization {

    private static SingletonUsingSynchronization singletonUsingLazyInitialization;

    //private constructor is needed to restrict others to
    //create objects out of singleton class and force to
    //use getInstance() method
    private SingletonUsingSynchronization() {}

    //The easier way to create a thread-safe singleton class
    //is to make the global access method synchronized, so that
    //only one thread can execute this method at a time.
    //Above implementation works fine and provides thread-safety but
    //it reduces the performance because of the cost associated with
    //the synchronized method
    public synchronized static SingletonUsingSynchronization getInstance() {
        if (singletonUsingLazyInitialization == null) {
            singletonUsingLazyInitialization = new SingletonUsingSynchronization();
        }

        return singletonUsingLazyInitialization;
    }
}

