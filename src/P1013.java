
import java.util.Scanner;

public class P1013 {
	static Scanner cin = new Scanner(System.in);

	public static void main(String[] args) {
		while (cin.hasNext()) {
			int a1 = cin.nextInt();
			int b1 = cin.nextInt();
			int a2 = cin.nextInt();
			int b2 = cin.nextInt();
			int sum = 1;
			for (; sum <= a1 / gcd(a1, a2) * a2; sum++) {
				if (sum % a1 == b1 && sum % a2 == b2) {
					break;
				}
			}
			System.out.println(sum);
		}
		cin.close();
	}

	private static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}
