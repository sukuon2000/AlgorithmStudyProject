package level0;

import java.util.Arrays;

public class Array2D {

    public static void main(String[] args) {
        int[] num_list = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        System.out.println(Arrays.deepToString(solution(num_list, 3)));
    }

    private static int[][] solution(int[] num_list, int n) {

        int[][] answer = new int[num_list.length / n][n];

        int j=0;
        int k=0;
        for(int i=0; i<num_list.length; i++) {
            answer[j][k] = num_list[i];
            if(k < n-1) {
                k++;
                System.out.println(k);
            } else if (k == n-1) {
                k=0;
                j++;
            }
        }

        return answer;
    }
}
