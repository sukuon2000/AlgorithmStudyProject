package level0;

public class array2 {
    public static void main(String[] args) {

    }

    public static int[] solution(int[] numbers) {
        for(int i=0; i<numbers.length; i++) {
            numbers[i] *= 2;
        }
        return numbers;
    }
}
