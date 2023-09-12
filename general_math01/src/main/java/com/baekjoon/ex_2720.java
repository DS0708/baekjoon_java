package com.baekjoon;

import java.util.Scanner;

public class ex_2720 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int t = Integer.parseInt(scan.nextLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0 ;i<t; i++){
            sb.append(Cal_Change(scan.nextLine()));
        }

        System.out.println(sb);
    }

    private static String Cal_Change(String s) {
        int change = Integer.parseInt(s);
        int quarter = 0;
        int dime = 0;
        int nickel = 0;
        int penny = 0;

        while(true){
            if(change>=25){
                change -= 25;
                quarter++;
            }else if(change>=10){
                change -=10;
                dime++;
            }else if(change>=5){
                change -=5;
                nickel++;
            }else {
                penny += change;
                break;
            }
        }

        return quarter+" "+dime+" "+nickel+" "+penny+"\n";
    }
}
