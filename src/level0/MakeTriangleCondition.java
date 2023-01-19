package level0;

import java.util.Arrays;
import java.util.OptionalInt;

// 삼각형의 완성조건 (2)
public class MakeTriangleCondition {

    public static void main(String[] args) {
        int[] sides = {11, 7};
        // 11이 가장 길때 : 5, 6, 7, 8, 9, 10, 11 (7)
        //                  Max - Min < c < Min
        // c가 가장 길때 : 12, 13, 14, 15, 16, 17 (6)
        // 총 가능한 숫자들 : 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 (13)
        //                  Max < c < Max + Min

        System.out.println(solution(sides));
    }

    private static int solution(int[] sides) {
        int big = Math.max(sides[0], sides[1]);
        int small = Math.min(sides[0], sides[1]);

        int low = big - small;
        int high = big + small - 1;

        return high - low;
    }
}
