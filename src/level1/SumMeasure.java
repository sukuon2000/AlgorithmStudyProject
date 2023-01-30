package level1;

public class SumMeasure {

    public static void main(String[] args) {
        SumMeasure sumMeasure = new SumMeasure();
        int n = 12;
        System.out.println(sumMeasure.solution(n));
    }

    public int solution(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {
            if(n % i == 0) sum += n / i;
        }
        return sum;
    }
}
