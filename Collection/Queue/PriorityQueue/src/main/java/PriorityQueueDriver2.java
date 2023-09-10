import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/*
* Bài HackerRank: Jesse and Cookies
* https://www.hackerrank.com/challenges/jesse-and-cookies/problem
* */

public class PriorityQueueDriver2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        Queue<Integer> arr = new PriorityQueue<>(n, Integer::compare);
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        while (arr.size() > 1) {
            int i = arr.remove();
            if (i >= k) break;
            count++;
            int j = arr.remove();
            int sweet = i + j * 2;
            arr.add(sweet);
        }
        int res = arr.remove();
        if (res >= k) {
            System.out.println(count);
        } else {
            System.out.println(-1);
        }
    }
}