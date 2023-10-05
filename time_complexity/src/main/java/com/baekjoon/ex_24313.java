package com.baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ex_24313 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(scan.nextLine()," ");
        int a1 = Integer.parseInt(st.nextToken());
        int a2 = Integer.parseInt(st.nextToken());

        int c = Integer.parseInt(scan.nextLine());
        int n = Integer.parseInt(scan.nextLine());

        int fn = a1*n+a2;
        int cgn = c*n;

        if((c>=a1) && (fn <= cgn)) System.out.println("1");
        else System.out.println("0");
    }
}
