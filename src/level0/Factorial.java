package level0;

public class Factorial {

    public static void main(String[] args) {
        int n = 3628800;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int i = 1;
        int m = 1;
        while (true) {
            m *= i;
            if(n > m) {
                i++;
            } else if(n < m) {
                i--;
                break;
            } else {
                break;
            }
        }
        return i;
    }
}
