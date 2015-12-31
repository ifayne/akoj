import java.util.Scanner;

public class P1061 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int a = cin.nextInt();
			int result = a;
			for (int i = 1; i < n; i++) {
				int temp = cin.nextInt();
				result = a * temp / gcd(a, temp);
				a = result;
			}
			System.out.println(result);
		}
		cin.close();
	}

	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		if (a == 0)
			return b;
		else
			return gcd(b % a, a);
	}
}
