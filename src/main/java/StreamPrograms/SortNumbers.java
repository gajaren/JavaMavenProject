package StreamPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,2,34,5,5,7,3,5,8,9,0));
		
		List<Integer> ascNumbers = numbers.stream()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(ascNumbers);
		
		List<Integer> descNumbers = numbers.stream()
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		
		System.out.println(descNumbers);
	}

}
