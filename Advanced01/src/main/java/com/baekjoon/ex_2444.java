package com.baekjoon;

import java.util.Scanner;

public class ex_2444 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int count =1;

        for(int i=1; i<=2*n-1; i+=2){
            for(int j=1; j <= (n-count) ; j++) System.out.print(" ");
            for(int j=1; j <=i ; j++) System.out.print("*");
            System.out.println();
            count ++;
        }
        count = n-1;
        for(int i=1; i<n; i++){
            for(int j=1; j<=i; j++) System.out.print(" ");
            for (int j=1; j<=count*2-1; j ++) System.out.print("*");
            System.out.println();
            count--;
        }
    }
}
