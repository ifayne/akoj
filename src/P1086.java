import java.util.Scanner;

public class P1086 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			long n = cin.nextLong();
			solve(n);
		}
		cin.close();
	}

	private static void solve(long n) {
		System.out.println(Long.parseLong(f(n), 2));
	}

	private static String f(long n) {
		char a[] = Long.toBinaryString(n).toCharArray();
		char b[] = new char[a.length];
		for (int i=a.length-1, count = 0; i>=0; i--, count++)
			b[count] = a[i];
		return new String(b);
	}
}
