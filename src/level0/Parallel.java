package level0;

import java.util.ArrayList;
import java.util.List;

// 평행
public class Parallel {

    public static void main(String[] args) {
        int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        System.out.println(solution(dots));
    }

    private static int solution(int[][] dots) {
        int answer = 0;

        List<Double> list = new ArrayList<>();
        for(int i=0; i<dots.length; i++) {
            for(int j=i+1; j<dots.length; j++) {
                double tmp = (double) (dots[i][1] - dots[j][1]) / (dots[i][0] - dots[j][0]);
                if(list.contains(tmp)) {answer++; break;}
                else {list.add(tmp);}
            }
            if(answer == 1) {break;}
        }
        return answer;
    }
}
