package level0;

import java.util.Arrays;

public class SortString {

    public static void main(String[] args) {
        String my_string = "hi12392";
        System.out.println(Arrays.toString(solution(my_string)));
    }

    private static int[] solution(String my_string) {
        String match = "[^0-9]";
        my_string = my_string.replaceAll(match, "");

        String[] arr = my_string.split("");
        Arrays.sort(arr);

        int[] intArr = new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }
        return intArr;
    }
}
