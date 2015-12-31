import java.util.Scanner;

public class P1215 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext())
		{
			int n = cin.nextInt();
			if (n == 0) break;
			System.out.println(f(n));
		}
		cin.close();
	}

	private static int f(int n) {

		int count = 0, sum = 0;
		for ( int i=2; i<=n; i++){
			sum = 0;
			if (isPrime(i)){
				for (int j=i; j<=n; j++){
					if (isPrime(j))
						sum += j;
					if (sum == n){
						count++;
						break;
					}if (sum > n){
						break;
					}
				}
			}
		}
		return count;
	}

	private static boolean isPrime(int n) {
		if (n == 0 || n == 1) return false;
		for ( int i=2; i*i<=n; i++){
			if ( n  % i == 0) 
				return false;
		}
		return true;
	}
}
