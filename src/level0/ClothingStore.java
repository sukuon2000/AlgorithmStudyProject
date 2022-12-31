package level0;

public class ClothingStore {

    public static void main(String[] args) {
        int price = 580000;
        System.out.println(solution(price));
    }

    private static int solution(int price) {
        double discount = 0;
        if(price >= 100000 && price < 300000) {
            discount = 0.05;
        } else if(price >= 300000 && price < 500000) {
            discount = 0.1;
        } else if (price >= 500000) {
            discount = 0.2;
        }
        double answer = Math.floor(price * (1 - discount));
        return (int) answer;
    }
}
