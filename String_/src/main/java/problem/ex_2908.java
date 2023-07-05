package problem;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ex_2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(scan.nextLine()," ");
		String num1 = st.nextToken();
		String num2 = st.nextToken();
		String max = null;
		
		for(int i=2; i>=0; i--) {
			if(num1.charAt(i)==num2.charAt(i)) continue;
			else if(num1.charAt(i)>num2.charAt(i)) {
				max = num1;
				break;
			}
			else {
				System.out.println("else");
				max = num2;
				break;
			}
		}
		if(max!=null) {
			for(int i=2; i>=0; i--) System.out.print(max.charAt(i));
		}
	}

}
