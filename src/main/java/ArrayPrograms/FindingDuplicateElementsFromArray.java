package ArrayPrograms;


import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.Test;

public class FindingDuplicateElementsFromArray {

    @Test
    public void findDuplicateEntries() {
        String[] fruits = {"Apple", "Orange", "Watermelon", "Mango", "Orange", "Watermelon"};

        Set<String> duplicateFruits = new HashSet<>();

        for (String element : fruits) {
            if(!duplicateFruits.add(element)) {
                System.out.println(element);
            }
        }
    }
}
