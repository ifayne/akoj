import java.util.Scanner;

public class P1207 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			if (f(a) == b && a == f(b))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		cin.close();
	}

	private static int f(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0)
				sum += i;
		}
		return sum;
	}
}
