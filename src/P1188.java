import java.util.Arrays;
import java.util.Scanner;

public class P1188 {
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
			Arrays.sort(a);
			if (n % 2 == 1)
				System.out.println(a[n / 2]);
			else
				System.out.println((a[n / 2] + a[n / 2 - 1]) / 2);
		}
		cin.close();
	}
}
