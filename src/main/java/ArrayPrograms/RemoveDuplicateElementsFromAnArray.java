package ArrayPrograms;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class RemoveDuplicateElementsFromAnArray {

    @Test
    public void removeDuplicatesFromArray() {
        int[] duplicateFruitsArray = {1,1,2,3,4,5,6,6};

//        Set<Integer> fruitsSet = new HashSet<>();
//        //Add array elements to Set
//        for (int i = 0; i < duplicateFruitsArray.length; i++) {
//            fruitsSet.add(duplicateFruitsArray[i]);
//        }
//
//        //Copy back elements from set to Array
//        int[] distinctFruitsArray = new int[fruitsSet.size()];
//        int j = 0;
//        for (Integer fruit: fruitsSet) {
//            distinctFruitsArray[j++] = fruit;
//        }
//        System.out.println(Arrays.toString(distinctFruitsArray));


//        int[] distinctFruits = Arrays.stream(duplicateFruitsArray)
//                .distinct()
//                .toArray();
//
//        System.out.println(Arrays.toString(distinctFruits));

        int length = duplicateFruitsArray.length;
        for (int i = 0 ; i< length-1; i++)  {
            for (int j = i+1; j<length ; j++) {
                if (duplicateFruitsArray[i]==duplicateFruitsArray[j]) {
                    //Assign last index value to duplicate value
                    duplicateFruitsArray[j] = duplicateFruitsArray[length -1];
                    //Decrease the length of the array
                    length--;
                }
            }
        }

        //Write for loop to print all array element with new length
        for (int i =0; i< length ; i++) {
            System.out.println(duplicateFruitsArray[i]);
        }

    }

}
