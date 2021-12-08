package StringManipulation;

import org.testng.annotations.Test;


import java.util.HashSet;
import java.util.Set;

public class IfStringHasUniqueCharacters {

    // 1. Convert string into characterarray and add character to hashset if it returns false that means
    // it is a repetitive character

    // 2. calculate indexof and lastindexof. if it is different that means there are mulyiple occurences
    // of a character

    @Test
    public void validateStringHasUniqueCharactersUsingSet() {
        String a = "strring";
        if(findUniqueCharacterInStringUsingSet(a)) System.out.println("Unique characters");
        else System.out.println("repetitive characters");
    }

    public Boolean findUniqueCharacterInStringUsingSet(String testString) {

        Set<Character> newSet = new HashSet<>();
        for (char i : testString.toCharArray()) {
            if(!newSet.add(i)) {
                return false;
            }
        }
        return true;
    }
}
