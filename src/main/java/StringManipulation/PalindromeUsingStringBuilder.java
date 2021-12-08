package StringManipulation;

public class PalindromeUsingStringBuilder {

    public static void main (String[] args) {
        String a = "nan";
        StringBuilder s = new StringBuilder(a);
        String b = s.reverse().toString();

        if (a.equals(b)) {
            System.out.println("StringManipulation.Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

}
