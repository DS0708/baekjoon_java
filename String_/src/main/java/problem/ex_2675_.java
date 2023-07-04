package problem;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ex_2675_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int t = Integer.parseInt(scan.nextLine());
		for(int i=0; i<t; i++) {
			String str = scan.nextLine();
			StringTokenizer st = new StringTokenizer(str," ");
			int r = Integer.parseInt(st.nextToken());
			str = st.nextToken();
			StringBuilder sb = new StringBuilder();
			for(int j=0; j<str.length(); j++) {
				for(int k=0; k<r; k++) sb.append(str.charAt(j));
			}
			System.out.println(sb);
		}
	}

}
