package Problem;

import java.util.Scanner;

public class ex_10807 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] int_arr = new int[n];
		
		for(int i=0; i<n; i++) {
			int_arr[i] = scan.nextInt();
		}
		
		int key = scan.nextInt();
		int count=0;
		
		for(int i=0; i<n; i++) {
			if(int_arr[i]==key) count++;
		}
		
		System.out.println(count);
	}

}
