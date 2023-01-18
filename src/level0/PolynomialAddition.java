package level0;

import java.util.Arrays;

// 다항식 더하기
public class PolynomialAddition {

    public static void main(String[] args) {
        String polynomial = "";
        System.out.println(solution(polynomial));
    }

    private static String solution(String polynomial) {
        int x = 0;
        int a = 0;

        String[] arr = polynomial.split(" ");
        if(arr.length == 0) {return Integer.toString(0);}

        for(int i = 0; i<arr.length; i++) {
            if(arr[i].equals("+")) {continue;}
            if(arr[i].contains("x")) {
                x += arr[i].equals("x") ? 1 : Integer.parseInt(arr[i].replaceAll("x", ""));
            } else {
                a += Integer.parseInt(arr[i]);
            }
        }

        StringBuilder sb = new StringBuilder();
        if (x != 0 && a != 0) {
            return x == 1 ? sb.append("x").append(" + ").append(a).toString()
                    : sb.append(x).append("x").append(" + ").append(a).toString();
        }
        if (x != 0) return x == 1 ? sb.append("x").toString() : sb.append(x).append("x").toString();
        return a != 0 ? sb.append(a).toString() : "0";
    }

    private static String solution2(String polynomial) {
        int sumX = 0;
        int sum = 0;
        for (String string : polynomial.split(" ")) {
            if (string.equals("+")) continue;
            if (string.contains("x")) {
                sumX += string.equals("x") ? 1 : Integer.parseInt(string.replaceAll("x", ""));
            } else sum += Integer.parseInt(string);
        }

        StringBuilder sb = new StringBuilder();
        if (sumX != 0 && sum != 0) {
            return sumX == 1 ? sb.append("x").append(" + ").append(sum).toString()
                    : sb.append(sumX).append("x").append(" + ").append(sum).toString();
        }
        if (sumX != 0) return sumX == 1 ? sb.append("x").toString() : sb.append(sumX).append("x").toString();
        return sum != 0 ? sb.append(sum).toString() : "0";
    }
}