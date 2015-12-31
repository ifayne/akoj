import java.util.Scanner;

public class P1270 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt(), m = cin.nextInt();
			if (n == 0 && m == 0)
				break;
			System.out.printf("%.0f\n", Cnm(n + m, n));
		}
		cin.close();
	}

	private static double Cnm(int n, int m) {
		int min = (n - m) <= m ? n - m : m;
		int max = (n - m) > m ? n - m : m;
		return g(n, max + 1) / f(min);
	}

	private static double g(int n, int m) {
		double k = 1.0;
		for (int i = n; i >= m; i--)
			k *= i;
		return k;
	}

	private static double f(int n) {
		double k = 1.0;
		for (int i = 1; i <= n; i++)
			k *= i;
		return k;
	}
}
