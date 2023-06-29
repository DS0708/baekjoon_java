package Problem;

import java.util.ArrayList;
import java.util.Scanner;

public class ex_11021_11022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long beforeTime = System.currentTimeMillis();		//unit : milly sec
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr_result = new int[n];
		
		ArrayList<String> str_list = new ArrayList<>();
		
		
		for(int i=0; i<n ; i++) {
//			arr_result[i] = scan.nextInt() + scan.nextInt();
			int val_1 = scan.nextInt();
			int val_2 = scan.nextInt();
			String temp = "Case #"+(i+1)+": "+ val_1 + " + "+val_2+" = "+(val_1+val_2);
			str_list.add(temp);
		}
		
//		for(int j=0; j<n; j++) {
//			System.out.println("Case #"+(j+1)+": "+arr_result[j]);
//		}
		for(int j=0; j<str_list.size(); j++) {
			System.out.println(str_list.get(j));
		}
		
		long afterTime = System.currentTimeMillis();
		long secdiffTime = (afterTime-beforeTime);		//unit : sec
		System.out.println("Excution time : "+ secdiffTime);
	}

}
