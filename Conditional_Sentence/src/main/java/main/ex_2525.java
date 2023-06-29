package main;

import java.util.Scanner;

public class ex_2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int start_hour = scan.nextInt();
		int start_min = scan.nextInt();
		int cook_min = scan.nextInt();
		
		
		//mycode
		start_min += cook_min;
//		if(start_min >=60) {
//			start_hour += start_min/60;
//			start_min %= 60;
//			start_hour %= 24;
//		}
//		System.out.println(start_hour +" " + start_min);
		
		//short code
		if(start_min >=60) start_hour += start_min/60;
		System.out.println(start_hour%24 +" " + start_min%60);
		
	}

}
