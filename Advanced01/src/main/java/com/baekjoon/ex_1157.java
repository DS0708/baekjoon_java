package com.baekjoon;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ex_1157 {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine().toLowerCase();
        int[] use_arr = new int[26];

        for(int i=0; i<str.length(); i++) {
            use_arr[(int)str.charAt(i)-97] += 1;
        }

        int max = -1;
        char result = '?';

        for(int i=0; i<use_arr.length; i++){
            if(use_arr[i] > max) {
                max = use_arr[i];
                result = (char)(i + 65);
            }
            else if (use_arr[i] == max) result = '?';
        }

        System.out.println(result);
    }
}
