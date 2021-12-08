package unnamed;
public class UpcashDowncast {

    public static void main(String args[]) {
        Parent p = new Child(); //upcasting
        System.out.println(p.parentAge);
        p.printAge();

        Child c = (Child)p; //Downcast is possible only for upcasting object
        System.out.println(c.childAge);
        System.out.println(c.parentAge);
        c.printAge();
    }

}

class Parent {
    int parentAge = 35;

    public void printAge() {
        System.out.println("Parent age: " + parentAge);
    }
}

class Child extends Parent{
    int childAge = 15;

    public void printAge() {
        System.out.println("Child age: " + childAge);
    }
}