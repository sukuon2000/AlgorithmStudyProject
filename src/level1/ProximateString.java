package level1;

import java.util.HashMap;
import java.util.Map;

public class ProximateString {

    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            String find = s.substring(i, i+1);
            if(map.containsKey(find)) {
                answer[i] = i - map.get(find);
            } else {
                answer[i] = -1;
            }
            map.put(find, i);
        }
        return answer;
    }
}
