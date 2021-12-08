package SingletonClassImplementation;

// Java program to demonstrate the example
// of using Enum as Singleton

enum SingletonEnum {
    INSTANCE;
    int value;
    String name;

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Main {

    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.INSTANCE;

        System.out.println(singleton.getValue());
        System.out.println(singleton.getName());
        singleton.setValue(2);
        singleton.setName("Singleton");
        System.out.println(singleton.getValue());
        System.out.println(singleton.getName());
    }
}