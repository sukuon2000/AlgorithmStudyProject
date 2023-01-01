package level0;

public class orderedPair {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int a = 1;
        int b = 0;
        int answer = 0;

        for(int i = 1; i<=n; i++) {
            b = (n / a);
            if((a * b) == n) {
                answer++;
            }
            a++;
        }

        return answer;
    }
}
