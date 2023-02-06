package level1;

public class PlusNotExistNumber {

    public int solution(int[] numbers) {
        int sum = 0;
        for(int i=0; i<=9; i++) {
            boolean isExist = false;
            for(int j=0; j<numbers.length; j++) {
                if(numbers[j] == i) {
                    isExist = true;
                    break;
                }
            }
            if(!isExist) {
                sum += i;
            }
        }
        return sum;
    }
}
