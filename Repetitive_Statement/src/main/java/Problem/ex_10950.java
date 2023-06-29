package Problem;
import java.util.Scanner;

public class ex_10950 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] sum_arr;
		int n = scan.nextInt();
		
		sum_arr = new int[n];
		
		for(int i=0; i < n ; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			sum_arr[i] = a+b;
		}
		
		for(int i=0; i < sum_arr.length; i++) {
			System.out.println(sum_arr[i]);
		}
		
	}

}
