package StreamPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfAllNumbers {
	
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,4,3};
		
		int sumOfNumbers = Arrays.stream(numbers)
			.sum();
		
		System.out.println(sumOfNumbers);
		
		//------------------------
		
		List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 4, 3);
		Optional<Integer> sum = listOfNumbers.stream()
			.reduce((a,b) -> a+b);
		System.out.println(sum.get());
	}

}
