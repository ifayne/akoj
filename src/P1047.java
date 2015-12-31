import java.util.Arrays;
import java.util.Scanner;

public class P1047 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int a[] = new int[n];
		int p = cin.nextInt();
		for (int i = 0; i < n; i++) {
			a[i] = cin.nextInt();
		}
		Arrays.sort(a);

		if (p == 0) {
			for (int i = 0; i < n; i++) {
				System.out.println(a[i]);
			}
		} else {
			for (int i = n - 1; i > 0; i--) {
				System.out.println(a[i]);
			}
		}
		cin.close();
	}
}
