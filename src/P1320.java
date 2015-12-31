import java.util.Scanner;

public class P1320 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int cnt = 0;
		while (cin.hasNext()) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			System.out.printf("Case %%%d:",++cnt);
			int count = 0;
			for (int i=a; i<=b; i++)
				if (isPrime(i))
					count++;
			System.out.printf("%d\n", count);
		}
		cin.close();
	}

	private static boolean isPrime(int n) {
		if (n == 0 || n == 1) return false;
		for (int i=2; i*i<=n; i++)
			if (n % i == 0)
				return false;
		return true;
	}

}
