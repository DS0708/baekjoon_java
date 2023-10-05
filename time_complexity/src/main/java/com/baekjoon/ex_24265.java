package com.baekjoon;

import java.util.Scanner;

public class ex_24265 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Long n = scan.nextLong();

        System.out.println((n-1)*n/2);
        System.out.println("2");
    }
}

//    MenOfPassion(A[], n) {
//        sum <- 0;
//        for i <- 1 to n - 1
//        for j <- i + 1 to n
//        sum <- sum + A[i] × A[j]; # 코드1
//        return sum;
//    }
