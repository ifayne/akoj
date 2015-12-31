import java.util.Scanner;

public class P1009 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0) {
			int a = cin.nextInt();
			int b = cin.nextInt();
			System.out.println(gcd(a, b)+" "+lcm(a, b));
		}
		cin.close();
	}

	private static int lcm(int a, int b) {
		return a/gcd(a, b)*b;
	}
	
	private static int gcd(int a, int b) {
			return a == 0 ? b : gcd(b % a, a);
	}
}
