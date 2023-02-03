package level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class IntegerSort {

    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(String s1 : arr) sb.append(s1);
        return Long.parseLong(sb.toString());
    }

    public long solutionStream(long n) {
        return Long.parseLong(String.valueOf(n).chars().mapToObj(ch -> (char) ch)
                .sorted(Comparator.reverseOrder())
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString());
    }
}
