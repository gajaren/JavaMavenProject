package unnamed;
import java.util.Arrays;
import java.util.Comparator;

public class PrintSecondLargestWordFromGivenString {
	
	public static void main(String args[]) {
		String a = "I love my country";
		
		String[] words = a.split(" ");
//		Arrays.sort(words, new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.length() - o2.length();
//			}
//		
//			
//		});
		
		Arrays.sort(words, (o1, o2) -> o1.length()-o2.length());
		
		System.out.println(Arrays.toString(words));
		System.out.println(words[words.length - 2]);
	}

}
