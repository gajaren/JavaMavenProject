package StringManipulation;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitString {

    @Test
    public void splitStringUsingStringMethod() {
        String a = "This is Nilesh Gajare";

        String[] splitArray = a.split(" ");
        Arrays.stream(splitArray).forEach(System.out::println);
    }

    @Test
    public void splitUsingStringTokenizer() {
        String a = "This is Nilesh Gajare";
        StringTokenizer stringTokenizer = new StringTokenizer(a, "s-");

        List<String> splitStrings = new ArrayList<>();
        while (stringTokenizer.hasMoreTokens()) {
            splitStrings.add(stringTokenizer.nextToken());
        }

        splitStrings.forEach(System.out::println);
    }

    @Test
    public void splitStringUsingRegex() {
        String a = "This is Nilesh Gajare";

        String[] splitArray = a.split("[A-Z]");
        Arrays.stream(splitArray).forEach(System.out::println);
    }

    @Test
    public void splitNumberAndAlphabets() {
        String a = "123abdf45jk4j567";
        Pattern pattern = Pattern.compile("(\\d+)|([A-Za-z]+)");
        Matcher matcher = pattern.matcher(a);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    @Test
    public void separateAplhabetsNumbersUsingCharacterClass() {
        String a = "123abdf45-jk4*j567";

        //Use of StringBuilder as single string will able to mutate across for loop
        StringBuilder alpha = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        StringBuilder special = new StringBuilder();

        for (int i = 0; i<a.length() - 1; i++ ) {
            if (Character.isAlphabetic(a.charAt(i))) {
                alpha.append(a.charAt(i));
            } else if (Character.isDigit(a.charAt(i))) {
                numbers.append(a.charAt(i));
            } else {
                special.append(a.charAt(i));
            }
        }

        System.out.println(alpha);
        System.out.println(numbers);
        System.out.println(special);
    }
}
