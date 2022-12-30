package level0;

public class arrayAverage {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(solution(arr));
    }

    public static double solution(int[] numbers) {
        double sum = 0;
        for(int number : numbers) {
            sum+= number;
        }
        return sum / numbers.length;
    }
}
