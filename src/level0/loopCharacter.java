package level0;

public class loopCharacter {

    public static void main(String[] args) {
        String my_string = "hello";
        int n = 3;
        System.out.println(solution(my_string, n));
    }

    private static String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<my_string.length(); i++) {
            for(int j=0; j<n; j++) {
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }
}
