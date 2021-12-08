package StringManipulation;

public class StringCompareToMethod {

    //compareTo method belongs to Comparable interface
    //It compares first String with second string lexicographically
    //i.e. X is greater than a
    //Character at first index at both String will be campared
    //Difference between them is returned.

    public static void main(String args[]) {
        String a = "XYZ";
        String b = "abc";
        String c = "XYa";
        String d = "xyz";

        System.out.println(a.compareTo(b));
        System.out.println(a.compareTo(c));
        System.out.println(a.compareTo(d));
    }
}
