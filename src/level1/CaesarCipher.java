package level1;

public class CaesarCipher {

    public String solution(String s, int n) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == ' ') {
                sb.append(arr[i]);
                continue;
            }

            if(arr[i] >= 65 && arr[i] <= 90) {
                if(arr[i] + n <= 90) {
                    arr[i] += n;
                } else {
                    arr[i] = (char) (64 + (n - (90 - arr[i])));
                }
            }
            if(arr[i] >= 97 && arr[i] <= 122) {
                if(arr[i] + n <= 122) {
                    arr[i] += n;
                } else {
                    arr[i] = (char) (96 + (n - (122 - arr[i])));
                }
            }

            sb.append(arr[i]);
        }
        return sb.toString();
    }

    public String solution2(String s, int n) {
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == ' ') {
                sb.append(arr[i]);
                continue;
            }

            for(int j=0; j<n; j++) {
                if(arr[i] >= 65 && arr[i] <= 90) {
                    if(arr[i] == 90) {
                        arr[i] = 65;
                    } else {
                        arr[i]++;
                    }
                }
                if(arr[i] >= 97 && arr[i] <= 122) {
                    if(arr[i] == 122) {
                        arr[i] = 97;
                    } else {
                        arr[i]++;
                    }
                }
            }
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
