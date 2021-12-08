package StringManipulation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveSpacesFromString {

    public static void main(String[] args) {
        String str = "      abc ||     45";

        //code to replace multiple spaces to single space
/*        String keepOnlyOneSpace = str.trim().replaceAll( "\\s{2,}", " ");
        System.out.println(keepOnlyOneSpace);
*/
        //Code to remove all spaces from String without using replace/replaceAll
/*        String removeSpace = "";
        for (int i = 0; i<=str.length()-1; i++) {
            if(str.charAt(i) != '\t' && str.charAt(i) != ' ') {
                removeSpace += str.charAt(i);
            }
        }

        System.out.println(removeSpace);
 */
        String[] removeSpace = Stream.of(str)
                .map( s -> s.replaceAll("\\s+", ""))
                .toArray(String[]::new);

        System.out.println(Arrays.toString(removeSpace));

    }
}
