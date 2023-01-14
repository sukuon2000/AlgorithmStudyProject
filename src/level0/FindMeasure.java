package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class FindMeasure {

    public static void main(String[] args) {
        int n = 24;
        System.out.println(Arrays.toString(solution2(n)));
    }

    private static int[] solution(int n) {
        int sqrt = (int) Math.sqrt(n);
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1; i<=sqrt; i++) {
            if(n % i == 0) {
                list.add(i);
                if(n / i != 0) {
                    list.add(n / i);
                }
            }
        }
        list.sort(Comparator.naturalOrder());
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    private static int[] solution2(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        if(n != 1) {
            list.add(n);
        }
        for(int i=2; i<=n/2; i++) {
            if(n % i == 0) {
                list.add(i);
            }
        }
        list.sort(Comparator.naturalOrder());
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
