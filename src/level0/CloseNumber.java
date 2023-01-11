package level0;

import java.util.Arrays;

// 가까운 수
public class CloseNumber {

    public static void main(String[] args) {
        int[] array = {3, 10, 28};
        int n = 20;
        System.out.println(solution(array, n));
    }

    private static int solution(int[] array, int n) {
        int[] arr = new int[array.length + 1];

        for(int i=0; i<array.length; i++) {
            arr[i] = array[i];
        }
        arr[array.length] = n;

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int index = Arrays.binarySearch(arr, n);

        if(index == 0) {
            return arr[1];
        } else if(index == arr.length - 1) {
            return arr[arr.length - 2];
        } else {
            int sub1 = arr[index] - arr[index - 1];
            int sub2 = arr[index + 1] - arr[index];
            if(sub1 <= sub2) {
                return arr[index -1];
            } else {
                return arr[index + 1];
            }
        }
    }
}
