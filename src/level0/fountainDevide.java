package level0;

public class fountainDevide {
    public static void main(String[] args) {

        System.out.println(solution(1,2,3,4)[0]);
        System.out.println(solution(1,2,3,4)[1]);
    }

    private static int[] solution(int denum1, int num1, int denum2, int num2) {
        int num = num1 * num2;
        int denum = (denum1 * num2) + (denum2 * num1);

        int min = Math.min(num, denum);
        int max = 1;

        for(int i =1; i<=min; i++) {
            if((denum%i)== 0 && (num%i)==0) {
                max = i;
            }
        }
        num /= max;
        denum /= max;

        int[] answer = {denum, num};
        return answer;
    }
}