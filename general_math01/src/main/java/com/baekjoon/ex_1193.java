package com.baekjoon;

public class ex_1193 {
    public static void main(String[] args) {
        int sum = 2;
        int progress = 1;

        int x = new java.util.Scanner(System.in).nextInt();

        while(true){
            if(x<=progress) break;

            progress += sum;
            sum++;
        }

        int son = sum - 1 - (progress-x);
        int parent = sum - son;

        if(sum%2==1){
            System.out.println(son+"/"+parent);
        }else {
            System.out.println(parent+"/"+son);
        }

    }
}
