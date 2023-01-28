package level0;

public class PlusBinaryNumber {

    public static void main(String[] args) {
        PlusBinaryNumber plusBinaryNumber = new PlusBinaryNumber();
        System.out.println(plusBinaryNumber.solution("10", "11"));
        System.out.println(plusBinaryNumber.solution("1001", "1111"));
    }

    public String solution(String bin1, String bin2) {
        return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
    }
}
