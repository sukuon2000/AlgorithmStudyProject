package level0;

public class Marble {

    public static void main(String[] args) {
        int balls = 3;
        int share = 2;
        System.out.println(solution(balls, share));
    }

    private static int solution(int balls, int share) {
        return combination(balls, share);
    }

    private static int combination(int n, int m) {
        if(m == 0 || n == m) {
            return 1;
        } else {
            return combination(n-1, m-1) + combination(n-1, m);
        }
    }
}
