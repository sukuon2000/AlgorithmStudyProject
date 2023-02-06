package level1;

import java.util.List;
import java.util.ArrayList;

public class CountAndPlusOfMeasure {

    public static void main(String[] args) {
        CountAndPlusOfMeasure countAndPlusOfMeasure = new CountAndPlusOfMeasure();
        System.out.println(countAndPlusOfMeasure.solution(13, 17));
    }

    public int solution(int left, int right) {
        int sum = 0;
        for(int i=left; i<=right; i++) {
            List<Integer> list = new ArrayList<>();
            for(int j=1; j<=Math.sqrt(i); j++) {
                if(i % j == 0) {
                    list.add(j);
                    if(j != i/j) {
                        list.add(i / j);
                    }
                }
            }
            if(list.size() % 2 == 0) {
                sum += i;
            } else {
                sum -= i;
            }
        }
        return sum;
    }
}
