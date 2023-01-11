package level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class CtrlZ {

    public static void main(String[] args) {
        String s = "10 20 30 40";
        System.out.println(solution(s));
    }

    private static int solution(String s) {
        String[] arr = s.split(" ");
        boolean[] intArr = new boolean[arr.length];
        int sum = 0;

        ArrayList<Integer> list = new ArrayList();

        for(int i=0; i<arr.length; i++) {
            if(!arr[i].equals("Z")){
                list.add(Integer.parseInt(arr[i]));
            } else {
                list.remove(list.size() - 1);
            }
        }
        for(int each : list) {
            sum += each;
        }
        return sum;
    }

    private static int solution_stack(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (String w : s.split(" ")) {
            if (w.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(w));
            }
        }
        for (int i : stack) {
            answer += i;
        }
        return answer;
    }
}
