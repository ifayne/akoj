import java.util.Scanner;

public class P1170 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0) {
			String aString = cin.next();
			System.out.println(f(aString));
		}
		cin.close();
	}

	private static int f(String aString) {
		char a[] = aString.toCharArray();
		int k = a.length;
		while (k != 0) {
			for (int i = 0; i < k; i++) {
				if (a[i] != a[k - 1 - i] || k == 1 || k % 2 == 1) {
					return k;
				}
			}
			k /= 2;
		}
		return -1;
	}
}
