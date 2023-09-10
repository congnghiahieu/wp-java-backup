import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDriver {
    /*
     * - TreeSet được cài đặt theo cấu trúc dữ liệu dạng cây nhị phân
     * - TreeSet luôn được sắp xếp theo thứ tự
     * - TreeSet chỉ chấp nhận các kiểu đối tượng có implements Comparable interface hoặc Comparator
     * - Với các Object implements Comparable hoặc Comparator thì khi biên dịch không có lỗi, chỉ khi runtime sẽ throw
     * ClassCastException
     * */

    // TreeSet với String
    public static void treeSetWithString() {
        Set<String> set = new TreeSet<String>();
        set.add("Hieu");
        set.add("Hiep");
        set.add("Hao");
        set.add("Anh");
        set.add("Cuong");
        set.add("Binh");
        System.out.println(set);
    }

    // Trả về 1 set mới theo chiều duyệt ngược lại
    public static void treeSetReverse() {
        TreeSet<String> tree = new TreeSet<String>();
        tree.add("Hieu");
        tree.add("Hiep");
        tree.add("Hao");
        tree.add("Anh");
        tree.add("Cuong");
        tree.add("Binh");
        System.out.println("Before reverse");
        System.out.println(tree);
        System.out.println("Lowest Value: " + tree.pollFirst()); // remove và lấy ra phần tử đầu
        System.out.println("Highest Value: " + tree.pollLast()); // remove vàlấy ra phần tử cuối
        System.out.println("After poll");
        System.out.println(tree);
        System.out.println("After reverse");
        NavigableSet<String> reverseSet = tree.descendingSet();
        System.out.println(reverseSet);
        System.out.println("Lowest Value: " + reverseSet.pollFirst()); // remove và lấy ra phần tử đầu
        System.out.println("Highest Value: " + reverseSet.pollLast()); // remove và lấy ra phần tử cuối
        System.out.println("After poll");
        System.out.println(reverseSet);
    }

    // Subtree
    public static void subTreeSet() {
        TreeSet<String> set = new TreeSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");

        System.out.println("Intial Set: " + set);

        System.out.println("Head Set: " + set.headSet("C", true));

        System.out.println("SubSet: " + set.subSet("A", true, "E", false));

        System.out.println("TailSet: " + set.tailSet("C", true));
    }

    public static void main(String[] args) {
        treeSetWithString();
        treeSetReverse();
        subTreeSet();
    }
}
