package level1;

public class SmallSizeSubstring {

    public static void main(String[] args) {
        String t = "500220839878";
        String p = "7";
        SmallSizeSubstring smallSizeSubstring = new SmallSizeSubstring();
        System.out.println(smallSizeSubstring.solution(t, p));
        System.out.println(Integer.parseInt("08"));
    }

    public int solution(String t, String p) {
        int answer = 0;

        for(int i=0; i<=t.length() - p.length(); i++) {
            if(Long.parseLong(t.substring(i, i+p.length())) <= Long.parseLong(p)) {
                answer++;
            }
        }
        return answer;
    }
}
