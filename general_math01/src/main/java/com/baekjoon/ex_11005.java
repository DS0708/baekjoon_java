package com.baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ex_11005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(scan.nextLine()," ");

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        List<String> res = new ArrayList<>();

        while(true){
            String temp_str = String.valueOf(n%b);
            res.add(temp_str);
            n /= b;
            if(n < 1) break;
        }

        for(int i=res.size()-1; i>=0; i--){
            if(Integer.parseInt(res.get(i)) >= 10){
                System.out.print(numToChar(res.get(i)));
            }else{
                System.out.print(res.get(i));
            }
        }

    }

    private static char numToChar(String s) {
        int n = Integer.parseInt(s) - 10;
        char ret = (char) (n + 'A');
        return ret;
    }
}
