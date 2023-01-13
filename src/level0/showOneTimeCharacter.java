package level0;

import java.util.Arrays;

public class showOneTimeCharacter {

    public static void main(String[] args) {
        String s = "abcabcadc";
        System.out.println(solution(s));
    }

    private static String solution(String s) {
        int[] arr = new int[26];

        for(int i=0; i<s.length(); i++) {
            arr[s.charAt(i) - 97]++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 1) {
                sb.append((char) (i + 97));
            }
        }
        return sb.toString();
    }
}
