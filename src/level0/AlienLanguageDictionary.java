package level0;

public class AlienLanguageDictionary {

    public static void main(String[] args) {
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
        System.out.println(solution(spell, dic));
    }

    private static int solution(String[] spell, String[] dic) {
        int answer = 0;
        for(int i=0; i<dic.length; i++) {
            boolean contain = false;
            for(String sp : spell) {
                if(dic[i].contains(sp)) {
                    contain = true;
                    continue;
                } else {
                    contain = false;
                    break;
                }
            }

            if(contain) {answer++;}
        }
        return answer > 0 ? 1 : 2;
    }
}
