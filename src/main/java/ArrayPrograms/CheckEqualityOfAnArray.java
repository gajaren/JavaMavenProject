package ArrayPrograms;



import java.util.Arrays;

import org.testng.annotations.Test;

public class CheckEqualityOfAnArray {

    @Test
    public void checkEqualityOfArray() {
        String[] fruitArray1 = {"apple", "orange", "banana"};
        String[] fruitArray2 = {"watermelon","apple", "orange", "banana"};

        //Method 1 -> Compare each element of the array one by one.
//        if(fruitArray1.length == fruitArray2.length) {
//            for (int i =0; i< fruitArray1.length; i++) {
//                if (fruitArray1[i] != fruitArray2[i]) {
//                    System.out.println("Two arrays are not equal.");
//                    return;
//                }
//            }
//            System.out.println("Two arrays are equals.");
//        } else {
//            System.out.println("Two arrays are not equals.");
//        }

        //Method 2 -> Use Arrays.equals method
        if (Arrays.equals(fruitArray1, fruitArray2)) System.out.println("Two Arrays are equals.");
        else System.out.println("Two arrays are not equals.");
    }
}
