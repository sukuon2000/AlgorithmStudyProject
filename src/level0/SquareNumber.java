package level0;

public class SquareNumber {

    public static void main(String[] args) {
        int n = 144;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        double x = Math.sqrt(n);
        int answer = 2;
        if(x == (int) x) {
            answer = 1;
        }
        return answer;
    }
}
