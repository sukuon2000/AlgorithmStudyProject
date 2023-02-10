package level1;

public class BusinessCard {

    public int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;

        for(int i=0; i<sizes.length; i++) {
            if(sizes[i][0] > sizes[i][1]) {
                if(maxW < sizes[i][0]) {
                    maxW = sizes[i][0];
                }
                if(maxH < sizes[i][1]) {
                    maxH = sizes[i][1];
                }
            } else {
                if(maxW < sizes[i][1]) {
                    maxW = sizes[i][1];
                }
                if(maxH < sizes[i][0]) {
                    maxH = sizes[i][0];
                }
            }
        }
        return maxW * maxH;
    }
}
