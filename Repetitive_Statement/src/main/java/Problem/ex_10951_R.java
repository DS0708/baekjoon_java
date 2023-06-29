package Problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ex_10951_R {
	private static final String NEW_LINE = "\n";
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Use Scanner
		Scanner scan = new Scanner(System.in);
		
		while(scan.hasNext()) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println(a+b);
		}
		
		scan.close();
		
		//Use BufferReader
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		String temp;
//		while( ( temp = br.readLine() ) != null ) {
//			StringTokenizer st = new StringTokenizer(temp," ");
//			int a = Integer.parseInt(st.nextToken());
//			int b = Integer.parseInt(st.nextToken());
//			sb.append(a+b).append(NEW_LINE);
//		}
//		
//		System.out.println(sb);
		
	}

}
