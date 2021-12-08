package StreamPrograms;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;


public class AverageOfAllNumbers {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,4,3};
		
		OptionalDouble averageNumbers = Arrays.stream(numbers)
			.average();
		
		System.out.println(averageNumbers.getAsDouble());
		
		//------------------------
		
		List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 4, 3);
		Optional<Integer> average = listOfNumbers.stream()
			.reduce((a,b) -> (a+b)/2);
		System.out.println(average.get());
		
		System.out.println(listOfNumbers.stream().mapToInt(e -> e).average().getAsDouble());
	}

}
