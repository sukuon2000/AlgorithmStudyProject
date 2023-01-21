package level0;

public class LengthOfOverlappingLine {

    public static void main(String[] args) {
        int[][] lines = {{0, 1}, {2, 5}, {3, 9}};
        int[][] lines2 = {{0, 5}, {3, 9}, {1, 10}};
        System.out.println(solution(lines2));
    }

    private static int solution(int[][] lines) {
        int[] arr = new int[200];

        for(int[] line : lines) {
            for(int i = line[0] + 100; i < line[1] + 100; i++) {
                arr[i]++;
            }
        }

        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if (arr[i] > 1) {
                count++;
            }
        }

        return count;
    }
}
