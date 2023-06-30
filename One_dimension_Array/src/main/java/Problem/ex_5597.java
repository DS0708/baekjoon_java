package Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex_5597 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[30];
		
		for(int i=0; i<28; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[num-1] = 1;
		}
		
		for(int i=0; i<30; i++) {
			if(arr[i]==0)	System.out.println(i+1);
		}
	}

}
