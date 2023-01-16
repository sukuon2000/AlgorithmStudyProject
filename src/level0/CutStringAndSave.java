package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//잘라서 배열로 저장하기
public class CutStringAndSave {

    public static void main(String[] args) {
        String my_str = "abc1Addfggg4556b";
        int n = 6;
        System.out.println(Arrays.toString(solution(my_str, n)));
    }

    private static String[] solution(String my_str, int n) {
        String[] answer = new String[my_str.length()%n==0 ? my_str.length()/n :my_str.length()/n+1];
        for(int i=0;i<answer.length;i++){
            answer[i]=my_str.substring(i*n, Math.min((i + 1) * n, my_str.length()));
        }
        return answer;
    }
}
