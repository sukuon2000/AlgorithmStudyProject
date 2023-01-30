package level0;

public class NextNumber {

    public static void main(String[] args) {
        NextNumber nextNumber = new NextNumber();
        int[] common1 = {1,2,3,4};
        int[] common2 = {2, 4, 8};
        System.out.println(nextNumber.solution(common1));
        System.out.println(nextNumber.solution(common2));
    }

    public int solution(int[] common) {
        if(common[common.length - 1] - common[common.length - 2] == common[common.length - 2] - common[common.length - 3]) {
            return common[common.length - 1] + (common[common.length - 1] - common[common.length - 2]);
        }
        int r = common[common.length - 1]/common[common.length - 2];
        return common[common.length - 1] * r;
    }
}
