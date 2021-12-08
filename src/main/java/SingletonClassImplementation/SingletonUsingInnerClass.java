package SingletonClassImplementation;

public class SingletonUsingInnerClass {

    private SingletonUsingInnerClass() {}

    //Inner class creates final instance of singleton class.
    //Inner class loads into memory only when one of it's static members are called.
    private static class SingletonHelper {
        private static final SingletonUsingInnerClass INSTANCE =
                new SingletonUsingInnerClass();
    }

    public static SingletonUsingInnerClass getInstance() {
        return SingletonHelper.INSTANCE;
    }
}

