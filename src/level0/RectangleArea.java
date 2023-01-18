package level0;


// 직사각형 넓이 구하기
public class RectangleArea {

    public static void main(String[] args) {
        int[][] dots = {{1,1}, {2,1}, {2,2}, {1,2}};
        int[][] dots2 = {{-1,-1}, {1,1}, {1,-1}, {-1,1}};

        System.out.println(solution(dots2));
    }

    private static int solution(int[][] dots) {
        int xMax = -256;
        int xMin = 256;
        int yMax = -256;
        int yMin = 256;

        for(int i=0; i<dots.length; i++) {
            if(dots[i][0]>xMax) {
                xMax = dots[i][0];
            } else if (dots[i][0] < xMin) {
                xMin = dots[i][0];
            }

            if(dots[i][1]>yMax) {
                yMax = dots[i][1];
            } else if (dots[i][1] < yMin) {
                yMin = dots[i][1];
            }
        }

        return Math.abs(xMax - xMin) * Math.abs(yMax - yMin);
    }
}
