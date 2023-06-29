package Problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex_11022_Use_StringBuilder {
	
	private static final String NEW_LINE = "\n";

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		long beforeTime = System.currentTimeMillis();		//unit : milly sec
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());  		//must add throws
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int first_val = Integer.parseInt(st.nextToken());
			int second_val = Integer.parseInt(st.nextToken());
			int sum = first_val + second_val;
			sb.append("case #").append(i+1).append(": ").append(first_val + " + "+ second_val + " = "+ sum).append(NEW_LINE);
		}
		
		String result = sb.toString();
		bw.write(result);
		bw.flush();
		
		long afterTime = System.currentTimeMillis();
		long secdiffTime = (afterTime-beforeTime);		//unit : sec
		System.out.println("Excution time : "+ secdiffTime);
		
		bw.close();
	}

}
