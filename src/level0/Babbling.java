package level0;

import java.util.Arrays;

public class Babbling {

    public static void main(String[] args) {
        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
        System.out.println(solution(babbling));
    }

    private static int solution(String[] babbling) {
        String[] arr = {"aya", "ye", "woo", "ma"};

        int count = 0;
        for(String s : babbling) {
            String repl = s;
            for(String s2 : arr) {
                repl = repl.replaceAll(s2, "0");
            }
            repl = repl.replaceAll("0", "");
            if(repl.equals("")) {
                count++;
            }
        }
        return count;
    }
}
