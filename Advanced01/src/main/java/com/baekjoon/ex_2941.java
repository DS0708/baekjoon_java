package com.baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ex_2941 {
    public static void main(String[] args) {
        String[] c_letter = {"dz=","c=","c-","d-","lj","nj","s=","z="};
        String str_in = new Scanner(System.in).next();
        int count = 0;

        for(int i=0 ; i< str_in.length(); i++){
            if((i+3)<=str_in.length() && str_in.substring(i,i+3).equals(c_letter[0])){
                count++;
                i+=2;
            }else if((i+2)<=str_in.length()){
                int j;
                for(j=1; j<c_letter.length; j++){
                    if(str_in.substring(i,i+2).equals(c_letter[j])){
                        count++;
                        i++;
                        break;
                    }
                }
                if(j==c_letter.length) count++;
            }else count++;
        }

        System.out.println(count);
    }
}
