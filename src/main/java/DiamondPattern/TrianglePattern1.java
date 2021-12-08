package DiamondPattern;

public class TrianglePattern1 {

    public static void main(String[] args) {

        for (int i = 1; i<=5; i++) { //Total 5 rows
            for (int j=1; j<=i; j++) { //For column
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
