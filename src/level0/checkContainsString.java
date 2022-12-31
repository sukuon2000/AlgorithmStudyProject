package level0;

public class checkContainsString {

    public static void main(String[] args) {
        String str1 = "ppprrrogrammers"	;
        String str2 = "pppp";
        System.out.println(solution(str1, str2));
    }

    private static int solution(String str1, String str2) {
        if(str1.contains(str2)) {
            return 1;
        }
        return 2;
    }
}
