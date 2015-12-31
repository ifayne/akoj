import java.util.Scanner;

public class P1198 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			System.out.println(f(n));
		}
		cin.close();
	}

	private static int f(int n) {
		return n == 1 ? 0 : n == 2 ? 1 : (n - 1) * (f(n - 1) + f(n - 2));
	}
}
