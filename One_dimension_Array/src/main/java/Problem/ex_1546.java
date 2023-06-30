package Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex_1546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		double[] score = new double[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int max=0;
		for(int i=0; i<n; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(max<num) max = num;
			score[i] = num;
		}
		
		double sum=0;
		for(int i=0; i<n; i++) {
			sum += score[i]/max*100;
		}
		
		
		System.out.println(sum/n);
		
	}

}
