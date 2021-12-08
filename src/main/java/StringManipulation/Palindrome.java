package StringManipulation;

import org.testng.annotations.Test;

public class Palindrome {

    @Test
    public void validatePalindromeUsingCharacterArray () {
        int number = 1010;
        String a = "nan";

        // 1. Convert string into character array
        // 2. Use for loop for comparing first and last character
        // 3. Compare second and second last character
        // 4. if compare fails then return false

        char[] stringArray = String.valueOf(number).toCharArray();
        if(isPalindromeUsingCharacterArray(stringArray)) System.out.println("StringManipulation.Palindrome");
        else System.out.println("Not palindrome");
    }

    @Test
    public void validatePalindromeUsingStringBuilder() {
        String a = "nan";

        if(isPalindromeUsingStringBuilder(a)) System.out.println("StringManipulation.Palindrome");
        else System.out.println("Not palindrome");
    }

    @Test
    public void validatePalindromeUsingWhileLoop() {
        String a = "nana";
        if(isPalindromeUsingWhileLoop(a)) System.out.println("StringManipulation.Palindrome");
        else System.out.println("Not palindrome");
    }

    private Boolean isPalindromeUsingWhileLoop(String str) {
        int i = 0;
        int j = str.length() -1;

        while (i<j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }

    private Boolean isPalindromeUsingStringBuilder(String original) {
        StringBuilder oriStringBuilder = new StringBuilder(original);
        String reverse = oriStringBuilder.reverse().toString();

        return original.equals(reverse);
    }

    private Boolean isPalindromeUsingCharacterArray(char[] string){
        for (int i = 0; i < string.length; i++) {
            if (string[i] != string[string.length - i - 1]) {
                return false;
            }
        }

        return true;
    }
}
