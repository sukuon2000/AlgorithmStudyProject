package level0;

public class SafetyZone {

    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}};
        System.out.println(solution(board));
    }

    private static int solution(int[][] board) {
        int n = board.length;
        boolean[][] safe = new boolean[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(board[i][j] == 1) {
                    checkBoomArea(safe, n, i, j);
                }
            }
        }

        int count = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(!safe[i][j]) {
                    count++;
                }
            }
        }

        return count;
    }

    private static void checkBoomArea(boolean[][] safe, int n, int x, int y) {
        for(int a=x-1; a<=x+1; a++) {
            for(int b=y-1; b<=y+1; b++) {
                if(b<0 || b>=n) {
                    continue;
                }
                if(a<0 || a>=n) {
                    continue;
                }
                safe[a][b] = true;
            }
        }
    }
}
