import java.util.Scanner;

public class P1318 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int t = cin.nextInt();
			while (t-- > 0) {
				int n = cin.nextInt();
				System.out.println(f(n));
			}
		}
		cin.close();
	}

	private static int f(int n) {
		int sum = 1;
		for (int i=1; i<n; i++){
			sum += (i + 1)*Cnm(n-1, i);
		}
		return sum;
	}

	private static long Cnm(int n, int m) {
		return fun(n)/fun(n-m)/fun(m);
	}

	private static long fun(int m) {
		long k = 1;
		for (int i=1; i<=m; i++)
			k *= i;
		return k;
	}
}
