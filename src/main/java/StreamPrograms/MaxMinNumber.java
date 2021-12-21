package StreamPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,2,34,5,5,7,3,5,8,9,0));
		
		int max = numbers.stream()
							.max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(max);
		
		int min = numbers.stream()
							.min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println(min);
	}

}
