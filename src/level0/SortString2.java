package level0;

import java.util.Arrays;

public class SortString2 {

    public static void main(String[] args) {
        String my_string = "Bcad";
        System.out.println(solution(my_string));
    }

    private static String solution(String my_string) {
        String[] arr = my_string.split("");

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++) {
            if(arr[i].charAt(0) < 97) {
                arr[i] = arr[i].toLowerCase();
            }
        }
        Arrays.sort(arr);

        for(String ele : arr) {
            sb.append(ele);
        }
        return sb.toString();
    }
}
