package com.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class ex_5086 {
    public static void main(String[] args) throws IOException {
        String[] res = {"factor", "multiple", "neither"};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int first_num = Integer.parseInt(st.nextToken());
            int second_num = Integer.parseInt(st.nextToken());

            if (first_num == 0 && second_num == 0) break;

            if (first_num % second_num == 0) bw.append(res[1] + "\n");
            else if (second_num % first_num == 0) bw.append(res[0] + "\n");
            else bw.append(res[2]+"\n");
        }


        bw.flush();

        bw.close();
        br.close();
}
}
