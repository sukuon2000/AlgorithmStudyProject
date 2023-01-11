package level0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DeleteDuplicateCharacters {

    public static void main(String[] args) {
        String my_string = "We are the world"	;
        System.out.println(solution(my_string));
    }

    private static String solution(String my_string) {
        String[] arr = my_string.split("");
        Set<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList();

        for(String ele : arr) {
            if(!set.contains(ele)) {
                set.add(ele);
                list.add(ele);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String ele : list) {
            sb.append(ele);
        }
        return sb.toString();
    }

    private static String solution_stream(String my_string) {
        return my_string.chars()
                .mapToObj(Character::toString)
                .distinct()
                .collect(Collectors.joining());
    }
}
