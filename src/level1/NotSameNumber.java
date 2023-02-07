package level1;

import java.util.ArrayList;
import java.util.List;

public class NotSameNumber {

    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++) {
            if(list.isEmpty()) {
                list.add(arr[i]);
            }
            if(list.get(list.size() - 1) != arr[i]) {
                list.add(arr[i]);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
