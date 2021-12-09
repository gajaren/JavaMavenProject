package StreamPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquareAverageGreaterThan100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<>(Arrays.asList(1,23,4,5,79,100));
		
		//Take square
		//Number should be greater than 100
		//Find out average

		double result = numbers.stream()
			.map( e -> e*e )
			.filter(e -> e > 100)
			.mapToInt(e -> e)
			.average()
			.getAsDouble();
		
		System.out.println(result);
	}

}
