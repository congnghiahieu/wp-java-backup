import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*
* Bài HackerRank: Simple Text Editor
* https://www.hackerrank.com/challenges/simple-text-editor/problem
* */

public class TextEditor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder display = new StringBuilder();
        /*
         * 2 stacks
         * */
        Stack<Integer> undoType = new Stack<Integer>();
        Stack<String> undoContent = new Stack<String>();

        int q = Integer.parseInt(br.readLine());

        for (int i = 1; i <= q; i++) {
            String[] parse = br.readLine().split(" ");

            int action = Integer.parseInt(parse[0]);

            switch (action) {
                case 1 -> {
                    // Handle add
                    display.append(parse[1]);
                    // Handle undo
                    undoType.push(action);
                    undoContent.push(Integer.toString(parse[1].length()));
                }
                case 2 -> {
                    // Handle undo
                    int start = display.length() - Integer.parseInt(parse[1]);
                    int end = display.length();
                    undoType.push(action);
                    undoContent.push(display.substring(start, end));
                    // Handle delete
                    display.delete(start, end);
                }
                case 3 -> System.out.println(display.charAt(Integer.parseInt(parse[1]) - 1));
                case 4 -> {
                    String undo = undoContent.pop();
                    if (undoType.pop() == 1) {
                        display.delete(display.length() - Integer.parseInt(undo), display.length());
                    } else {
                        display.append(undo);
                    }
                }
            }
        }
    }
}
