package com.baekjoon;

import java.util.Scanner;

public class ex_24266 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Long n = scan.nextLong();
        System.out.println(n*n*n);
        System.out.println("3");
    }
}

//    MenOfPassion(A[], n) {
//        sum <- 0;
//        for i <- 1 to n
//        for j <- 1 to n
//        for k <- 1 to n
//        sum <- sum + A[i] × A[j] × A[k]; # 코드1
//        return sum;
//    }
