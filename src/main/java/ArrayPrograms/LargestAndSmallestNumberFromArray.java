package ArrayPrograms;


import java.util.Arrays;

import org.testng.annotations.Test;

public class LargestAndSmallestNumberFromArray {

    @Test
    public void findLargestAndSmallestNumberFromArray() {
        int[] numArray = {1, 56, 3, -67, 80, 61};

//        Arrays.sort(numArray);
//        System.out.println("Largest : " + numArray[numArray.length - 1]);
//        System.out.println("Smallest : " + numArray[0]);
//        System.out.println("Second largest : " + numArray[numArray.length - 2]);

        int largest = numArray[0];
        for ( int i =0; i< numArray.length - 1; i++) {
            //Check if Next array number is greater than largest. If yes, then assign largest with
            //array number
            if (largest < numArray[i + 1]) {
                largest = numArray[i + 1];
            }
        }

        System.out.println("largest is : " + largest);

        int smallest = numArray[0];
        for ( int i =0; i< numArray.length - 1; i++) {
            //Check if Next array number is less than largest. If yes, then assign largest with
            //array number
            if (smallest > numArray[i + 1]) {
                smallest = numArray[i + 1];
            }
        }

        System.out.println("smallest is : " + smallest);

//        Object[] a = new String[5];
//        a[1] = "A";
//        a[2] =  100;
//        System.out.println(a);


        System.out.println(2.0/0);
    }
}
