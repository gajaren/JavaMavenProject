package StreamPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartingWithTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(2, 22, 222, 234, 456, 342, 277);
		
		List<Integer> numbersStartingWithTwo = numbers.stream()
														.map(e -> String.valueOf(e)) //Convert integer to string
														.filter(e -> e.startsWith("2"))
														.map(e -> Integer.parseInt(e)) //convert string to integer
														.collect(Collectors.toList());
		System.out.println(numbersStartingWithTwo);

	}

}
