package StringManipulation;

import org.testng.annotations.Test;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepetitiveString {

    @Test
    public void firstNonRepetitiveStringUsingIndexOf() {
        String a = "repetitiver";
        char[] charArray = a.toCharArray();

        for (int i = 0; i< a.length() ; i++) {
            if (a.indexOf(charArray[i]) == a.lastIndexOf(charArray[i])) {
                System.out.println("First non-repetitive character is : "+ charArray[i]);
                break;
            }
        }
    }

    @Test
    public void findNonRepetitiveCharacterUsingMap() {
        String a = "repetitiver";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char i : a.toCharArray()) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }

        for (Map.Entry<Character, Integer> mapEntry : map.entrySet()) {
            if (mapEntry.getValue() == 1) {
                System.out.println("First non-repetitive character is : " + mapEntry.getKey());
                break;
            }
        }
        System.out.println(map.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get().getKey());
    }
}
