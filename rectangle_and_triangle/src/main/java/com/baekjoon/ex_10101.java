package com.baekjoon;

import java.util.Scanner;

public class ex_10101 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        int c = Integer.parseInt(scan.nextLine());

        if((a+b+c) != 180) System.out.println("Error");
        else{
            if(a==b && b==c) System.out.println("Equilateral");
            else if(a==b || b==c || a==c) System.out.println("Isosceles");
            else System.out.println("Scalene");
        }
    }
}
