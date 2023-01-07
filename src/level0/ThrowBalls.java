package level0;

public class ThrowBalls {

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3};
        System.out.println(solution(numbers, 5));
    }

    private static int solution(int[] numbers, int k) {
        int size = numbers.length;
        int m = (2*k) - 1;

        while(size < m) {
            size += numbers.length;
        }
        return numbers.length - (size - m);
    }
}
