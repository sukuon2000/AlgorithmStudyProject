package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// 소인수분해
public class Factorization {

    public static void main(String[] args) {
        int n = 420;
        System.out.println(Arrays.toString(solution(n)));
    }

    private static int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=2; i<=n; i++) {
            if(n % i == 0) {
                while(n % i == 0) {
                    n /= i;
                }
                list.add(i);
            }
            if(n == 1) {
                break;
            }
        }

        int[] arr = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
