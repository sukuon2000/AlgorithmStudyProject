package level0;

public class ExchangeUpperLower {

    public static void main(String[] args) {
        String my_string = "cccCCC";
        System.out.println(solution(my_string));
    }

    private static String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<my_string.length(); i++) {
            int charAt = my_string.charAt(i);

            if(charAt < 97) {
                sb.append((char)(my_string.charAt(i) + 32));
            } else {
                sb.append((char)(my_string.charAt(i) - 32));
            }
        }
        return sb.toString();
    }
}
