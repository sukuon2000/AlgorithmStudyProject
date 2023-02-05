package level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Divisor {

    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        Collections.sort(list);

        if(list.size() == 0) {
            int[] newArr = {-1};
            return newArr;
        } else {
            int[] newArr2 = list.stream().mapToInt(i -> i).toArray();
            return newArr2;
        }
    }
}
