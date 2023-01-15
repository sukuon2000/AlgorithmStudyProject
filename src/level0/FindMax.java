package level0;

import java.util.Arrays;

public class FindMax {

    public static void main(String[] args) {
        int[] array = {1, 8, 3};
        System.out.println(Arrays.toString(solution(array)));
    }

    private static int[] solution(int[] array) {
        int[] result = new int[2];

        for(int i=0; i<array.length; i++){
            if(array[i] > result[0]) {
                result[0] = array[i];
                result[1] = i;
            }
        }
        return result;
    }
}
