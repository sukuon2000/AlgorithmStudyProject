package level0;

// 저주의 숫자 3
public class NumberOfCurses3 {

    public static void main(String[] args) {
        int n = 15;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            answer++;
            while (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                answer++;
            }
        }
        return answer;
    }
}
