package com.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
//        StringTokenizer st = new StringTokenizer(new java.util.Scanner(System.in).nextLine(), " ");
        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());


        // x*up - down*(x-1) >= height
        // x(up-down) >= height - down
        // x >= height - down / up - down
        int res = (height - down) / (up - down);
        if ((height - down) % (up - down) == 0) {
            System.out.println(res);
        } else {
            System.out.println(res + 1);

        }
    }
}
