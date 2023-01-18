package level0;

// 최댓값 만들기 (2)
public class FIndMax2 {

    public static void main(String[] args) {
        int[] numbers = {1,2,-3,4,-5};
        System.out.println(solution(numbers));
    }

    private static int solution(int[] numbers) {

        int answer = Integer.MIN_VALUE;

        for(int i=0; i<numbers.length; i++) {
            for(int j=0; j<numbers.length; j++) {
                if(i==j) {continue;}
                if(numbers[i] * numbers[j] > answer) {
                    answer = numbers[i] * numbers[j];
                }
            }
        }
        return answer;
    }
}
