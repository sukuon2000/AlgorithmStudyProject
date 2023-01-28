package level0;

public class ChickenCoupon {

    public static void main(String[] args) {
        System.out.println(solution(100));
        System.out.println(solution(1081));
    }

    private static int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;

        while (coupon >= 10) {
            int leftCoupon = coupon % 10;
            answer += (coupon / 10);
            coupon = leftCoupon + (coupon / 10);
        }
        return answer;
    }
}
