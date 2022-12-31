package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class dontLikeEven {

    public static void main(String[] args) {
        int n = 10;
        System.out.println(Arrays.toString(solution(n)));
    }

    private static int[] solution(int n) {
        int[] answer = new int[(n+1)/2];
        int index = 0;
        for(int i=1; i<=n; i++) {
            if((i%2) == 1) {
                answer[index] = i;
                index++;
            }
        }
        return answer;
    }

    private static int[] solution2(int n) {
        return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
    }
}
