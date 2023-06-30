package Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex_10810 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");	
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		int[] int_arr = new int[n];
		
		for(int i=0; i<m ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int input_ball = Integer.parseInt(st.nextToken());
			for(int j=start-1; j<end; j++) {
				int_arr[j] = input_ball;
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(int_arr[i]+" ");
		}
	}

}
