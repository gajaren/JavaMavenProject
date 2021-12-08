package unnamed;
import java.util.*;
import java.util.stream.Collectors;

public class SortByMapValues {

    public static void main(String[] args) {

        // 1. Create a list of Map
        // 2. Use Collections.sort() using custom Comparator
        // 3. print list of map
        Map<Integer, String> student = new HashMap<>();

        student.put(1, "Nilesh");
        student.put(2, "Saket");
        student.put(3, "Deepak");

//        for (Map.Entry<Integer, String> entry: student.entrySet()) {
//            System.out.println(entry.getKey() + " -> " + entry.getValue());
//        }
//
//        List<Map.Entry<Integer,String>> maplist = new LinkedList<>(student.entrySet());
//
//        Collections.sort(maplist, new Comparator<Map.Entry<Integer, String>>() {
//
//            @Override
//            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
//                return o1.getValue().compareTo(o2.getValue());
//            }
//        });
//
//        Collections.sort(maplist, (o1, o2) -> -o1.getValue().compareTo(o2.getValue()));
//        Collections.sort(maplist, Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()));
//        Collections.sort(maplist, Map.Entry.comparingByValue(Comparator.reverseOrder()));
//
//        for (Map.Entry<Integer, String> entry: maplist) {
//            System.out.println(entry.getKey() + " -> " + entry.getValue());
//        }

        //Using Stream
//        HashMap<Integer,String> sortedValueMap =
//        student.entrySet()
//                .stream()
//                .sorted(((o1, o2) -> o1.getValue().compareTo(o2.getValue())))
//                .collect(Collectors.toMap(Map.Entry::getKey,
//                        Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
//
//        sortedValueMap.entrySet().forEach(System.out::println);

        //Using alternate way of stream
        HashMap<Integer, String> sortedValueMap = new LinkedHashMap<>();

        student.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sortedValueMap.put(x.getKey(), x.getValue()));

        sortedValueMap.entrySet().forEach(System.out::println);
    }
}
