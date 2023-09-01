package main;

import java.util.Scanner;

public class ex_129881 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);		//Don't use duplicate Scanner
		int x= scan.nextInt();
		int y= scan.nextInt();
		
		
		if (x*y > 0) {
			if(x>0) System.out.println(1);
			else System.out.println(3);
		}else {
			if(x>0) System.out.println(4);
			else System.out.println(2);
		}
	}

}
