package StringManipulation;

import java.util.ArrayList;
import java.util.List;

public class PalindromeCombinationsFromString {

    // 1. Create all possible strings using substring method
    // 2. Call palindrome method. Return true if string is palindrome
    // 3. Add string into arraylist only if above palindrome method is returning true

    public static void main(String[] args) {

        String a = "Hi thiis is eveningn";
        List<String> palindrome = new ArrayList<>();

        for (int i = 0; i < a.length(); i++) {
            for (int j = i + 1; j <= a.length(); j++) {
                if (isPalindrome(a.substring(i, j))) {
                    palindrome.add(a.substring(i, j));
                }
            }
        }

        System.out.println(palindrome);

    }

    private static Boolean isPalindrome(String listStrings) {
        if (listStrings.length() > 1) {
            StringBuilder a = new StringBuilder(listStrings);
            String b = a.reverse().toString();

            return listStrings.equals(b);
        } else {
            return false;
        }
    }
}

