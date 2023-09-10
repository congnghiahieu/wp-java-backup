import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

/*
* Bài HackerRank: Balanced Brackets
* https://www.hackerrank.com/challenges/balanced-brackets/problem
* */

public class BracketBalanced {
    public static void main(String[] args) throws IOException {

    }

    public static void queries() throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(buf.readLine().trim());

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<Integer>());
            ArrayList<Integer> subArr = arr.get(i);

            String[] temp = buf.readLine().replaceAll("\\s+$", "").split(" ");

            int num = Integer.parseInt(temp[0]);

            for (int j = 1; j <= num; j++) {
                subArr.add(Integer.parseInt(temp[j]));
            }
        }

        int q = Integer.parseInt(buf.readLine().trim());
        for (int i = 1; i <= q; i++) {
            String[] temp = buf.readLine().replaceAll("\\s+$", "").split(" ");

            int x = Integer.parseInt(temp[0]) - 1;
            int y = Integer.parseInt(temp[1]) - 1;

            if (x >= 0 && x <= arr.size() - 1) {
                ArrayList<Integer> subArr = arr.get(x);
                if (!subArr.isEmpty()) {
                    if (y >= 0 && y <= subArr.size() - 1) {
                        System.out.println(subArr.get(y));
                    } else {
                        System.out.println("ERROR!");
                    }
                } else {
                    System.out.println("ERROR!");
                }
            } else {
                System.out.println("ERROR!");
            }
        }
    }

    public static String isBalanced(String s) {
        // Write your code here
        Stack<Character> opers = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == '{' || cur == '(' || cur == '[') opers.push(cur);
            if (cur == '}' || cur == ')' || cur == ']') {
                if (!opers.isEmpty()) {
                    char rev = opers.pop();
                    boolean check = false;
                    if (rev == '{' && cur == '}') check = true;
                    if (rev == '(' && cur == ')') check = true;
                    if (rev == '[' && cur == ']') check = true;
                    if (!check) return "NO";
                } else {
                    return "NO";
                }
            }
        }
        if (opers.isEmpty()) return "YES";
        else return "NO";
    }
}