import java.util.Scanner;

public class P1229 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext())  {
			int n = cin.nextInt();
			if (n == 0) 
				break;
			if (isPrime(n) || n == 1)
				System.out.print(n);
			else {
				boolean first = true;
				for (int i=2; ; i++) {
					if (isPrime(i)){
						while (n % i == 0 && n != 1) {
							if (first) {
								System.out.print(i);
								first = false;
							}
							else 
								System.out.print("*"+i);
							n /= i;
						}
					}
					if (n == 1) break;
				}
			}
			System.out.println();
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
