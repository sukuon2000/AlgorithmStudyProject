package level0;

import java.util.HashMap;

public class MorseCode {

    public static void main(String[] args) {
        String letter = ".... . .-.. .-.. ---";
        System.out.println(solution(letter));
    }

    private static String solution(String letter) {
        String[] code = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<String, String> map = new HashMap<>();

        for(int i= 97; i<=122; i++) {
            String key = String.valueOf((char) i);
            map.put(code[i-97], key);
        }

        StringBuilder sb = new StringBuilder();
        String[] arr = letter.split(" ");

        for(String ele : arr) {
            sb.append(map.get(ele));
        }
        return sb.toString();
    }
}
