package level1;

import java.util.Arrays;

public class NaturalNumberArray {

    public static void main(String[] args) {
        NaturalNumberArray naturalNumberArray = new NaturalNumberArray();
        int n = 12345;
        System.out.println(Arrays.toString(naturalNumberArray.solution(n)));
    }

    public int[] solution(long n) {
        String s = Long.toString(n);
        int[] arr = new int[s.length()];
        int j = 0;
        for(int i=s.length() - 1; i>=0; i--) {
            arr[j] = Integer.parseInt(s.substring(i, i+1));
            j++;
        }
        return arr;
    }
}
