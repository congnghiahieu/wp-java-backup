import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetDriver1 {
     /*
     - HashSet lưu trữ các elements theo cơ chế hashing (dựa theo hashcode)
     - HashSet là cách tiếp cận tốt nhất cho việc tìm kiếm phần tử
     - HashSet không duy trì thứ tự được chèn vào của các phần tử, nó sẽ sắp xếp theo thứ tự hashcode của từng phần tử
     (xem ví dụ hashSetWithString())
     - Khi sử dụng HashSet (LinkedHashSet, HashMap, LinkedHashMap) cho Object tự viết nên cài đặt 2 hàm hashcode và
     equals
     - Để so sánh 2 đối tượng (tự định nghĩa) xem chúng có bằng nhau hay không: đầu tiên sẽ gọi hashcode() xem có
     bằng nhau không (2 đối tượng bằng nhau chắc chắn hashcode bằng nhau, nhưng 2 đối tượng khác nhau cũng có thể cho
      hashcode bằng nhau) sau đó sẽ gọi đến equals() để kiểm tra có bằng nhau hay không
     - Có thể remove duplicates 1 list bằng cách cài đặt hàm hashcode và equals cho Object, rồi rải list đó vào set mới
     */


    // HashSet đối với các kiểu Object có sẵn
    public static void hashSetWithString() {
        HashSet<String> set = new HashSet<String>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        System.out.println(set);
    }

    // Remove duplicates đối với Object tự định nghĩa (cần cài đặt hashcode và equals)
    public static void hashSetRemoveDuplicates() {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("001", "Hieu", 1));
        list.add(new Student("002", "Hieu", 1));
        list.add(new Student("003", "Hieu", 1));
        list.add(new Student("001", "Hieu", 1));
        HashSet<Student> set = new HashSet<Student>(list);
        System.out.println(set);
    }

    public static void main(String[] args) {
        hashSetWithString();
        hashSetRemoveDuplicates();
    }
}
