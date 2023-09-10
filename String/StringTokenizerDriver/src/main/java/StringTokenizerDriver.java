import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StringTokenizerDriver {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Basic usage and traverse stringtokenizer
        StringTokenizer stk = new StringTokenizer(br.readLine(), ",");
        // "hi, my name, is cong nghia hieu"
        System.out.println(stk.countTokens());
        while (stk.hasMoreTokens()) {
            System.out.println(stk.nextToken().trim());
        }
    }
}
