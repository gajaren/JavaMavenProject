package unnamed;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamForEach {

    public static void main(String args[]) {
        List<String> names = Arrays.asList("Nilesh", "Deepak", "Saket");

        Consumer<List<String>> consumer = i -> System.out.println(i);
        //Calling interface method
        consumer.accept(names);

        //using Stream and lambda expression
        names.forEach(i -> System.out.println(i));
        //Lambda with method reference
        names.forEach(System.out::println);
    }
}
