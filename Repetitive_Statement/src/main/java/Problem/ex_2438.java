package Problem;

public class ex_2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = new java.util.Scanner(System.in).nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
