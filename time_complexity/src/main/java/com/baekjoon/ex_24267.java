package com.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ex_24267 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long n = Long.parseLong(br.readLine());

        System.out.println(n*(n-1)*(n-2)/6);
        System.out.println("3");
    }
}

//    MenOfPassion(A[], n) {
//        sum <- 0;
//        for i <- 1 to n - 2
//        for j <- i + 1 to n - 1
//        for k <- j + 1 to n
//        sum <- sum + A[i] × A[j] × A[k]; # 코드1
//        return sum;
//    }
