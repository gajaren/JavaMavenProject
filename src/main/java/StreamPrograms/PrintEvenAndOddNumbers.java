package StreamPrograms;

import java.util.Arrays;
import java.util.List;

public class PrintEvenAndOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(2, 22, 222, 234, 456, 342, 277);
		
		System.out.println("Even numbers are: ");
		numbers.stream()
			.filter(e -> e%2==0)
			.forEach(System.out::println);
		
		System.out.println("Odd numbers are: ");
		numbers.stream()
			.filter(e -> e%2!=0)
			.forEach(System.out::println);
	}

}
