package com.baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ex_2566 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = -1;
        int row = 0;
        int col = 0;

        for(int i=0; i<9; i++){
            StringTokenizer st = new StringTokenizer(scan.nextLine()," ");
            for(int j=0; j<9; j++){
                int num = Integer.parseInt(st.nextToken());
                if(max < num){
                    max = num;
                    row = i+1;
                    col = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(row+" "+col);
    }
}
