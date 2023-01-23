package level0;

import java.util.Arrays;

public class SuccessLogin {

    public static void main(String[] args) {
        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
        System.out.println(solution(id_pw, db));
    }

    private static String solution(String[] id_pw, String[][] db) {
        String login = "fail";
        for(String[] account : db) {
            if(id_pw[0].equals(account[0])) {
                if(id_pw[1].equals(account[1])) {
                    login = "login";
                } else {
                    login = "wrong pw";
                }
                break;
            }
        }
        return login;
    }
}
