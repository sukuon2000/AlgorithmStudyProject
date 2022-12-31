package level0;

public class ArraySimilarity {

    public static void main(String[] args) {
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        System.out.println(solution(s1, s2));
    }

    private static int solution(String[] s1, String[] s2) {
        int result = 0;
        for(String find : s1) {
            for(String in : s2) {
                if(find.equals(in)) {
                    result++;
                }
            }
        }
        return result;
    }
}
