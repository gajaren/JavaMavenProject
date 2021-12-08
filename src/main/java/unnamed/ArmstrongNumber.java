package unnamed;
import org.testng.annotations.Test;

public class ArmstrongNumber {

    @Test
    public void validateIfArmstrongNumber() {
        int num = 153;
        int originalNumber = num;
        double result = 0;

        while (originalNumber>0) {
            result = result + Math.pow((originalNumber%10) , 3);
            originalNumber = originalNumber/10;
        }

        System.out.println("Resulted number : " + result);

        if (num == result) System.out.println("Armstrong number");
        else System.out.println("Not a armstrong number");
    }
}
