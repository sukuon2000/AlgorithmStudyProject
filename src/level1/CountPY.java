package level1;

public class CountPY {

    public boolean solution(String s) {
        int p = 0;
        int y = 0;

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == 'P' || s.charAt(i) == 'p') p++;
            if(s.charAt(i) == 'Y' || s.charAt(i) == 'y') y++;
        }
        return p==y;
    }
}
