package level0;

import java.math.BigInteger;

public class CalculateString {

    public static void main(String[] args) {
        String my_string = "100 - 104";
        System.out.println(solution(my_string));
    }

    private static int solution(String my_string) {
        String[] arr = my_string.split(" ");

        int value = Integer.parseInt(arr[0]);

        for(int i=1; i<arr.length; i+=2) {
            if(arr[i].equals("+")) {
                value += Integer.parseInt(arr[i+1]);
            } else {
                value -= Integer.parseInt(arr[i+1]);
            }
        }
        return value;
    }
}
