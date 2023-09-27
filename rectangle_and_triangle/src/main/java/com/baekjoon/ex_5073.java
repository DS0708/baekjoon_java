package com.baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ex_5073 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while(true){
            String str = scanner.nextLine();
            if(str.equals("0 0 0")) break;
            StringTokenizer st = new StringTokenizer(str," ");
            int side1 = Integer.parseInt(st.nextToken());
            int side2 = Integer.parseInt(st.nextToken());
            int side3 = Integer.parseInt(st.nextToken());

            if(isNotTriangle(side1,side2,side3)){
                sb.append("Invalid\n");
                continue;
            }

            if(side1==side2 && side2 == side3)  sb.append("Equilateral\n");
            else if (side1==side2 || side2==side3 || side1==side3) {
                sb.append("Isosceles\n");
            }
            else sb.append("Scalene\n");
        }

        System.out.println(sb);
    }

    private static boolean isNotTriangle(int side1, int side2, int side3) {
        Boolean check = true;

        if(side1 > side2 && side1 > side3){
            if(side1<side2+side3) check = false;
        }else if (side2 > side3){
            if(side2<side1+side3) check = false;
        }else {
            if(side3<side2+side1) check = false;
        }
        return check;
    }
}
