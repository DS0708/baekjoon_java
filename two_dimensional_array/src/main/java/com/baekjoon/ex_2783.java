package com.baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ex_2783 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(scan.nextLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] matrix1 = new int[n][m];
        int[][] matrix2 = new int[n][m];

        for(int i=0; i<n; i++){
            StringTokenizer temp_st = new StringTokenizer(scan.nextLine()," ");
            for(int j=0; j<m; j++){
                matrix1[i][j] = Integer.parseInt(temp_st.nextToken());
            }
        }

        for(int i=0; i<n; i++){
            StringTokenizer temp_st = new StringTokenizer(scan.nextLine()," ");
            for(int j=0; j<m; j++){
                matrix2[i][j] = Integer.parseInt(temp_st.nextToken());
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix1[i][j]+matrix2[i][j]+" ");
            }
            System.out.println();
        }

    }
}
