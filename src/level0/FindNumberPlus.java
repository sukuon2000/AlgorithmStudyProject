package level0;

public class FindNumberPlus {

    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        System.out.println(solution(my_string));
    }

    private static int solution(String my_string) {
        String match = "[^0-9]";
        my_string = my_string.replaceAll(match, "");
        String[] arr = my_string.split("");

        int sum = 0;
        for(String ele : arr) {
            sum += Integer.parseInt(ele);
        }
        return sum;
    }
}
