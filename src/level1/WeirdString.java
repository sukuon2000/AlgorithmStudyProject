package level1;

public class WeirdString {

    public static void main(String[] args) {

    }

    public String solution(String s) {
        String[] str = s.split("");
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for(int i=0; i<str.length; i++) {
            if(str[i].equals(" ")) {
                sb.append(str[i]);
                index = 0;
            } else if(index % 2 == 0) {
                sb.append(str[i].toUpperCase());
                index++;
            } else if(index % 2 == 1) {
                sb.append(str[i].toLowerCase());
                index++;
            }
        }
        return sb.toString();
    }
}
