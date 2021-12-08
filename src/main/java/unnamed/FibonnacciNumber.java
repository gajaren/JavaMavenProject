package unnamed;
import org.testng.annotations.Test;

public class FibonnacciNumber {

    @Test
    public void printFibbonacciSeries() {
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        int counter = 10;

        System.out.print(n1 + " " + n2);

        for (int i = 2; i<counter ; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
