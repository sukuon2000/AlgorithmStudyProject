package level0;

public class CountDice {

    public static void main(String[] args) {
        int[] box = {10, 8, 6};
        int n = 3;
        System.out.println(solution(box, n));
    }

    private static int solution(int[] box, int n) {
        int x = box[0] / n;
        int y = box[1] / n;
        int z = box[2] / n;
        return x * y * z;
    }
}
