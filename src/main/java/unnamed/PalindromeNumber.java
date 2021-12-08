package unnamed;
import org.testng.annotations.Test;

public class PalindromeNumber {

    @Test
    public void isNumberPalindrome() {
        int a = 121;
        int original = a;
        int reverse = 0;

        while (a != 0) {
            reverse = reverse*10 + a%10;
            a = a /10;
        }
        System.out.println("original value is : " + original);
        System.out.println("reverse number is : " + reverse);

        if (original == reverse) System.out.println("Palindrome number.");
        else System.out.println("Not a palindrome number.");
    }
}
