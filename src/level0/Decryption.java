package level0;

public class Decryption {

    public static void main(String[] args) {
        String cipher = "dfjardstddetckdaccccdegk";
        int code = 4;
        System.out.println(solution(cipher, code));
    }

    private static String solution(String cipher, int code) {
        int index = 0;
        StringBuilder sb = new StringBuilder();

        while(cipher.length() >= index + 1) {
            if((index + 1) % code == 0) {
                sb.append(cipher.substring(index, index + 1));
            }
            index++;
        }
        return sb.toString();
    }
}
