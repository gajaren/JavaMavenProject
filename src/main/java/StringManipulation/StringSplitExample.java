package StringManipulation;

public class StringSplitExample {

    public static void main(String[] args) {

        String s = "a/b/c/d";
        String[] a1 = s.split("/");
        System.out.println("split string using only regex:");
        for (String string : a1) {
            System.out.println(string);
        }
        System.out.println("split string using regex with limit:");

        //Limit specifies that split should be done only 2 times below
        String[] a2 = s.split("/", 2);
        for (String string : a2) {
            System.out.println(string);
        }
    }

}
