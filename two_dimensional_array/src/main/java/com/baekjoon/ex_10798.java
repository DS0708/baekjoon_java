package com.baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex_10798 {
    public static void main(String[] args) {
        List<String> str_list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for(int i=0; i<5; i++){
            str_list.add(scan.nextLine());
        }

        for(int i=0; i<15; i++){
            for(int j=0; j<5; j++){
                if(i<str_list.get(j).length()){
                    System.out.print(str_list.get(j).charAt(i));
                }
            }
        }

    }
}
