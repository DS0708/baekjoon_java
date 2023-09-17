package com.baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ex_9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            int n = Integer.parseInt(br.readLine());
            List<Integer> factors = new ArrayList<>();

            if(n==-1) break;

            bw.append(n+" ");

            for(int i=1 ; i<n ; i++){
                if(n%i==0) factors.add(i);
            }

            int sum=0;
            for(int i=0 ; i<factors.size(); i++){
                sum += factors.get(i);
            }

            if(sum==n){
                bw.append("= ");
                for(int i=0 ; i<factors.size(); i++){
                    if(i==factors.size()-1) bw.append(factors.get(i)+" ");
                    else bw.append(factors.get(i)+" + ");
                }
            }else{
                bw.append("is NOT perfect.");
            }

            bw.append("\n");
        }

        bw.flush();

        bw.close();
        br.close();
    }
}
