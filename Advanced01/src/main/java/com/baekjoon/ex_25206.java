package com.baekjoon;


import java.util.Scanner;
import java.util.StringTokenizer;

public class ex_25206 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total_course = 0;
        double grade_sum = 0;
        int count=0;
        while(true){
            count ++;
            if(count>20) break;;

            String str = scan.nextLine();

            StringTokenizer st = new StringTokenizer(str," ");
            String name = st.nextToken();
            double course = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();

            if(!grade.equals("P")){
                total_course += course;
                grade_sum += course*get_grade(grade);
            }
        }
        System.out.println(grade_sum/total_course);
    }

    private static double get_grade(String grade) {
        switch (grade){
            case "A+": return 4.5;
            case "A0": return 4.0;
            case "B+": return 3.5;
            case "B0": return 3.0;
            case "C+": return 2.5;
            case "C0": return 2.0;
            case "D+": return 1.5;
            case "D0": return 1.0;
        }
        return 0;
    }
}
