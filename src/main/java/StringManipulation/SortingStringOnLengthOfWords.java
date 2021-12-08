package StringManipulation;

import org.testng.annotations.Test;

import java.util.Arrays;

public class SortingStringOnLengthOfWords {

    @Test
    public void sortingStringByLengthUsingComparator() {
        String a = "My name is Nilesh";
        String[] array = a.split(" ");
        Arrays.sort(array, ((o1, o2) -> o1.length()-o2.length()));
        System.out.println(Arrays.toString(array));
    }
}
