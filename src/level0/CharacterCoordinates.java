package level0;

import java.util.Arrays;

// 캐릭터의 좌표
public class CharacterCoordinates {

    public static void main(String[] args) {
        String[] keyinput = {"down", "down", "down", "down", "down"};
        int[] board = {7, 9};
        System.out.println(Arrays.toString(solution(keyinput, board)));
    }

    private static int[] solution(String[] keyinput, int[] board){
        int xLimit = (board[0] -1)/2;
        int yLimit = (board[1] -1)/2;

        int[] answer = {0,0};

        for(String ele : keyinput) {
            switch (ele) {
                case "left" :
                    answer[0]--;
                    if(answer[0] < -xLimit) {
                        answer[0] = -xLimit;
                    }
                    break;
                case "right" :
                    answer[0]++;
                    if(answer[0] > xLimit) {
                        answer[0] = xLimit;
                    }
                    break;
                case "up" :
                    answer[1]++;
                    if(answer[1] > yLimit) {
                        answer[1] = yLimit;
                    }
                    break;
                case "down" :
                    answer[1]--;
                    if(answer[1] < -yLimit) {
                        answer[1] = -yLimit;
                    }
                    break;
            }
        }

        return answer;
    }
}
