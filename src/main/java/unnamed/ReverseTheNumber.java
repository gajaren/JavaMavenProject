package unnamed;
import org.testng.annotations.Test;

public class ReverseTheNumber {

    @Test
    public void reverseNumber() {
        int a = 123;
        int original = a;
        int reverse = 0;

        while(a>0) {
            reverse =  reverse*10 + a%10;
            a=a/10;
        }

        System.out.println("reverse number is : " + reverse);
    }

    @Test
    public void reverseNumberUsingRecursion() {
        int a = 123;

        reverseUsingRecursion(a);
    }

    public void reverseUsingRecursion(int num) {
        int reverse = 0;
        if (num<10) {
            System.out.print(num);
            return;
        } else {
            System.out.print(num % 10);
            reverseUsingRecursion((num/10));
        }
    }
}
