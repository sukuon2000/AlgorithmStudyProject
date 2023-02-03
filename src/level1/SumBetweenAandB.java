package level1;

// 두 정수 사이의 합
public class SumBetweenAandB {

    public static void main(String[] args) {
        SumBetweenAandB sumBetweenAandB = new SumBetweenAandB();
        System.out.println(sumBetweenAandB.solution2(3, 5));
    }

    public long solution(int a, int b) {
        long sum = 0;
        if(a > b) {
            for(int i=b; i<=a; i++) {
                sum += i;
            }
        } else {
            for(int i=a; i<=b; i++) {
                sum += i;
            }
        }
        return sum;
    }

    //등차수열
    public long solution2(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int n = max - min + 1;

        return n * ( (2L * min) + (n - 1) ) / 2;
    }
}
