package com.baekjoon;

import java.io.*;

public class ex_2581 {

    public static boolean[] prime;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int min = Integer.parseInt(br.readLine());
        int max = Integer.parseInt(br.readLine());

        prime = new boolean[max+1];
        getPrime();

        int min_factor = -1;
        int sum_factors = 0;

        for(int i = min ; i<=max ; i++){
            if(!prime[i]){
                if(min_factor==-1) min_factor = i;
                sum_factors += i;
            }
        }

        if(min_factor==-1){
            bw.append(min_factor+"");
        }else{
            bw.append(sum_factors+"\n")
                    .append(min_factor+"");
        }

        bw.flush();

        br.close();
        bw.close();

    }

    private static void getPrime() {
        prime[0] = true;
        prime[1] = true;
        for(int i=2 ; i*i < prime.length ; i++){
            if(!prime[i]){
                for(int j=i*i ; j< prime.length; j+=i) prime[j] = true;
            }
        }
    }
}
