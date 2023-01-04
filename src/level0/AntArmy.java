package level0;

public class AntArmy {
    public static void main(String[] args) {
        int hp = 24;
        System.out.println(solution(hp));
        System.out.println(solution2(hp));
    }

    private static int solution(int hp) {
        int answer = 0;
        int count = 0;
        if(hp >= 5) {
            count = hp / 5;
            answer += count;
            hp %= 5;
        }
        if(hp >= 3) {
            count = hp / 3;
            answer += count;
            hp %= 3;
        }
        if (hp > 0 && hp < 3) {
            count = hp;
            answer += count;
        }

        return answer;
    }

    private static int solution2(int hp) {
        int answer = hp / 5;
        hp %= 5;

        answer += hp / 3;
        hp %= 3;

        answer += hp;

        return answer;
    }
}
