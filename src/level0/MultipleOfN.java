package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultipleOfN {

    public static void main(String[] args) {
        int n = 3;
        int[] numList = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(Arrays.toString(solution(n, numList)));
    }

    private static int[] solution(int n, int[] numList) {
        List<Integer> list = new ArrayList<>();

        for(int ele : numList) {
            if(ele % n == 0) {
                list.add(ele);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
