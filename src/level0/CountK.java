package level0;

public class CountK {

    public static void main(String[] args) {
        CountK countK = new CountK();
        System.out.println(countK.solution2(1, 13, 1));
        //System.out.println(countK.solution(10, 50, 5));
        //System.out.println(countK.solution(3, 10, 2));
    }

    public int solution(int i, int j, int k) {
        String sk = String.valueOf(k);
        int answer = 0;
        for(i=i; i<=j; i++) {
            String si = String.valueOf(i);
            char[] arr = si.toCharArray();
            for(char c : arr) {
                if(c == sk.charAt(0)) {
                    answer++;
                }
            }

        }
        return answer;
    }

    public int solution2(int i, int j, int k) {
        StringBuilder sb = new StringBuilder();
        for(int a=i; a<=j; a++) {
            sb.append(String.valueOf(a));
        }
        return sb.length() - sb.toString().replace(String.valueOf(k), "").length();
    }
}
