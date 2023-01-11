package level0;

public class Game369 {

    public static void main(String[] args) {
        int order = 29423;
        System.out.println(solution(order));
    }

    private static int solution(int order) {
        int answer = 0;

        while(order != 0) {
            int value = order % 10;
            order /= 10;

            if(value == 3 || value == 6 || value == 9) {
                answer++;
            }
        }
        return answer;
    }
}
