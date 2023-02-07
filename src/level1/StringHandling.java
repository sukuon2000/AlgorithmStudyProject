package level1;

public class StringHandling {

    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }
        s = s.replaceAll("[0-9]", "");
        if (s.equals("")) {
            return true;
        }
        return false;
    }
}
