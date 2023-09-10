import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
 * Bài toán HackerRank: Find the Running Median
 * https://www.hackerrank.com/challenges/find-the-running-median/problem?isFullScreen=true
 * */

public class RunningMedian {
    public static List<Double> runningMedian(List<Integer> arr) {
        int len = arr.size();
        Queue<Integer> maxQ = new PriorityQueue<>((len / 2) + 1, (a, b) -> {
            return -Integer.compare(a, b);
        });
        Queue<Integer> minQ = new PriorityQueue<>((len / 2) + 1, Comparator.comparingInt(a -> a));
        List<Double> res = new ArrayList<Double>();
        maxQ.add(arr.get(0));
        res.add((double) maxQ.element());
        for (int i = 1; i < len; i++) {
            int cur = arr.get(i);
            if (maxQ.size() - minQ.size() == 1) {
                if (maxQ.element() >= cur) {
                    minQ.add(maxQ.poll());
                    maxQ.add(cur);
                } else {
                    minQ.add(cur);
                }
                double median = (double) (maxQ.element() + minQ.element()) / 2;
                res.add(median);
            } else if (minQ.size() - maxQ.size() == 1) {
                if (minQ.element() >= cur) {
                    maxQ.add(cur);
                } else {
                    maxQ.add(minQ.poll());
                    minQ.add(cur);
                }
                double median = (double) (maxQ.element() + minQ.element()) / 2;
                res.add(median);
            } else {
                if (cur >= maxQ.element() && cur <= minQ.element()) {
                    maxQ.add(cur);
                } else if (cur < maxQ.element()) {
                    maxQ.add(cur);
                } else if (cur > minQ.element()) {
                    minQ.add(cur);
                }
                double median = (double) maxQ.size() > minQ.size() ? maxQ.element() : minQ.element();
                res.add(median);
            }
        }
        while (!maxQ.isEmpty()) {
            System.out.print(maxQ.remove() + " ");
        }
        System.out.println();
        while (!minQ.isEmpty()) {
            System.out.print(minQ.remove() + " ");
        }
        System.out.println();
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());

        String[] parse = br.readLine().split(" ");
        List<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < len; i++) {
            arr.add(Integer.parseInt(parse[i]));
        }

        List<Double> res = runningMedian(arr);
        for (double x : res) {
            System.out.printf("%.1f\n", x);
        }
    }
}
