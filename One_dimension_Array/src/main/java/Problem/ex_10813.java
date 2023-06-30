package Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex_10813 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = i+1;
		}
		
		for(int i=0; i<m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int f_idx = Integer.parseInt(st.nextToken())-1;
			int s_idx = Integer.parseInt(st.nextToken())-1;
			swap(arr,f_idx,s_idx);
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void swap(int[] arr, int f_idx, int s_idx) {
		// TODO Auto-generated method stub
		int temp = arr[f_idx];
		arr[f_idx] = arr[s_idx];
		arr[s_idx] = temp;
	}

}
