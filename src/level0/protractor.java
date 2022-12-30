package level0;

public class protractor {
    public static void main(String[] args) {
        int angle = 70;
        int answer = -1;
        if(angle < 90) {
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        } else if (angle < 180) {
            answer = 3;
        } else if (angle == 180) {
            answer = 4;
        }
    }
}
