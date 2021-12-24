package StreamPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitSkip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		List<Integer> firstThree = numbers.stream()
				.limit(3)
				.collect(Collectors.toList());

		
		System.out.println(firstThree);
		
		List<Integer> lastThree = numbers.stream()
				.skip(numbers.size() - 3)
				.collect(Collectors.toList());

		
		System.out.println(lastThree);
	}

}
