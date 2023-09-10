import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDriver1 {
    /*
     * - LinkedHashSet vẫn giữ nguyên tính chất của HashSet
     * - Nhưng thứ tự sắp xếp của LinkedHashSet là theo thứ tự chèn vào của phần tử, không giống như HashSet thứ tự của
     * phần tử phải dựa vào hashcode
     * - Để giữ được thứ tự phần tử theo thứ tự chèn vào thì phải tốn bộ nhớ và xử lý CPU nên không khuyến khích dùng
     *  nếu không cần giữ nguyên thứ tự chèn vào
     * */

    // LHSet giữ nguyên thứ tự chèn vào
    public static void LHSetWithString() {
        Set<String> set = new LinkedHashSet<String>();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        System.out.println(set);
    }

    // Set remove phần tử
    public static void LHSetRemoveElements() {
        Set<String> set = new LinkedHashSet<String>();
        set.add("Java");
        set.add("T");
        set.add("Point");
        set.add("Good");
        set.add("Website");


        System.out.println("The hash set is: " + set);
        // Return true nếu remove thành công, false nếu không thành công
        System.out.println(set.remove("Good")); // true
        System.out.println("After removing the element, the hash set is: " + set);
        // returns false
        System.out.println(set.remove("For"));
    }

    public static void main(String[] args) {
        LHSetWithString();
        LHSetRemoveElements();
    }
}
