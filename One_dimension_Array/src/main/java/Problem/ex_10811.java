package Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex_10811 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str1 = br.readLine().split(" ");
		int n = Integer.parseInt(str1[0]);
		int m = Integer.parseInt(str1[1]);
		int[] arr = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i=0; i<m; i++) {
			String[] str2 = br.readLine().split(" ");
			int idx1 = Integer.parseInt(str2[0])-1;
			int idx2 = Integer.parseInt(str2[1])-1;
			reverse(arr,idx1,idx2);
		}
		
		for(int i=0; i< arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void reverse(int[] arr, int idx1, int idx2) {
		// TODO Auto-generated method stub
		int count = idx1;
		int[] arr_temp = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			arr_temp[i] = arr[i];
		}
		for(int i=idx2; i>=idx1; i--) {
			arr[i] = arr_temp[count++];
		}
	}

}
