package level0;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            if(i!=0) {
                sb.append("\n");
            }
            for(int j=0; j<i+1; j++) {
                sb.append("*");
            }
        }
        System.out.println(sb);
    }
}
