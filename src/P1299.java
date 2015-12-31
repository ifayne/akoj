import java.util.Scanner;

public class P1299 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		while ( cin.hasNext() ){
			int n = cin.nextInt();
			int a[] = new int[n];
			for ( int i=0; i<n; i++ ){
				a[i] = cin.nextInt();
			}
			int count = 0;
			for ( int i=0; i<n-1; i++ ){
				for ( int j = i+1; j<n; j++ ){
					if ( gcd(a[i], a[j]) == 1 ){
						count++;
					}
				}
			}
			System.out.println(count);
		}
		cin.close();
	}

	private static int gcd(int i, int j) {
		// TODO Auto-generated method stub
		if ( i == 0 ) return j;
		else return gcd(j%i, i);
	}

}
