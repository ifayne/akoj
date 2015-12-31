import java.util.Scanner;

public class P1167 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = cin.nextInt();
			}
			int m = a[0], max = a[0];
			for (int i = 0; i < n - 2; i += 3) {
				if (i / 3 % 2 == 1) {
					m = min(a[i], a[i + 1], a[i + 2]);
				} else
					m = max(a[i], a[i + 1], a[i + 2]);
				if (max < m)
					max = m;
			}
			System.out.println(max);
		}
		cin.close();
	}

	private static int max(int i, int j, int k) {
		return i > j ? i > k ? i : k : j > k ? j : k;
	}

	private static int min(int i, int j, int k) {
		return i < j ? i < k ? i : k : j < k ? j : k;
	}
}
