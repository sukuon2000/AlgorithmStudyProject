package level0;

public class BacterialGrowth {

    public static void main(String[] args) {
        int n = 7;
        int t = 15;
        System.out.println(solution(n , t));
    }

    private static int solution(int n, int t) {
        int answer = 1;
        for(int i=1; i<=t; i++) {
            answer *= 2;
        }
        return n * answer;
    }
}
