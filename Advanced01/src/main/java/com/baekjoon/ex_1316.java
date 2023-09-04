package com.baekjoon;

import java.util.Scanner;

public class ex_1316 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int count = 0;

        for(int i=0; i<n ; i++){
            boolean check = word_check(scan.nextLine());
            if(check) count++;
        }
        System.out.println(count);
    }

    private static boolean word_check(String s) {
        boolean[] bit_word = new boolean[26];
        int prev = 0;
        for(int i=0; i<s.length(); i++){
            if(prev!=s.charAt(i)){
                prev = s.charAt(i);
                if(!bit_word[s.charAt(i)-'a']){
                    bit_word[prev-'a'] = true;
                }else {
                    return false;
                }
            }else{
                continue;
            }
        }
        return true;
    }
}
