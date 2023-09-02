package com.baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ex_3003 {
    public static void main(String[] args) {
        int[] chess_arr = {1,1,2,2,2,8};
        int temp=0;

        Scanner scan = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(scan.nextLine()," ");

        for(int i=0; i< chess_arr.length; i++){
            temp = chess_arr[i] - Integer.parseInt(st.nextToken());
            System.out.printf(temp+" ");
        }
    }
}
