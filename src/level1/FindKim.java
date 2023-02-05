package level1;

import java.util.Arrays;

public class FindKim {

    public String solution(String[] seoul) {
        int index = Arrays.asList(seoul).indexOf("Kim");

        return "김서방은 "+index+"에 있다";
    }
}
