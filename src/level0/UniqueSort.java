package level0;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 특이한 정렬
public class UniqueSort {

    public static void main(String[] args) {
        int[] numlist = {10000,20,36,47,40,6,10,7000};
        int n = 30;
        System.out.println(Arrays.toString(solution(numlist, n)));
    }

    private static int[] solution(int[] numlist, int n) {
        Arrays.sort(numlist);

        List<Integer> list = new ArrayList<>();

        for(int num : numlist) {list.add(num);}

        list.sort((s1, s2) -> Integer.compare(Math.abs(s2 - n), Math.abs(s1 - n)));

        Collections.reverse(list);

        return list.stream().mapToInt(a1 -> a1).toArray();
    }
}
