package level0;

import java.util.Arrays;

// 연속된 수의 합
public class PlusConsecutiveNumber {

    public static void main(String[] args) {
        PlusConsecutiveNumber plusConsecutiveNumber = new PlusConsecutiveNumber();
        System.out.println(Arrays.toString(plusConsecutiveNumber.solution(4, 14)));
    }

    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int sum = (num * (num + 1))/2;
        int d = (total - sum) / num;

        for(int i=0; i<num; i++) {
            answer[i] = (i + 1) + d;
        }
        return answer;
    }
}
