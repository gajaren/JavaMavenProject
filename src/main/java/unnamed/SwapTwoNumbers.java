package unnamed;
import org.testng.annotations.Test;

public class SwapTwoNumbers {

    @Test
    public void swappingTwoNumbers() {
        int a = 10;
        int b = 20;

        //swapping using temp variables
//        int temp;
//        temp = a;
//        a = b;
//        b = temp;

        //without using temp variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a is : " + a + " and b is : " + b);
    }
}
