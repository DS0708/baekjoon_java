package com.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class ex_1983 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine().toString());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int count=0;

        for(int i=0; i<n ; i++){
            int num = Integer.parseInt(st.nextToken());
            int j;
            for(j=2 ; j<num ; j++){
                if(num%j==0) break;
            }

            if(j==num) count++;
        }

        bw.write(String.valueOf(count));
        bw.flush();

        bw.close();
        br.close();
    }
}
