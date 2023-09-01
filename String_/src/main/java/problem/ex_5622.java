package problem;

import java.util.Scanner;

public class ex_5622 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		int sum=0;
		
		for(int i=0; i<str.length(); i++) {
			sum += calMinute(str.charAt(i));
		}
		
		System.out.println(sum);
	}

	private static int calMinute(char charAt) {
		String[] diar = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };
		int index = -1;

		for(int i=0; i<diar.length; i++){
			for(int j=0; j<diar[i].length(); j++){
				if(diar[i].charAt(j) == charAt)	{
					index = i;
					break;
				}
			}
		}

		return index+3;
	}

}
