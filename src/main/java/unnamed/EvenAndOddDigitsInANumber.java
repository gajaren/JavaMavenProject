package unnamed;
import java.util.HashMap;
import java.util.Map;

public class EvenAndOddDigitsInANumber {

    public static void main(String args[]) {
        int number = 13547;
        Map<String, Integer> oddAndEvenMap = new HashMap<>();
        oddAndEvenMap.put("Odd", 0);
        oddAndEvenMap.put("Even", 0);

        while (number > 0) {
            if ((number % 10) % 2 == 0) {
                oddAndEvenMap.put("Even", oddAndEvenMap.get("Even") + 1);
            } else {
                oddAndEvenMap.put("Odd", oddAndEvenMap.get("Odd") + 1);
            }

            number /= 10;
        }

        System.out.println(oddAndEvenMap);
    }
}
