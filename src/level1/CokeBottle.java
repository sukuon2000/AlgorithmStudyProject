package level1;

public class CokeBottle {

    public int solution(int a, int b, int n) {
        int full = n;
        int empty = 0;
        int answer = 0;

        while(full >= a) {
            answer += (full / a) * b;
            empty += (full % a);
            full = (full / a) * b;

            if(full < a) {
                full += empty;
                empty = 0;
            }
        }
        return answer;
    }
}
