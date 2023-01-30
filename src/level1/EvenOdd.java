package level1;

public class EvenOdd {

    public static void main(String[] args) {
        EvenOdd evenOdd = new EvenOdd();
        System.out.println(evenOdd.solution(101));
    }

    public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
}
