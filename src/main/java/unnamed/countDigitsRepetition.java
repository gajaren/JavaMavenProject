package unnamed;


import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class countDigitsRepetition {

    @Test
    public void countOfEachDigitRepetition() {
        long a = 2;

        Map<Long, Integer> countRepetition = new HashMap<>();

        if (a % 10 == 0) {
            System.out.println("length of a is : " + 1);
        } else {
            while (a!=0) {
                if (!countRepetition.containsKey(a%10)) {
                    countRepetition.put(a%10, 1);
                } else {
                    countRepetition.put(a%10, countRepetition.get(a%10) + 1);
                }
                a = a / 10;
            }
        }

        countRepetition.entrySet().forEach(System.out::println);
    }
}
