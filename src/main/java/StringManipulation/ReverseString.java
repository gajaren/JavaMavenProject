package StringManipulation;

import org.testng.annotations.Test;

public class ReverseString {

    public static void main(String[] args) {
        String a = "temporary";
        String reverse = "";

        for (int i = a.length() - 1; i>=0; i--) {
            reverse = reverse + a.charAt(i);
        }

        System.out.println(reverse);
    }

    @Test
    public void reverseStringUsingCharArray() {
        String a = "temporary";
        char[] charArray = a.toCharArray();
        String reverse = "";

        for (int i = charArray.length - 1; i>=0; i--) {
            reverse = reverse + charArray[i];
        }

        System.out.println(reverse);
    }
}
