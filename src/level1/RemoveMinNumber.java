package level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveMinNumber {

    public int[] solution(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        list.remove(list.indexOf(Collections.min(list)));

        int[] answer;
        if(list.size() > 0) {
            answer = new int[list.size()];
            answer = list.stream().mapToInt(i -> i).toArray();
            return answer;
        } else {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
    }
}
