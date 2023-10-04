package com.baekjoon;

import java.io.*;

public class ex_24264 {
    public static void main(String[] args) throws IOException {
//        MenOfPassion(A[], n) {
//            sum <- 0;
//            for i <- 1 to n
//            for j <- 1 to n
//            sum <- sum + A[i] × A[j]; # 코드1
//            return sum;
//        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());

        bw.write((long)Math.pow(n,2)+"\n");
        bw.write("2");

        bw.flush();

        bw.close();
        br.close();
    }
}
