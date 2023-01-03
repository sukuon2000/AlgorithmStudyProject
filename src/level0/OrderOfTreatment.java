package level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.*;

public class OrderOfTreatment {

    public static void main(String[] args) {
        int[] emergency = {3, 76, 24};
        System.out.println(Arrays.toString(solution(emergency)));
    }

    private static int[] solution(int[] emergency) {
        int[] clone = emergency.clone();
        int[] rank = new int[emergency.length];
        for(int i=clone.length; i>0; i--) {
            rank[rank.length - i] = i;
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        Arrays.sort(clone);
        for(int i=0; i<clone.length; i++) {
            hashMap.put(clone[i], rank[i]);
        }

        int[] answer = new int[emergency.length];
        for(int i=0; i<clone.length; i++) {
            answer[i] = hashMap.get(emergency[i]);
        }


        return answer;
    }

}
