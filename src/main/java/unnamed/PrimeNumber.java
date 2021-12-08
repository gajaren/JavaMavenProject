package unnamed;
public class PrimeNumber {

    public static void main(String[] args) {

        int num = 29;
        boolean isPrime = true;

        //prime number is divisible by 1 and by number himself
        for ( int i =2; i<num; i++) {
            if (num % i ==0) {
                isPrime = false;
                break;
            }
        }

        if(isPrime) System.out.println("It's prime number");
        else System.out.println("It's not a prime number");
    }
}
