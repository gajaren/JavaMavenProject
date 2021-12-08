package StringManipulation;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfWordInAString {

    @Test
    public void countOccurencesOfTheWordInAString() {
        String statement = "Hi this is Nilesh hi this is Saket";
        String[] wordStringArray = statement.split(" ");

        Map<String, Integer> occurenceMap = new HashMap<>();

        for (String word : wordStringArray) {
            if(!occurenceMap.containsKey(word)) {
                occurenceMap.put(word, 1);
            } else {
                occurenceMap.put(word, occurenceMap.get(word) + 1);
            }
        }

        occurenceMap.entrySet().forEach(System.out::println);
    }
}
