

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    public static void main(String[] args) {
        // Input string
        String text = "Visit mumbai later. after rain";

        //StringTokenizer object
        StringTokenizer tokenizer = new StringTokenizer(text, " ");
        System.out.println("Tokens:");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
