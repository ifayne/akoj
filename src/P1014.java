import java.util.Scanner;

public class P1014 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int a = n / 2, b = n / 2;
			while (!isPrime(a) || !isPrime(b)) {
				a--;
				b++;
			}
			System.out.println(a + " " + b);
		}
		cin.close();
	}

	private static boolean isPrime(int n) {
		if (n == 1)
			return false;
		else {
			for (int i = 2; i * i <= n; i++) {
				if (n % i == 0)
					return false;
			}
		}
		return true;
	}

}
