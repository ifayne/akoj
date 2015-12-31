import java.util.Scanner;

public class P1134 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int a = cin.nextInt();
		int b = cin.nextInt(), count = 0;
		for ( int i=a; i<=b; i++ ){
			if ( isPrime(i) ){
				count++;
			}
		}
		System.out.println(count);
		cin.close();
	}

	private static boolean isPrime(int n) {
		// TODO Auto-generated method stub
		if ( n == 0 || n == 1 )
			return false;
		else if ( n == 2 ) return true;
		else {
			for ( int i=2; i*i<=n; i++ ){
				if ( n % i == 0 ) {
					return false;
				}
			}
		}
		return true;
	}

}
