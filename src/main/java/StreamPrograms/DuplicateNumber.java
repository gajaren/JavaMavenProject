package StreamPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,2,34,5,5,7,3,5,8,9,0));

		Set<Integer> duplicate = new HashSet<>();	
		numbers.stream()
				.filter(e -> !duplicate.add(e))
				.collect(Collectors.toSet())
				.forEach(System.out::println);
	}

}
