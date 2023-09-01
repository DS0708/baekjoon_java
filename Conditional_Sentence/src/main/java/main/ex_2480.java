package main;

import java.util.Scanner;

public class ex_2480 {		//I don't Know why this code is wrong ; ; ; ;;; then pass!

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int first = scan.nextInt(), second = scan.nextInt(), third = scan.nextInt();
		
//		if(first != second && second != third && first != third) {	//All different
////			System.out.println(max(first,second,third)*100);
//			int max;
//			if(first>second) {®
//				if (first>third) max = first;
//				else max=third;
//			}else {
//				if(second>third) max = second;
//				else max=third;
//			}
//			System.out.println(max*100);
//		}else {		//at least one same pair
//			if(first == second && first == third && second == third) System.out.println(10000+first*100);
//			else {
//				if(first==second || first == third)System.out.println(1000+first*100);
//				else System.out.println(1000+second*100);
//			}
//		}
		
		
		if(first==second && first==third) System.out.println(10000+1000*first);
		else if (first == second || first == third) System.out.println(1000 + 100*first);
		else if (second == third) System.out.println(1000+ 100*second);
		else {
			int max;
			if(first>second) {
				if (first>third) max = first;
				else max=third;
			}else {
				if(second>third) max = second;
				else max=third;
			}
			System.out.println(max*100);
		}
		
	}
	

}
