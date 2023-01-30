package level1;

public class SumDigit {

    public static void main(String[] args) {
        SumDigit sumDigit = new SumDigit();
        int n = 123;
        System.out.println(sumDigit.solution(n));
    }

    public int solution(int n) {
        String s = Integer.toString(n);
        int sum = 0;
        for(int i=0; i<s.length(); i++) {
            sum += Integer.parseInt(s.substring(i, i+1));
        }
        return sum;
    }
}
