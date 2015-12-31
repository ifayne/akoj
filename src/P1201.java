import java.util.Arrays;
import java.util.Scanner;

public class P1201 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t = cin.nextInt();
		while (t-- > 0) {
			int n = cin.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = cin.nextInt();
			}
			Arrays.sort(a);

			int cnt = 1, max = 1;
			for (int i = 1; i < n; i++) {
				if (a[i] == a[i - 1]) {
					cnt++;
				} else
					cnt = 1;
				if (cnt > max) {
					max = cnt;
				}
			}
			System.out.println(max);
		}
		cin.close();
	}
}
