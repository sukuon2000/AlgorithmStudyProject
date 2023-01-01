package level0;

public class DeleteGather {

    public static void main(String[] args) {
        String my_string = "nice to meet you";
        System.out.println(solution(my_string));
    }

    private static String solution(String my_string) {
        String[] replace = {"a", "e", "i", "o", "u"};
        String answer = null;
        for (int i=0; i<replace.length; i++) {
            if(my_string.contains(replace[i])) {
                answer = my_string.replaceAll(replace[i], "");
                my_string = answer;
            } else {
                answer = my_string;
            }
        }
        return answer;
    }
}
