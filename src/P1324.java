import java.util.Arrays;
import java.util.Scanner;

public class P1324 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = cin.nextInt();
			}
			Arrays.sort(a);
			boolean can = false;
			for (int i = n - 1; i >= 2; i--) {
				for (int j = i - 1; j >= 1; j--) {
					for (int k = j - 1; k >= 0; k--) {
						if (is(a[i], a[j], a[k])) {
							System.out.println(a[i] + a[j] + a[k]);
							can = true;
							break;
						}
					}
					if (can)
						break;
				}
				if (can)
					break;
			}
			if (!can)
				System.out.println("0");
		}
		cin.close();
	}

	private static boolean is(int a, int b, int c) {
		// TODO Auto-generated method stub
		if (a + b > c && Math.abs(a - b) < c)
			return true;
		return false;
	}
}
