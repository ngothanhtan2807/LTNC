package week_5;

import java.util.StringTokenizer;

public class StringTokenizerSample2 {
    public static void main(String args[]) {
        StringTokenizer st = new StringTokenizer("Toi--ten-la---VietTut", "-");
        System.out.println("Tổng số token: " + st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
