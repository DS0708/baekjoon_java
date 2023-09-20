package com.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class ex_3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Boolean> x_Map = new HashMap<>();
        Map<Integer, Boolean> y_Map = new HashMap<>();

        for (int i=0 ; i<3 ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if(!x_Map.containsKey(x)){
                x_Map.put(x,true);
            }else{
                x_Map.replace(x,false);
            }

            if(!y_Map.containsKey(y)){
                y_Map.put(y,true);
            }else{
                y_Map.replace(y,false);
            }
        }

        for(int i : x_Map.keySet()){
            if(x_Map.get(i)==true) System.out.print(i+" ");
        }
        for(int i : y_Map.keySet()){
            if(y_Map.get(i)==true) System.out.print(i+" ");
        }
    }
}
