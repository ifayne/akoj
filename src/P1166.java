import java.util.Scanner;

public class P1166 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int n = cin.nextInt();
			if (n == 0)
				break;
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = cin.nextInt();
			}
			int min = a[0], t, j = 0;
			for (int i = 1; i < n; i++) {
				if (a[i] < min) {
					min = a[i];
					j = i;
				}
			}
			t = a[0];
			a[0] = a[j];
			a[j] = t;
			System.out.print(a[0]);
			for (int i = 1; i < n; i++) {
				System.out.print(" " + a[i]);
			}
			System.out.println();

		}
		cin.close();
	}
}
