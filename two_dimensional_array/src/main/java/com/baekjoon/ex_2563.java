package com.baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ex_2563 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int[][] paper = new int[100][100];

        int dup_paper = 0;

        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(scan.nextLine()," ");
            int col = Integer.parseInt(st.nextToken());
            int row = Integer.parseInt(st.nextToken());
            for(int j=row-1; j<row+9; j++){
                for(int z=col-1; z<col+9; z++){
                    if(paper[j][z]==0){
                        paper[j][z]= 1;
                    }else{
                        dup_paper +=1;
                    }
                }
            }
        }

        System.out.println(100*n-dup_paper);

    }
}
