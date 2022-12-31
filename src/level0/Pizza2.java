package level0;

public class Pizza2 {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(solution(n));
    }

    private static int solution(int n) {
        int slice = 6;
        int answer = 1;
        while((slice*answer) % n !=0) {
            answer++;
        }
        return answer;
    }
}