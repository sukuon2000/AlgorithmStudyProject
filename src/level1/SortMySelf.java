package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortMySelf {

    public static void main(String[] args) {
        String[] strings = {"abce", "abcd", "cdx"};
        SortMySelf sortMySelf = new SortMySelf();
        System.out.println(Arrays.toString(sortMySelf.solution(strings, 2)));
    }

    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        List<String> list = new ArrayList<String>();

        for(int i=0; i<strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(list);

        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i).substring(1);
        }
        return answer;
    }
}
