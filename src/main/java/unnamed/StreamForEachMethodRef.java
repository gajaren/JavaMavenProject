package unnamed;
import java.util.Arrays;
import java.util.List;

public class StreamForEachMethodRef {

    public static void main(String args[]) {
        List<String> names = Arrays.asList("Nilesh", "Deepak", "Saket");

        //Use method signature as of Consumer interface method
        names.forEach(StreamForEachMethodRef::printNames);
    }

    public static void printNames(String name) {
        System.out.println(name);
    }
}
