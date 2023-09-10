import java.util.HashMap;
import java.util.Map;

public class HashMapDriver {
    // Duyệt qua hash map
    public static void traverseHashMap() {
        Map<Integer, String> map = new HashMap<Integer, String>(); //Creating HashMap
        map.put(1, "Mango");  //Put elements in Map
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(4, "Grapes");

        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

    // Nếu cố store duplicate key thì sẽ thay thế old value bằng new value
    public static void noDuplicate() {
        HashMap<Integer, String> map = new HashMap<Integer, String>(); //Creating HashMap
        map.put(1, "Mango");  //Put elements in Map
        map.put(2, "Apple");
        map.put(3, "Banana");
        map.put(1, "Grapes"); //trying duplicate key

        System.out.println("Iterating Hashmap...");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

    /*
     * put(): nếu có duplicate key thì sẽ thay thế old value bằng new value
     * putIfAbsent(): nếu đã tồn tại key thì sẽ không put vào, nên không sẽ thay thế old value
     * putAll(Map another): đẩy tất cả các phần tử của another vào
     * */

    public static void putInMap() {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        System.out.println("Initial list of elements: " + hm);
        hm.put(100, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");

        System.out.println("After invoking put() method ");
        hm.forEach((key, value) -> System.out.println(key + " " + value));

        hm.putIfAbsent(103, "Gaurav");
        System.out.println("After invoking putIfAbsent() method ");
        hm.forEach((key, value) -> System.out.println(key + " " + value));

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(104, "Ravi");
        map.putAll(hm);
        System.out.println("After invoking putAll() method ");
        map.forEach((key, value) -> System.out.println(key + " " + value));
    }

    /*
     * Phương thức replace(key , newValue)
     * */
    public static void replaceKey() {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(100, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");
        System.out.println("Initial list of elements:");
        hm.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println("Updated list of elements:");
        hm.replace(102, "Gaurav");
        hm.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println("Updated list of elements:");
        hm.replace(101, "Vijay", "Ravi");
        hm.forEach((key, value) -> System.out.println(key + " " + value));

        System.out.println("Updated list of elements:");
        hm.replaceAll((k, v) -> "Ajay");
        hm.forEach((key, value) -> System.out.println(key + " " + value));
    }

    public static void main(String[] args) {

    }
}
