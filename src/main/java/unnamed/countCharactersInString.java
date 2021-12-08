package unnamed;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class countCharactersInString {

    @Test
    public void countNumberOfCharacters() {
        String a = "test";

        Map<Character, Integer> mapOfCharacters = new HashMap<>();

        char[] charArray = a.toCharArray();

        for (int i = 0; i<charArray.length; i++) {
            if(!mapOfCharacters.containsKey(charArray[i])){
                mapOfCharacters.put(charArray[i], 1);
            } else {
                mapOfCharacters.put(charArray[i], mapOfCharacters.get(charArray[i])+1);
            }
        }

        mapOfCharacters.entrySet().forEach(System.out::println);
    }

    @Test
    public void countCharacterUsingStream() {
        String a = "test";

        Long count = a.chars().filter(ch -> ch == 'y').count();
        System.out.println(count);
    }
}
