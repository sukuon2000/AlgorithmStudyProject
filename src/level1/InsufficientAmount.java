package level1;

public class InsufficientAmount {

    public long solution(int price, int money, int count) {
        long s = count * (price + (count * price)) / 2;

        if(s > money) {
            return s - money;
        } else {
            return 0;
        }
    }
}
