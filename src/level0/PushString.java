package level0;

public class PushString {

    public static void main(String[] args) {
        PushString pushString = new PushString();
        System.out.println(pushString.solution("hello", "ohell"));
    }

    public int solution(String A, String B) {
        String s = A;
        int answer = 0;
        for(int i=0; i<A.length(); i++) {
            if(s.equals(B)) {
                return answer;
            }
            String a = s.substring(s.length() -1);
            s = a + s.substring(0, s.length() -1);
            answer++;
        }
        return -1;
    }
}
