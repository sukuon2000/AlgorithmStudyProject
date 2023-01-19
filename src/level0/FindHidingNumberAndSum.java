package level0;

public class FindHidingNumberAndSum {

    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        System.out.println(solution(my_string));
    }

    private static int solution(String my_string) {
        my_string = my_string.replaceAll("[^0-9]", " ");
        String[] arr = my_string.split(" ");

        int sum = 0;
        for(String ele : arr) {
            if(ele.equals("")) {
                continue;
            }else if(ele != null || !ele.equals("")) {
                sum += Integer.parseInt(ele);
            }
        }

        return sum;
    }
}
