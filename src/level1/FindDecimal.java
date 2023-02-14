package level1;

public class FindDecimal {

    public int solution(int n) {
        int answer = 0;

        boolean[] arr = new boolean[n + 1];
        arr[0] = arr[1] = true;

        for(int i=2; i<=n; i++) {
            if(arr[i]) continue;
            answer++;
            for(int j=i*i; j<=n; j += i) {
                if(arr[j]) continue;
                arr[j] = true;
            }
        }

        return answer;
    }


    public int solution2(int n) {
        int answer = 0;

        boolean[] arr = new boolean[n + 1];
        arr[0] = arr[1] = true;

        for(int i=2; i<=Math.sqrt(n); i++) {
            if(arr[i]) continue;
            for(int j=i*i; j<=n; j += i) {
                arr[j] = true;
            }
        }

        for(int i=0; i<= n; i++) {
            if(!arr[i]) answer++;
        }

        return answer;
    }
}
