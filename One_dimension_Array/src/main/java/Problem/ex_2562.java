package Problem;

import java.util.Scanner;

public class ex_2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int max=0;
		int index=0;
		int count=0;
		String temp;
		while(count<9) {
			temp = scan.nextLine();
			if(temp.equals(""))	break;
			
			if(max<Integer.parseInt(temp)) {
				max = Integer.parseInt(temp);
				index = count;
			}
			count++;
		}
		System.out.println(max+"\n"+(index+1));
		
	}

}
