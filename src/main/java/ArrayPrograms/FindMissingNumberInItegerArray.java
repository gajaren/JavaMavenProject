package ArrayPrograms;

import org.testng.annotations.Test;

public class FindMissingNumberInItegerArray {

    @Test
    public void findMissingNumber() {
        int[] numArray = {1, 2, 3, 5, 6};
        int totalElements = 6;

        //mathematical formula is n(n+1)/2
        //Calculated expected sum using total number of array elements
        //Add each each element in the array and find acual sum
        //expSum - actualSum will give you missing number.
        int expSum = totalElements* (totalElements+1)/2;
        int actualSum = 0;
        for (int i =0; i<numArray.length; i++) {
            actualSum += numArray[i];
        }

        System.out.println("missing number from array is : " + (expSum-actualSum));
    }
}
