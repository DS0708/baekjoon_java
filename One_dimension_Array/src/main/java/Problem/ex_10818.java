package Problem;

import java.util.*;

public class ex_10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		//max, min		Complexity = O(3n) = O(n)
		int[] int_arr = new int[n];
		for(int i=0; i<n; i++) {
			int_arr[i] = scan.nextInt();
		}
		//max
		for(int i=0; i< int_arr.length-1; i++) {
			if(int_arr[i] > int_arr[i+1])	swap(int_arr,i,i+1);
		}
		int max = int_arr[n-1];
		//min
		for(int i=n-2; i>0; i--) {
			if(int_arr[i] < int_arr[i-1]) swap(int_arr,i,i-1);
		}
		int min = int_arr[0];
		
		System.out.println(min + " " + max);
		
		//insert sorting		complexity = O(n^2)
//		List<Integer> il = new LinkedList<>();
//		
//		for(int i=0; i<n; i++) {
//			if(i==0) {
//				il.add(scan.nextInt());
//				continue;
//			}
//			int temp = scan.nextInt();
//			int index=i;
//			for(int j=0; j<i ; j++) {
//				if(temp < il.get(j)) {
//					index = j;
//					break;
//				}
//			}
//			il.add(index,temp);
//		}
//		System.out.println(il.get(0)+" "+il.get(n-1));
		
		
	}

	private static void swap(int[] int_arr, int i, int j) {
		// TODO Auto-generated method stub
		if(i>= int_arr.length || j>= int_arr.length)	return;
		
		int temp = int_arr[i];
		int_arr[i] = int_arr[j];
		int_arr[j] = temp;
	}

	
	

}
