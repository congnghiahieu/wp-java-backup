import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * Bài HackerRank: Java Priority Queue
 * https://www.hackerrank.com/challenges/java-priority-queue/problem
 * */

public class PriorityQueueDriver1 {
    /*
     * Để dùng 1 Priority Queue thì ta cần 1 comparator để so sánh giữa các phần tử được push vào xem phần tử nào
     * được xếp vào vị trí thứ 1
     * Priorirty Queue có cơ chế hoạt động giống queue thì enqueue chèn vào cuối, dequeue remove phần tử đầu tiên
     * Nhưng do có priority được quyết định bởi comparator nên thứ tự các phần tử sẽ được sắp xếp theo thứ tự ưu tiên
     *
     * Khởi tạo 1 Priority Queue:
     * Queue <T> queue = new PriorityQueue(int size of queue, Comparator)
     * */
    private static class Student {
        private String name;
        private double gpa;
        private int id;

        public Student(String name, double gpa, int id) {
            this.name = name;
            this.gpa = gpa;
            this.id = id;
        }
    }

    private static class StudentComparator implements Comparator<PriorityQueueDriver1.Student> {
        @Override
        public int compare(PriorityQueueDriver1.Student o1, PriorityQueueDriver1.Student o2) {
            int res = -Double.compare(o1.gpa, o2.gpa);
            if (res == 0) {
                res = o1.name.compareTo(o2.name);
                if (res == 0) {
                    res = Integer.compare(o1.id, o2.id);
                }
            }
            return res;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(br.readLine());

        Queue<Student> que = new PriorityQueue<Student>(q, new StudentComparator());

        for (int i = 1; i <= q; i++) {
            String[] parse = br.readLine().split(" ");
            if (parse[0].equals("ENTER")) {
                String name = parse[1];
                double gpa = Double.parseDouble(parse[2]);
                int id = Integer.parseInt(parse[3]);
                que.add(new Student(name, gpa, id));
            } else {
                que.poll();
            }
        }
        if (que.isEmpty()) {
            System.out.println("EMPTY");
        }
        while (!que.isEmpty()) {
            Student notServed = que.poll();
            System.out.println(notServed.name);
        }
    }
}
