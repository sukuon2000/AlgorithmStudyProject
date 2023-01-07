package level0;

import java.util.Arrays;

public class RotationArray {

    public static void main(String[] args) {
        int[] numbers = {4, 455, 6, 4, -1, 45, 6};
        System.out.println(Arrays.toString(solution(numbers, "left")));
    }

    private static int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];

        switch (direction) {
            case "right" :
                for(int i=0; i<numbers.length; i++) {
                    if(i != numbers.length - 1) {
                        answer[i+1] = numbers[i];
                    } else {
                        answer[0] = numbers[i];
                    }
                };
                break;
            case "left" :
                for(int i=0; i<numbers.length; i++) {
                    if(i != 0) {
                        answer[i-1] = numbers[i];
                    } else {
                        answer[answer.length - 1] = numbers[i];
                    }
                };
                break;
        }
        return answer;
    }

}
