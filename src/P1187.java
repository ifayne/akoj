import java.util.Scanner;

public class P1187 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int k = cin.nextInt();
		boolean a[] = new boolean[n+1];
		for ( int i=1; i<=k; i++ ){
			for ( int j=1; j<=n; j++ ){
				if ( j % i == 0 ){
					a[j] = !a[j];
				}
			}
		}
		for ( int i=1; i<=n; i++ ){
			if ( a[i] ){
				System.out.print(i+" ");
			}
		}
		System.out.println();
		cin.close();
	}

}
