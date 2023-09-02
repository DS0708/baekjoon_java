package com.baekjoon;

import java.util.Scanner;

public class ex_10988 {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        int check = 1;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                check = 0;
                break;
            }
        }
        System.out.println(check);
    }
}
