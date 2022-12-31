package level0;

import java.util.Arrays;

public class triangle1 {

    public static void main(String[] args) {
        int[] sides = {199, 72, 222};
        System.out.println(solution(sides));
    }

    private static int solution(int[] sides) {
        Arrays.sort(sides);
        if(sides[2] >= sides[0] + sides[1]) {
            return 2;
        } else {
            return 1;
        }
    }
}
