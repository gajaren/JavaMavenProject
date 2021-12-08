package StringManipulation;

public class RemoveJunkCharacters {

    public static void main(String args[]) {
        String str = "*(hi6767{:<|uiu_+";

        //System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));

        String goodString = "";
        for(int i = 0; i< str.length() - 1; i++) {
            if ((str.charAt(i) >= 48 && str.charAt(i) <=57) ||
                    (str.charAt(i) >=65 && str.charAt(i) <= 90) ||
                    (str.charAt(i) >=97 && str.charAt(i) <= 122)) {
                goodString += str.charAt(i);
            }
        }

        System.out.println(goodString);
    }
}
