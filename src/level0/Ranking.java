package level0;

import java.util.Arrays;

public class Ranking {

    public static void main(String[] args) {
        int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        System.out.println(Arrays.toString(solution(score)));
    }

    private static int[] solution(int[][] score) {
        double[] avg = new double[score.length];

        for(int i=0; i<score.length; i++) {
            avg[i] = (score[i][0] + score[i][1]) / 2;
        }
        return new int[1];
    }
}
