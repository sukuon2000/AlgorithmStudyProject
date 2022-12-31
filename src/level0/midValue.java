package level0;

import java.util.Arrays;

public class midValue {

    public static void main(String[] args) {
        int[] array = {1, 2, 7, 10, 11};
        System.out.println(solution(array));
    }

    public static int solution(int[] array) {
        Arrays.sort(array);
        int mid = array.length/2;
        return array[mid];
    }
}
