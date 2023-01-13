package level0;

public class ChangeIndex {

    public static void main(String[] args) {
        String my_string = "I love you";
        System.out.println(solution(my_string, 3, 6));
    }

    private static String solution(String my_string, int num1, int num2) {
        String[] arr = my_string.split("");

        String tem1 = arr[num1];
        String tem2 = arr[num2];

        arr[num1] = tem2;
        arr[num2] = tem1;

        StringBuilder sb = new StringBuilder();
        for(String ele : arr) {
            sb.append(ele);
        }
        return sb.toString();
    }
}
