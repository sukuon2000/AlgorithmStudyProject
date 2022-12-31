package level0;

public class FInddingTheMode {

    public static void main(String[] args) {
        int[] array = {1};
        System.out.println(solution(array));
    }

    public static int solution(int[] array) {
        int[] arr = new int[1000];
        int maxKey = -1;
        int maxValue = -1;

        for(int ele : array) {
            arr[ele]++;
        }

        for(int i=0; i<arr.length; i++) {
            if(maxValue < arr[i]) {
                maxKey = i;
                maxValue = arr[i];
            } else if (maxValue == arr[i]) {
                maxKey = -1;
                maxValue = arr[i];
            }
        }
        return maxKey;
    }
}
