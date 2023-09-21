package com.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.System.exit;

public class ex_9063 {
    static int x_min = Integer.MAX_VALUE;
    static int x_max = Integer.MIN_VALUE;
    static int y_min = Integer.MAX_VALUE;
    static int y_max = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            cal_xy_min_max(x,y);
        }

        if(n==1) {
            System.out.println(0);
            exit(0);
        }

        int area = (x_max-x_min) * (y_max - y_min);
        bw.append(String.valueOf(area));
        bw.flush();

        br.close();
        bw.close();
    }

    private static void cal_xy_min_max(int x, int y) {
        if(x > x_max) x_max = x;
        if (x < x_min) x_min = x;

        if(y > y_max) y_max = y;
        if (y < y_min) y_min = y;
    }
}
