package Problem;

public class ex_25314 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = new java.util.Scanner(System.in).nextInt();
		
		while(n>=4) {
			if(n==4) System.out.print("long int");
			else System.out.print("long ");
			n-=4;
		}
	}

}
