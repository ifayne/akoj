import java.util.Scanner;

public class P1031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0) {
			int n = cin.nextInt();
			int a[] = new int[n], sum = 0;
			for (int i = 0; i < n; i++) {
				a[i] = cin.nextInt();
				if (isPrime(a[i])) {
					sum += a[i];
				}
			}
			System.out.println(sum);
		}
		cin.close();
	}

	private static boolean isPrime(int n) {
		// TODO Auto-generated method stub
		if (n == 1)
			return false;
		else {
			for (int i = 2; i * i <= n; i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

}
