import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapIntroDriver {
    // Duyệt map bằng Map.Entry
    public static void traverseMap() {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Hieu");
        map.put(2, "Duc anh");
        map.put(3, "Huy");
        map.put(4, "Hai");
        // Duyệt cơ bản
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        // Duyệt bằng foreach và lambda expression
        map.forEach((key, value) -> System.out.println(key + " " + value));
        // Duyệt bằng stream, map() và foreach + method reference
        map.entrySet().stream().map(m -> m.getKey() + " " + m.getValue()).forEach(System.out::println);
    }

    // Java Map Example: comparingByKey()
    public static void compareByKey() {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        //Returns a Set view of the mappings contained in this map
        map.entrySet()
                //Returns a sequential Stream with this collection as its source
                .stream()
                //Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByKey())
                //Performs an action for each element of this stream
                .forEach(System.out::println);
    }

    // Java Map Example: comparingByKey() in Descending Order
    public static void compareByKeyReverse() {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        //Returns a Set view of the mappings contained in this map
        map.entrySet()
                //Returns a sequential Stream with this collection as its source
                .stream()
                //Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                //Performs an action for each element of this stream
                .forEach(System.out::println);
    }

    // Java Map Example: comparingByValue()
    public static void compareByValue() {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        //Returns a Set view of the mappings contained in this map
        map.entrySet()
                //Returns a sequential Stream with this collection as its source
                .stream()
                //Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByValue())
                //Performs an action for each element of this stream
                .forEach(System.out::println);
    }

    // Java Map Example: comparingByValue() in Descending Order
    public static void compareByValueReverse() {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");
        //Returns a Set view of the mappings contained in this map
        map.entrySet()
                //Returns a sequential Stream with this collection as its source
                .stream()
                //Sorted according to the provided Comparator
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                //Performs an action for each element of this stream
                .forEach(System.out::println);
    }


    public static void main(String[] args) {
        traverseMap();
    }
}
