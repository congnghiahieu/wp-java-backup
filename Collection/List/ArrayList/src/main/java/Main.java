import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    /*
     * Phân biệt Mảng (Array) và List (Danh sách)
     *
     * (Mảng Array là kiểu: double[] arr = new double[1000] hoặc Student[] arr = new Student[1000])
     * (Còn List chỉ là interface, List có 3 lớp con là ArrayList, Vector (ArrayList và Vector là List được cài đặt
     * bằng Array - Mảng) và LinkedList (Là List được cài đặt bằng Node liên kết))
     *
     * Để đánh giá 1 kiểu cấu trúc dữ liệu, ta cần xét đến 4 tiêu chí:
     * 1. Access
     * 2. Update
     * 3. Insert
     * 4. Remove
     *
     * Ở đây ta chỉ so sánh 4 tiêu chí trên giữa Array và List (interface) (ta cũng sẽ tiếp tục xét
     * 4 tiêu chí trên giữa 3 lớp ArrayList, Vector vả LinkedList sau)
     *
     * 1. Array phải khai báo số lượng phần tử của Array, số lượng phần tử của Array là fix cứng.
     * List có thể thêm bớt số lượng phần tử linh hoạt
     * 2. Cú pháp khai báo Array:
     *   double[] arr = new double[100] hoặc Student[] arr = new Student[1000]
     * 3. Cú pháp khai báo sử dụng List, cụ thể là tạo 1 đối tượng ArrayList
     * ArrayList<Integer> arr = new ArrayList<Integer>()
     * 4. Array có khả năng access và update 1 phần tử rất nhanh nhờ index,
     * nhưng Array không cung cấp method để có thể insert và remove 1 phần tử, muốn insert hay remove thì phải tự
     * viết method
     * 5. List (Danh sách) (interface) có cung cấp các method cho các lớp con kế thừa (ArrayList,
     * Vector, LinkedList) để tương tác
     * VD: với ArrayList<Integer> có những method
     * add(int element): chèn 1 số nguyên vào cuối danh sách
     * add(int index, int element): chèn 1 số nguyên vào vị trí index
     * get(int index): lấy ra phần tử
     * remove(int index): xóa phần tử có vị trí index
     * isEmpty(): kiểm tra xem có rỗng không, trả về true hoặc false
     * clear() : clear tất cả các element
     * size(): lấy số phần tử
     *
     * */

    /*
     * Thử nghiệm về cấu trúc dữ liệu Danh sách giữa ArrayList và LinkedList:
     * (Cơ chế giữa ArrayList và LinkedList khác nhau hoàn toàn nên đem ra so sánh. Còn cơ chế giữa ArrayList và Vector
     * gần như là giống nhau, vẫn có điểm khác nhau về: cách thêm bớt dữ liệu,...)
     *
     * Bài toán: tạo 1 mảng ngược từ N đến 1, có đo thời gian thực thi
     * TH1: Thêm các phần tử vào ArrayList bằng cách lần lượt chèn các phần tử từ N về 1 vào cuối mảng
     * TH2: Thêm các phần tử vào ArrayList bằng cách lần lượt chèn các phần tử từ 1 đến N vào đầu mảng
     *
     * ==> Kết luận: ArrayList (Vector) chạy ngậm bên dưới các method của nó là cơ chế của Array (insert, remove)
     * Còn LinkedList chạy theo cơ chế các Node (Node có chứa 1 value và 1 tham chiếu hay 1 con trỏ tới Node next)
     * Xét về 4 tiêu chí: ArrayList (Vector) theo cơ chế của Array nên access và update nhanh hơn
     * linkedList theo cơ chế các Node nên access và update chậm hơn nhưng insert và remove lại nhanh hơn
     *
     * */

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int N = 1_000; // Thử các giá trị N từ 10, 10^3, 10^4, 10^5, 10^6, 10^7
        ArrayList<Integer> list = new ArrayList<Integer>();
//        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i = N; i >= 1;i--) {
            list.add(i);
        }

        /*for (int i = 1; i <= N; i++) {
            list.add(0,i);
        }*/

        System.out.println("Thoi gian chay: " + (System.currentTimeMillis() - startTime) + " mili giay");
        System.out.println("So dau: " + list.get(0) + "; So cuoi: " + list.get(list.size() - 1));

    }
}
