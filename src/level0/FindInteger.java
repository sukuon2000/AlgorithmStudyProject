package level0;

public class FindInteger {

    public static void main(String[] args) {
        int num = 29183;
        int k = 1;
        System.out.println(solution(num, k));
    }

    private static int solution(int num, int k) {
        String s = String.valueOf(num);
        int index =  s.indexOf(String.valueOf(k));
        return index == -1 ? -1 : index + 1;
    }
}
