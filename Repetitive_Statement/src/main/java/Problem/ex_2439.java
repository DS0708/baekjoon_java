package Problem;

public class ex_2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = new java.util.Scanner(System.in).nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=1; j--) {
				if(j<=i)	System.out.print("*");
				else	System.out.print(" ");
			}
			System.out.println();
		}
	}

}
