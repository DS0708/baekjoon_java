package com.baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex_11653 {
    public static boolean prime[];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> factors = new ArrayList<>();

        prime = new boolean[n+1];
        getPrime();

        for(int i=1; i<prime.length; i++){
            if(!prime[i]) factors.add(i);
        }

        for(int i=0; i<factors.size(); i++){
            if(n==1) break;
            if(n%factors.get(i)==0){
                System.out.println(factors.get(i));
                n/=factors.get(i);
                i--;
            }
        }

    }

    private static void getPrime() {
        prime[0] = true;
        prime[1] = true;
        for(int i=2 ; i*i < prime.length; i++){
            if(!prime[i]){
                for(int j=i*i ; j < prime.length ; j+=i) prime[j] = true;
            }
        }
    }
}
