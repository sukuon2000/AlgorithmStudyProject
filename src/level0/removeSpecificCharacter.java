package level0;

public class removeSpecificCharacter {

    public static void main(String[] args) {
        String my_string = "abcdef";
        String letter = "f";
        System.out.println(solution1(my_string, letter));
        System.out.println(solution2(my_string, letter));
    }

    private static String solution1(String my_string, String letter) {
        char c = letter.charAt(0);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<my_string.length(); i++) {
            if(my_string.charAt(i) != c) {
                sb.append(my_string.charAt(i));
            }
        }
        return sb.toString();
    }

    private static String solution2(String my_string, String letter) {
        return my_string.replaceAll(letter, "");
    }
}
