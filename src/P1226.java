import java.util.Scanner;

public class P1226 {
	public static void main(String[] args) {
		Scanner cin  = new Scanner(System.in);
		long n = cin.nextLong();
		long m = cin.nextLong();
		System.out.println(Cnm(n, m));
		cin.close();
	}

	private static long Cnm(long n, long m) {
		return f(n)/(f(n-m)*f(m));
	}

	private static long f(long m) {
		// TODO Auto-generated method stub
		long k = 1;
		for (long i=1; i<=m; i++){
			k *= i;
		}
		return k;
	}
}
