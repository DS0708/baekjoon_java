package Problem;

import java.util.ArrayList;
import java.util.Scanner;

public class ex_10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int key = scan.nextInt();
		
		
		for(int i=0; i<n; i++) {
			int val = scan.nextInt();
			if(val < key) System.out.print(val+" ");;
		}
		
	}

}
