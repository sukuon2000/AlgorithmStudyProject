package level0;

public class Count7 {

    public static void main(String[] args) {
        int[] array = {7, 77, 17};
        System.out.println(solution(array));
    }

    private static int solution(int[] array) {
        int answer = 0;

        for(int a : array) {
            String s = String.valueOf(a);
            for(int i=0; i<s.length(); i++) {
                if(s.charAt(i) == '7') {
                    answer++;
                }
            }
        }

        return answer;
    }
}
