package unnamed;
import org.testng.annotations.Test;

public class PrimeFactorsOfANumber {

    @Test
    public void findPrimeFactorsOfANumber() {
        int a = 37;

        //Start for loop from 2 as 2 i the first prime factor number
        for (int i = 2; i < a ; i++){
            //if number can be divided by i then it is a prime factor number
            while(a % i == 0) {
                System.out.println(i);
                a = a / i;  //check if number if further divided by i
            }
        }
        //print last prime factor number
        System.out.println(a);
    }

}
