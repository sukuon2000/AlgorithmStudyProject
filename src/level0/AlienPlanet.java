package level0;

public class AlienPlanet {
    public static void main(String[] args) {
        int age = 23;
        System.out.println(solution(age));
    }

    private static String solution(int age) {
        String answer = "";
        String s = String.valueOf(age);
        String[] arr = s.split("");

        for(int i=0; i<arr.length; i++) {
            answer += ((char)( (Integer.parseInt(arr[i]) + 97)));
        }
        return answer;
    }
}
