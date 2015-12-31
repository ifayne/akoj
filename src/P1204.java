
import java.util.Scanner;

public class P1204 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int m = cin.nextInt();
			int n = cin.nextInt();
			int a[] = new int[m];
			int b[] = new int[n];
			for (int i = 0; i < m; i++) {
				a[i] = cin.nextInt();
			}
			for (int i = 0; i < n; i++) {
				b[i] = cin.nextInt();
			}
			int count = 0;
			for (int i = 0; i < m && i < n; i++) {
				if (a[i] == b[i]) {
					count++;
				}
			}
			System.out.println(count);
		}
		cin.close();
	}
}
