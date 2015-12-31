import java.util.Scanner;

public class P1317 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			if (n == 0)
				break;
			System.out.println(f(n) * 2);
		}
		cin.close();
	}

	private static int f(int n) {
		return n <= 2 ? n : f(n - 1) + f(n - 2);
	}
}
