package com.baekjoon;

public class ex_2292 {
    public static void main(String[] args) {

        int n = new java.util.Scanner(System.in).nextInt();
        int floor = 1;
        int boundary = 1;

        while(true) {
            boundary += (floor-1)*6;

            if(boundary>=n) break;

            floor++;
        }
        System.out.println(floor);
    }
}
