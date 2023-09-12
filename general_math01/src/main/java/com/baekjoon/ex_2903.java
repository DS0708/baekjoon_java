package com.baekjoon;

public class ex_2903 {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();

        System.out.println((int)Math.pow(Cal_line(n),2));
    }

    private static double Cal_line(int n) {
        int res = 2;

        for(int i=0; i<n; i++){
            res += (res-1);
        }

        return res;
    }
}
