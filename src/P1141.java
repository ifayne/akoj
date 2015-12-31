import java.util.Scanner;

public class P1141 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while ( t-- > 0 ){
			int n = cin.nextInt();
			int m = cin.nextInt();
			int sum = 0;
			for ( int i=1; i<=n; i++ ){
				sum += (i % m);
			}
			System.out.println(sum);
		}
		cin.close();
	}

}
