import java.util.Arrays;
import java.util.Scanner;

public class P1160 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int m = cin.nextInt();
			if (n == 0 && m == 0)
				break;
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = cin.nextInt();
			}
			Arrays.sort(a);
			System.out.print(a[n - 1]);
			for (int i = n - 2; i >= n - m; i--) {
				System.out.print(" " + a[i]);
			}
			System.out.println();
		}
		cin.close();
	}
}
