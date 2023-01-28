package level0;

public class CuttingPaper {

    public static void main(String[] args) {
        CuttingPaper cuttingPaper = new CuttingPaper();
        System.out.println(cuttingPaper.solution(2, 2));
        System.out.println(cuttingPaper.solution(2, 5));
        System.out.println(cuttingPaper.solution(1, 1));
    }

    public int solution(int M, int N) {
        return (M - 1) + ((M) * (N-1));
    }
}
