package com.baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ex_1085 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(scanner.nextLine()," ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());


        int min = get_min(get_min(x,w-x),get_min(y,h-y));

        System.out.println(min);
    }

    private static int get_min(int x, int y) {
        return x >= y ? y : x;
    }
}
