package level0;

import java.util.Arrays;

public class OXQuiz {

    public static void main(String[] args) {
        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
        System.out.println(Arrays.toString(solution(quiz)));
    }

    private static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for(int i=0; i<quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[2]);

            int value = 0;
            if(arr[1].equals("+")) {
                value = a + b;
            } else {
                value = a - b;
            }

            if(value == Integer.parseInt(arr[4])) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }
        return answer;
    }
}
