package com.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ex_14215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> side_list = new ArrayList<>();

        side_list.add(Integer.parseInt(st.nextToken()));
        side_list.add(Integer.parseInt(st.nextToken()));
        side_list.add(Integer.parseInt(st.nextToken()));

        Collections.sort(side_list,Collections.reverseOrder());

        if(side_list.get(0) < side_list.get(1) + side_list.get(2)) {
            System.out.println(side_list.get(0) + side_list.get(1) + side_list.get(2));
        }else {
            System.out.println((side_list.get(1)+side_list.get(2))*2-1);
        }

    }
}
