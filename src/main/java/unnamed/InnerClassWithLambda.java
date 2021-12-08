package unnamed;
interface ForInnerClassLambda {
    void show();
}

public class InnerClassWithLambda {

    public static void main(String args[]) {
        ForInnerClassLambda forInnerClassLambda = () -> System.out.println("Lambda show");
        forInnerClassLambda.show();
    }
}
