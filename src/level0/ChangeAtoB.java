package level0;

import java.util.Arrays;

public class ChangeAtoB {

    public static void main(String[] args) {
        ChangeAtoB changeAtoB = new ChangeAtoB();
        System.out.println(changeAtoB.solution("olleh", "hello"));
        System.out.println(changeAtoB.solution("allpe", "apple"));
    }

    public int solution(String before, String after) {
        char[] arr1 = before.toCharArray();
        char[] arr2 = after.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String s1 = new String(arr1);
        String s2 = new String(arr2);

        return s1.equals(s2) ? 1 : 0;
    }
}
