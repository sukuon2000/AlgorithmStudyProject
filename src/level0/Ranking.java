package level0;

import java.util.Arrays;

public class Ranking {

    public static void main(String[] args) {
        int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        System.out.println(Arrays.toString(solution(score)));
    }

    private static int[] solution(int[][] score) {
        int[] avg = new int[score.length];

        for(int i=0; i<score.length; i++) {
            avg[i] = score[i][0] + score[i][1];
        }

        int[] answer = new int[score.length];
        for(int i=0; i<score.length; i++) {
            int order = 1;
            for(int j=0; j<score.length; j++) {
                if(avg[i] < avg[j]) {
                    order++;
                }
            }
            answer[i] = order;
        }
        return answer;
    }
}
