package main;

public class ex_2735 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = new java.util.Scanner(System.in).nextInt();
		int output=0 ;
		if(year%400==0) {
			output = 1;
		}else if (year%4==0 && year%100!=0) output = 1;
		
		System.out.println(output);
	}

}
