package problem;

import java.util.StringTokenizer;

public class ex_1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new java.util.Scanner(System.in).nextLine();
		int count =0;
		StringTokenizer st = new StringTokenizer(str," ");
		while(st.hasMoreElements()) {
			count++;
			st.nextToken();
		}
		System.out.println(count);
	}

}
