package unnamed;
import org.testng.annotations.Test;

public class FactorialNumbers {

    @Test
    public void findFactorialNumber() {
        int number = 6;
        System.out.println(factorial(number));
    }

    private int factorial(int n) {
        int factorial = 1;

        for (int i =2; i<=n ; i++) {
            factorial = factorial *i;
        }

        return factorial;
    }

    //Recursive way
//    static int factorial(int n)
//    {
//        if (n == 0)
//            return 1;
//
//        return n*factorial(n-1);
//    }

    //Ternary operator
//    int factorial(int n)
//    {
//
//        // single line to find factorial
//        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);
//
//    }
}
