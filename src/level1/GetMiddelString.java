package level1;

public class GetMiddelString {

    public String solution(String s) {
        if(s.length() % 2 == 0) {
            return s.substring((s.length() / 2) - 1, (s.length() / 2) + 1);
        } else {
            return s.substring(Math.abs(s.length() / 2), Math.abs(s.length() / 2) + 1);
        }
    }
}
