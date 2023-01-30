package level1;

import java.util.Arrays;

public class FindAverage {

    public static void main(String[] args) {
        FindAverage findAverage = new FindAverage();
        int[] arr = {1,2,3,4};
        System.out.println(findAverage.solution(arr));
    }

    public double solution(int[] arr) {
        return (double) Arrays.stream(arr).sum() / arr.length;
    }
}
