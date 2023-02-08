package level1;

import java.util.ArrayList;
import java.util.List;

// 3진법 뒤집기
public class TernarySystem {

    public int solution(int n) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        while(n != 0) {
            list.add(n % 3);
            n /= 3;
        }
        int tmp = 1;
        for(int i=list.size()-1; i>=0; i--) {
            answer += list.get(i)*tmp;
            tmp *= 3;
        }
        return answer;
    }
}
