package com.baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ex_2745 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(scan.nextLine()," ");

        String n = st.nextToken();
        int B_formation = Integer.parseInt(st.nextToken());
        int res = 0;

        for(int i=0; i<n.length(); i++){
            if ('A'<= n.charAt(i) && n.charAt(i) <= 'Z' ){
                int temp = (int)(n.charAt(i) - 'A') +10;
                res += temp * Math.pow(B_formation,n.length()-1-i);
            }else{
                res += (int)(n.charAt(i)-'0') * Math.pow(B_formation,n.length()-1-i);
            }
        }
        System.out.println(res);
    }
}
