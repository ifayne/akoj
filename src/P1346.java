import java.util.Scanner;

public class P1346 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			if (n % 2 == 0) {
				f(n);
			} else {
				g(n);
			}
		}
		cin.close();
	}

	private static void g(int n) {
		double sum = 0;
		for (int i = 1; i <= n; i += 2) {
			sum += (1 / (double) i);
		}
		System.out.println(String.format("%.6f", sum));

	}

	private static void f(int n) {
		// TODO Auto-generated method stub
		double sum = 0;
		for (int i = 2; i <= n; i += 2) {
			sum += (1 / (double) i);
		}
		System.out.println(String.format("%.6f", sum));
	}
}
