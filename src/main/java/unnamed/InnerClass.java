package unnamed;
interface ForInnerClass {
    void show();
}

public class InnerClass {

    public static void main(String args[]) {
        ForInnerClass forInnerClass = new ForInnerClass() {
            @Override
            public void show() {
                System.out.println("Innerclass is implemeneted.");
            }
        };

        forInnerClass.show();

    }

}
