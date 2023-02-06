package level1;

import java.util.Arrays;
import java.util.Collections;

public class DescendingString {

    public String solution(String s) {
        String[] arr = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
