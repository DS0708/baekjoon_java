package Problem;

import java.util.Scanner;

public class ex_25304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		long total = scan.nextLong();
		int n = scan.nextInt();
		long my_total=0l;
		
		for(int i=0 ; i<n; i++) {
			long a= scan.nextLong();
			long b= scan.nextLong();
			my_total += a*b;
		}
		
		if(total == my_total) System.out.println("Yes");
		else System.out.println("No");
		
		scan.close();
	}

}
