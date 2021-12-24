package StreamPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighestLowestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = Arrays.asList(10,298,33,40,5,6,7,80,9);
		
		int secondHighest = numbers.stream()
				.sorted(Collections.reverseOrder())
				.distinct()
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println(secondHighest);
		
		int secondLowest = numbers.stream()
				.sorted()
				.distinct()
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println(secondLowest);
	}

}
