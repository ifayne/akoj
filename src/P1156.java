import java.util.Scanner;

public class P1156 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			String string = cin.next();
			Scanner in = new Scanner(string);
			in.useDelimiter("[/+-]+");
			int a1 = in.nextInt();
			int b1 = in.nextInt();
			int a2 = in.nextInt();
			int b2 = in.nextInt();
			int b = lcm(b1, b2);
			if (string.contains("+")){
				int a = b / b1 * a1 + b / b2 * a2;
				double result = (double)a1 / (double)b1 + (double)a2 / (double)b2;
				if (result < 0)
					System.out.print("-");
				solve(a, b);
			}else if (string.contains("-")){
				double result = (double)a1 / (double)b1 - (double)a2 / (double)b2;
				if (result < 0)
					System.out.print("-");
				int a = b / b1 * a1 - b / b2 * a2;
				solve(a, b);
			}
			in.close();
		}
		cin.close();
	}

	private static void solve(int a, int b) {
		a = a < 0 ? -a : a;
		b = b < 0 ? -b : b;
		int t = gcd(a, b);
		a /= t;
		b /= t;
		if (a != 0 && b != 1)
			System.out.println(a+"/"+b);
		else if (b == 1 && a != 0)
			System.out.println(a);
		else if (a == 0)
			System.out.println("0");
	}

	private static int lcm(int a, int b) {
		a = a < 0 ? -a : a;
		b = b < 0 ? -b : b;
		return a * b / gcd(a, b);
	}

	private static int gcd(int a, int b) {
		a = a < 0 ? -a : a;
		b = b < 0 ? -b : b;
		return b == 0 ? a : gcd(b, a % b);
	}
}
