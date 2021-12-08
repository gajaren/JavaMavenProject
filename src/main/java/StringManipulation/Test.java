package StringManipulation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        String[] stringArray = {"Saket", "Naina", "Kiran", "Saleem", "Si"};

        List<String> newStringArray = Arrays.stream(stringArray)
                .filter(a -> a.startsWith("S"))
                .filter(a -> a.length()>3)
                .collect(Collectors.toList());

        System.out.println(newStringArray);
    }
}
