import java.util.Arrays;
import java.util.Scanner;

public class P1211 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = cin.nextInt();
		}
		Arrays.sort(a);
		int count = 1, i;
		for (i = 1; i < n; i++) {
			if (a[i] != a[i - 1]) {
				System.out.println(a[i - 1] + " " + count);
				count = 1;
			} else
				count++;
		}
		System.out.println(a[n - 1] + " " + count);

		cin.close();
	}
}
