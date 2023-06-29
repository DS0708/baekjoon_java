package Problem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex_15552_R_Use_ExcutionTime {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//long beforeTime = System.currentTimeMillis();		//unit : milly sec
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = bf.readLine();
		int t = Integer.parseInt(s);		//	=	int t = Integer.parseInt(bf.readLine());
		//String[] t_arr = new String[t];
		
		for(int i=0; i<t; i++) {
			String temp_str = bf.readLine();
			StringTokenizer st = new StringTokenizer(temp_str);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			//t_arr[i] = String.valueOf(a+b);
			bw.write(String.valueOf(a+b)+'\n');			//use buffer
		}
		bw.flush();
//		for(int i=0; i<t; i++) {				//this code demand more excution time
//			bw.write(t_arr[i]+'\n');
//			bw.flush();
//		}
		
		
		
//		long afterTime = System.currentTimeMillis();
//		long secdiffTime = (afterTime-beforeTime);		//unit : sec
//		System.out.println("Excution time : "+ secdiffTime);
		
		bw.close();
	}

}
