package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex_27866_ {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//27866
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String str = br.readLine();
//		int n = Integer.parseInt(br.readLine());
//		
//		System.out.println(str.charAt(n-1));
		
		//2743
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String str = br.readLine();
//		System.out.println(str.length());
		
		//9086
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
//		for(int i=0; i<n ; i++) {
//			String str = br.readLine();
//			System.out.print(str.charAt(0)+""+str.charAt(str.length()-1)+"\n");
//		}
		
		//11654
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		char ch = br.readLine().charAt(0);
//		System.out.println((int)ch);
		
		//11720
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int n = Integer.parseInt(br.readLine());
//		String str = br.readLine();
//		int sum=0;
//		for(int i=0; i<n; i++) {
//			sum += (int)(str.charAt(i)-48);
//		}
//		System.out.println(sum);
		
		//10809
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] arr = new int[26];
		
		//System.out.println((int)'a');
		
		for(int i=0; i < arr.length; i++) arr[i] = -1;
		
		for(int i=0; i<str.length(); i++) {
			int index = (int)str.charAt(i);
			if(arr[index-97]==-1)	arr[index-97] = i;
		}
		
		for(int i=0; i<arr.length; i++) System.out.print(arr[i]+" ");
	}

}
